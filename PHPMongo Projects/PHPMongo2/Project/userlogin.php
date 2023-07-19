<?php
session_start();

require '../vendor/autoload.php';

$client = new MongoDB\Client("mongodb://localhost:27017");

$dbName = 'CRUD';
$collectionName = 'users';
$collection = $client->$dbName->$collectionName;

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $username = $_POST["username"];
    $password = $_POST["password"];

    $user = $collection->findOne(["username" => $username, "password" => $password]);

    if ($user) {
        $_SESSION["username"] = $username;
        header("Location: userdashboard.php");
        exit();
    } else {
        $error = "Invalid username or password";
    }
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>User Login</title>
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
            <h1>User Login</h1>
        </div>
        <a href="userhome.php" class="btn btn-primary">Go to User Home</a>
        <div class="row form-container">
            <div class="col-md-4 offset-md-4">
                <form method="POST" action="<?php echo $_SERVER['PHP_SELF']; ?>">
                    <?php if (isset($error)): ?>
                        <div class="alert alert-danger"><?php echo $error; ?></div>
                    <?php endif; ?>
                    <div class="form-group">
                        <label for="username">Username</label>
                        <input type="text" class="form-control" id="username" name="username" required>
                    </div>
                    <div class="form-group">
                        <label for="password">Password</label>
                        <input type="password" class="form-control" id="password" name="password" required>
                    </div>
                    <button type="submit" class="btn btn-primary btn-block">Login</button>
                </form>
                <div class="mt-3 text-center">
                    <a href="index.php">Back to Home Page</a>
                </div>
                <div class="mt-3 text-center">
                    <a href="userregister.php">Not Registered? Register Now</a>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
