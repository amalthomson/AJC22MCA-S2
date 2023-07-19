<?php
    include_once('connection.php');
    $id = null;
    if ( !empty($_GET['id'])) {
        $id = $_REQUEST['id'];
    }
    if ( null==$id ) {
        header("Location: display.php");
    }
    if (!empty($_POST)) {
        $nameError = null;
        $addressError = null;
        $name = $_POST['name'];
        $email = $_POST['email'];
        $phone = $_POST['phone'];
        $address = $_POST['address'];
        $valid = true;
        if (empty($name)) {
            $nameError = 'Please enter Name';
            $valid = false;
        }
        if (empty($address)) {
            $addressError = 'Please enter Address';
            $valid = false;
        }
        if ($valid) {
            $collection->updateOne(
                ['_id' => new MongoDB\BSON\ObjectId($id)],
                [ '$set' => [ 'name' => $name, 'address' => $address, 'email' => $email, 'phone' => $phone]]
            );
            header("Location: display.php");
        }
    } else {
        $data = $collection->findOne(['_id' => new MongoDB\BSON\ObjectId($id)]);
        $name = $data['name'];
        $email = $data['email'];
        $phone = $data['phone'];
        $address = $data['address'];
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
                <h3><u>Update User</u></h3>
            </div>
            <form class="form-horizontal" action="update.php?id=<?php echo $id?>" method="post">
                <div class="control-group <?php echo !empty($nameError)?'error':'';?>">
                    <label class="control-label">Name</label>
                    <div class="controls">
                        <input class="form-control <?php echo empty($nameError)?'':'is-invalid';?>" name="name" type="text"  placeholder="Name" value="<?php echo !empty($name)?$name:'';?>">
                        <?php if (!empty($nameError)): ?>
                            <span class="<?php echo empty($nameError)?'':'invalid-feedback';?>"><?php echo $nameError;?></span>
                        <?php endif; ?>
                    </div>
                </div>
                <br>
                <div class="control-group">
                    <label class="control-label">Email</label>
                    <div class="controls">
                        <input class="form-control" name="email" type="text" placeholder="Email" value="<?php echo !empty($email)?$email:'';?>">
                    </div>
                </div>
                <br>
                <div class="control-group">
                    <label class="control-label">Phone Number</label>
                    <div class="controls">
                        <input class="form-control" name="phone" type="text" placeholder="Phone Number" value="<?php echo !empty($phone)?$phone:'';?>">
                    </div>
                </div>
                <br>
                <div class="control-group">
                    <label class="control-label">Address</label>
                    <div class="controls">
                        <input class="form-control" name="address" type="text" placeholder="Address" value="<?php echo !empty($address)?$address:'';?>">
                    </div>
                </div>
                <br>

                <div class="form-actions">
                    <button type="submit" class="btn btn-success">Update</button>
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
