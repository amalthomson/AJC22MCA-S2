<?php
    include_once('connection.php');
    $id = 0;
    $data = [];   
    if ( !empty($_GET['id'])) {
        $id = $_REQUEST['id'];
        $data = $collection->findOne(['_id' => new MongoDB\BSON\ObjectId($id)]);
    }  
    if ( !empty($_POST)) {
        $id = $_POST['id'];    
        $collection->deleteOne(['_id' => new MongoDB\BSON\ObjectId($id)]);
        header("Location: display.php");   
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
    <meta charset="utf-8">
	<link rel="stylesheet" href="./css/bootstrap.min.css">
    <script src="./js/jquery-3.4.1.min.js"></script>
    <script src="./js/popper.min.js"></script>
    <script src="./js/bootstrap.min.js"></script>
</head>
<body>
    <div class="container">
        <div class="span10 offset1">
            <div class="row">
                <h3><u>Delete User</u></h3>
            </div>
            <form class="form-horizontal" action="delete.php" method="post">
                <input type="hidden" name="id" value="<?php echo $id;?>"/>
                <p class="alert alert-error"> Confirm to Delete <?php echo $data['name'];?>?</p>
                <div class="form-actions">
                    <button type="submit" class="btn btn-danger">Delete</button>
                    <a class="btn btn-info" href="display.php">Back</a>
                </div>
            </form>
        </div>
    </div>
    <div class="footer">
        N Amal Thomson - Reg. MCA S2 (B) - Amal Jyothi College of Engineering
    </div>
  </body>
</html>