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
        .button-container {
            margin-top: 20px;
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
</head>
<body>
    <div class="container">
        <div class="row justify-content-center">
            <h2>User Login</h2>
        </div>
        <div class="row">
            <div class="col-md-6 offset-md-3">
                <form action="login_process.php" method="POST">
                    <div class="form-group">
                        <label for="username">Username</label>
                        <input type="text" class="form-control" id="username" name="username" required>
                    </div>
                    <div class="form-group">
                        <label for="password">Password</label>
                        <input type="password" class="form-control" id="password" name="password" required>
                    </div>
                    <div class="button-container">
                        <button type="submit" class="btn btn-primary btn-block">Login</button>
                    </div>
                </form>
            </div>
        </div>
        <div class="row justify-content-center">
            <p>Don't have an account? <a href="userregister.php">Register here</a></p>
        </div>
        <?php if (isset($error)): ?>
        <div class="row justify-content-center">
            <p class="text-danger"><?php echo $error; ?></p>
        </div>
        <?php endif; ?>
    </div>
    <div class="footer">
        N Amal Thomson - Reg. MCA S2 (B) - Amal Jyothi College of Engineering
    </div>
</body>
</html>
