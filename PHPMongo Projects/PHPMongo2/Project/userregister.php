<?php
require '../vendor/autoload.php';

$client = new MongoDB\Client("mongodb://localhost:27017");

$dbName = 'CRUD';
$collectionName = 'users';
$collection = $client->$dbName->$collectionName;

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $username = $_POST["username"];
    $password = $_POST["password"];
    $name = $_POST["name"];
    $email = $_POST["email"];

    $user = $collection->findOne(["username" => $username]);

    if ($user) {
        $error = "Username already exists";
    } else {
        $document = [
            "username" => $username,
            "password" => $password,
            "name" => $name,
            "email" => $email
        ];

        $result = $collection->insertOne($document);

        if ($result) {
            header("Location: userlogin.php");
            exit();
        } else {
            $error = "Registration failed";
        }
    }
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>User Registration</title>
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
            <h1>User Registration</h1>
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
                    <div class="form-group">
                        <label for="name">Name</label>
                        <input type="text" class="form-control" id="name" name="name" required>
                    </div>
                    <div class="form-group">
                        <label for="email">Email</label>
                        <input type="email" class="form-control" id="email" name="email" required>
                    </div>
                    <button type="submit" class="btn btn-primary btn-block">Register</button>
                </form>
                <div class="mt-3 text-center">
                    <a href="index.php">Back to Home Page</a>
                </div>
                <div class="mt-3 text-center">
                    <a href="userlogin.php">Already Registered? Login Now</a>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
