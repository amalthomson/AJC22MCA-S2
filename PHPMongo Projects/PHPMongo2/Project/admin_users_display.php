<?php
session_start();

if (!isset($_SESSION["admin"])) {
    header("Location: adminlogin.php");
    exit();
}

require '../vendor/autoload.php';

$client = new MongoDB\Client("mongodb://localhost:27017");

$dbName = 'CRUD';
$collectionName = 'users';
$collection = $client->$dbName->$collectionName;

if ($_SERVER["REQUEST_METHOD"] == "POST" && isset($_POST["delete"])) {
    $userId = $_POST["user_id"];
    $collection->deleteOne(["_id" => new MongoDB\BSON\ObjectID($userId)]);
}

$users = $collection->find();
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Diaplay Users</title>
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
            <h1>Display Users</h1>
        </div>
        <a href="admindashboard.php" class="btn btn-primary">Go to Admin Dashboard</a>
        <div class="row table-container">
            <div class="col-md-10 offset-md-1">
                <table class="table table-bordered">
                    <thead>
                        <tr>
                            <th>Username</th>
                            <th>Name</th>
                            <th>Email</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>
                        <?php foreach ($users as $user): ?>
                            <tr>
                                <td><?php echo $user["username"]; ?></td>
                                <td><?php echo $user["name"]; ?></td>
                                <td><?php echo $user["email"]; ?></td>
                                <td>
                                    <form method="POST" action="<?php echo $_SERVER['PHP_SELF']; ?>">
                                        <input type="hidden" name="user_id" value="<?php echo $user["_id"]; ?>">
                                        <button type="submit" name="delete" class="btn btn-danger btn-sm">Delete</button>
                                        <a href="admin_user_update.php?user_id=<?php echo $user["_id"]; ?>" class="btn btn-primary btn-sm">Update</a>
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
