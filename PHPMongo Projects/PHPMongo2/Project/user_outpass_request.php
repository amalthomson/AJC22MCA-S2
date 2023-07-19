<?php
session_start();

if (!isset($_SESSION["username"])) {
    header("Location: userlogin.php");
    exit();
}

require '../vendor/autoload.php';

$client = new MongoDB\Client("mongodb://localhost:27017");

$dbName = 'CRUD';
$collectionName = 'outpasses';
$collection = $client->$dbName->$collectionName;

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $username = $_SESSION["username"];
    $reason = $_POST["reason"];
    $departureDate = $_POST["departure_date"];
    $arrivalDate = $_POST["arrival_date"];
    $departureTime = $_POST["departure_time"];
    $arrivalTime = $_POST["arrival_time"];

    $document = [
        "username" => $username,
        "reason" => $reason,
        "departure_date" => $departureDate,
        "arrival_date" => $arrivalDate,
        "departure_time" => $departureTime,
        "arrival_time" => $arrivalTime
    ];

    $result = $collection->insertOne($document);

    if ($result) {
        header("Location: user_outpass_granted.php");    
    } 
    else {
        $error = "Failed to submit hostel outpass request";
    }
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>User Dashboard</title>
    <link rel="stylesheet" href="./css/bootstrap.min.css">
    <style>
        .container {
            margin-top: 100px;
        }
        .form-container {
            margin-top: 50px;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="row justify-content-center">
            <h1>User Dashboard</h1>
        </div>
        <a href="userdashboard.php" class="btn btn-primary">Go to User Dashboard</a>
        <div class="row form-container">
            <div class="col-md-6 offset-md-3">
                <?php if (isset($error)): ?>
                    <div class="alert alert-danger"><?php echo $error; ?></div>
                <?php endif; ?>
                <?php if (isset($success)): ?>
                    <div class="alert alert-success"><?php echo $success; ?></div>
                <?php endif; ?>
                <form method="POST" action="<?php echo $_SERVER['PHP_SELF']; ?>">
                    <div class="form-group">
                        <label for="reason">Reason</label>
                        <input type="text" class="form-control" id="reason" name="reason" required>
                    </div>
                    <div class="form-group">
                        <label for="departure_date">Departure Date</label>
                        <input type="date" class="form-control" id="departure_date" name="departure_date" required>
                    </div>
                    <div class="form-group">
                        <label for="arrival_date">Arrival Date</label>
                        <input type="date" class="form-control" id="arrival_date" name="arrival_date" required>
                    </div>
                    <div class="form-group">
                        <label for="departure_time">Departure Time</label>
                        <input type="time" class="form-control" id="departure_time" name="departure_time" required>
                    </div>
                    <div class="form-group">
                        <label for="arrival_time">Arrival Time</label>
                        <input type="time" class="form-control" id="arrival_time" name="arrival_time" required>
                    </div>
                    <button type="submit" class="btn btn-primary btn-block">Submit</button>
                </form>
            </div>
        </div>
    </div>
</body>
</html>
