<?php
session_start();

if (!isset($_SESSION["username"])) {
    header("Location: userlogin.php");
    exit();
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
        .button-container {
            margin-top: 50px;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="row justify-content-center">
            <h1>User Dashboard</h1>
        </div>
        <div class="row button-container">
            <div class="col-md-4">
                <a href="user_outpass_request.php" class="btn btn-primary btn-lg btn-block">Request Outpass</a>
            </div>
            <div class="col-md-4">
                <a href="user_outpass_granted.php" class="btn btn-success btn-lg btn-block">View Granted Outpass</a>
            </div>
            <div class="col-md-4">
                <form action="userlogout.php" method="POST">
                    <button type="submit" class="btn btn-danger btn-lg btn-block">Logout</button>
                </form>
            </div>
        </div>
    </div>
</body>
</html>
