<?php
session_start();

if (!isset($_SESSION["admin"])) {
    header("Location: adminlogin.php");
    exit();
}

require '../vendor/autoload.php';

$client = new MongoDB\Client("mongodb://localhost:27017");

$dbName = 'CRUD';
$collectionName = 'outpasses';
$collection = $client->$dbName->$collectionName;

if ($_SERVER["REQUEST_METHOD"] == "POST" && isset($_POST["delete"])) {
    $outpassId = $_POST["outpass_id"];
    $collection->deleteOne(["_id" => new MongoDB\BSON\ObjectID($outpassId)]);
}

if ($_SERVER["REQUEST_METHOD"] == "POST" && isset($_POST["accept"])) {
    $outpassId = $_POST["outpass_id"];
}

$outpasses = $collection->find();
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Outpass Requests</title>
    <link rel="stylesheet" href="./css/bootstrap.min.css">
    <style>
        .container {
            margin-top: 100px;
        }
        .table-container {
            margin-top: 50px;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="row justify-content-center">
            <h1>Outpass Requests</h1>
        </div>
        <a href="admindashboard.php" class="btn btn-primary">Go to Admin Dashboard</a>
        <div class="row table-container">
            <div class="col-md-10 offset-md-1">
                <table class="table table-bordered">
                    <thead>
                        <tr>
                            <th>Username</th>
                            <th>Reason</th>
                            <th>Departure Date</th>
                            <th>Arrival Date</th>
                            <th>Departure Time</th>
                            <th>Arrival Time</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>
                        <?php foreach ($outpasses as $outpass): ?>
                            <tr>
                                <td><?php echo $outpass["username"]; ?></td>
                                <td><?php echo $outpass["reason"]; ?></td>
                                <td><?php echo $outpass["departure_date"]; ?></td>
                                <td><?php echo $outpass["arrival_date"]; ?></td>
                                <td><?php echo $outpass["departure_time"]; ?></td>
                                <td><?php echo $outpass["arrival_time"]; ?></td>
                                <td>
                                    <form method="POST" action="<?php echo $_SERVER['PHP_SELF']; ?>">
                                        <input type="hidden" name="outpass_id" value="<?php echo $outpass["_id"]; ?>">
                                        <button type="submit" name="delete" class="btn btn-danger btn-sm">Delete</button>
                                        <button type="submit" name="accept" class="btn btn-success btn-sm">Accept</button>
                                    </form>
                                </td>
                            </tr>
                        <?php endforeach; ?>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>
</html>
