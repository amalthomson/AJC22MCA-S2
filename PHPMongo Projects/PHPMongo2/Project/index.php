<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Index Page</title>
    <link rel="stylesheet" href="./css/bootstrap.min.css">
    <style>
        .container {
            margin-top: 100px;
        }
        .button-container {
            margin-top: 100px;
            display: flex;
            justify-content: center; 
            align-items: center;
        }
        .footer {
            position: fixed;
            bottom: 0;
            left: 0;
            width: 100%;
            padding: 20px;
            background-color: #f8f9fa;
            font-size: 22px;
            color: #777;
            text-align: center;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="row justify-content-center">
            <h1>Welcome</h1>
        </div>
        <br><br><br><br>
        <div class="row justify-content-center">
        <h2>Outpass Management</h2> 
        </div>
        <div class="row button-container">
            <div class="col-md-6 col-lg-3">
                <a href="adminhome.php" class="btn btn-primary btn-lg btn-block">Admin</a>
            </div>
            <div class="col-md-6 col-lg-3">
                <a href="userhome.php" class="btn btn-success btn-lg btn-block">User</a>
            </div>
        </div>
    </div>

    <div class="footer">
        N Amal Thomson - Reg. MCA S2 (B) - Amal Jyothi College of Engineering
    </div>
</body>
</html>
