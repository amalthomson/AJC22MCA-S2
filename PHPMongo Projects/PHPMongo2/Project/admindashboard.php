<?php
session_start();

if (!isset($_SESSION["admin"])) {
    header("Location: adminlogin.php");
    exit();
}

if ($_SERVER["REQUEST_METHOD"] == "POST" && isset($_POST["logout"])) {
    $_SESSION = array();
    session_destroy();

    header("Location: adminlogin.php");
    exit();
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Admin Dashboard</title>
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
            <h1>Admin Dashboard</h1>
        </div>
        <div class="row button-container">
            <div class="col-md-4">
                <a href="admin_users_display.php" class="btn btn-primary btn-lg btn-block">View Users</a>
            </div>
            <div class="col-md-4">
                <a href="admin_outpass_display.php" class="btn btn-success btn-lg btn-block">View Outpass Requests</a>
            </div>
            <div class="col-md-4">
                <form method="POST" action="<?php echo $_SERVER['PHP_SELF']; ?>">
                    <button type="submit" name="logout" class="btn btn-danger btn-lg btn-block">Logout</button>
                </form>
            </div>
        </div>
    </div>
</body>
</html>

