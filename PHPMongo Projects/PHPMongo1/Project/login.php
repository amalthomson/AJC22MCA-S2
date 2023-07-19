<?php
session_start();

if (isset($_SESSION['admin_logged_in']) && $_SESSION['admin_logged_in'] === true) {
    header("Location: display.php");
    exit;
}

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $username = $_POST['username'];
    $password = $_POST['password'];

    $adminUsername = 'admin';
    $adminPassword = 'password';

    if ($username === $adminUsername && $password === $adminPassword) {
        $_SESSION['admin_logged_in'] = true;
        header("Location: display.php");
        exit;
    } else {
        $loginError = "Invalid username or password";
    }
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
<style>
    .container {
        margin-top: 50px;
    }
    .footer {
            position: fixed;
            bottom: 0;
            left: 0;
            width: 100%;
            padding: 20px;
            background-color: #f8f9fa;
            font-size: 26px;
            color: #777;
            text-align: center;
        }
</style>
    <meta charset="UTF-8">
    <title>Admin Login</title>
    <link rel="stylesheet" href="./css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <h3><u>Admin Login</u></h3>
        <form method="POST">
            <?php if (isset($loginError)): ?>
                <div class="alert alert-danger"><?php echo $loginError; ?></div>
            <?php endif; ?>
            <div class="form-group">
                <label for="username">Username:</label>
                <input type="text" class="form-control" id="username" name="username" required>
            </div>
            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" class="form-control" id="password" name="password" required>
            </div>
            <button type="submit" class="btn btn-primary">Login</button>
        </form>
    </div>
    <div class="footer">
        N Amal Thomson - Reg. MCA S2 (B) - Amal Jyothi College of Engineering
    </div>
</body>
</html>
