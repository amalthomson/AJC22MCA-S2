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

if (isset($_GET["user_id"])) {
    $userId = $_GET["user_id"];

    $user = $collection->findOne(["_id" => new MongoDB\BSON\ObjectID($userId)]);

    if (!$user) {
        header("Location: admin_users_display.php");
        exit();
    }

    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $name = $_POST["name"];
        $email = $_POST["email"];

        $collection->updateOne(
            ["_id" => new MongoDB\BSON\ObjectID($userId)],
            ['$set' => ["name" => $name, "email" => $email]]
        );

        header("Location: admin_users_display.php");
        exit();
    }
} else {
    header("Location: admin_users_display.php");
    exit();
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Update User</title>
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
            <h1>Update User</h1>
        </div>
        <div class="row form-container">
            <div class="col-md-4 offset-md-4">
                <form method="POST" action="<?php echo $_SERVER['PHP_SELF'] . '?user_id=' . $userId; ?>">
                    <div class="form-group">
                        <label for="name">Name</label>
                        <input type="text" class="form-control" id="name" name="name" value="<?php echo $user["name"]; ?>" required>
                    </div>
                    <div class="form-group">
                        <label for="email">Email</label>
                        <input type="email" class="form-control" id="email" name="email" value="<?php echo $user["email"]; ?>" required>
                    </div>
                    <button type="submit" class="btn btn-primary btn-block">Update</button>
                </form>
            </div>
        </div>
    </div>
</body>
</html>
