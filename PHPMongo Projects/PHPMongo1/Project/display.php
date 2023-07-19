<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="./css/bootstrap.min.css">
    <style>
    .table-container {
        margin-bottom: 50px;
    }
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
    <script src="./js/jquery-3.4.1.min.js"></script>
    <script src="./js/popper.min.js"></script>
    <script src="./js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
        <div class="span10 offset1">
            <div class="row">
                <h3><u>Display Users</u></h3>
            </div>
        <div class="row justify-content-center"></div>
        <div class="row table-container">
            <table class="table table-striped table-bordered">
                <thead>
                    <tr align="center">
                        <th>Name</th>
                        <th>Email</th>
                        <th>Phone Number</th>
                        <th>Address</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                    <?php 
                        include_once('connection.php'); 
                        $cursor = $collection->find()->toArray();
                        foreach ($cursor as $document) {
                            echo '<td>'. $document['name'] . '</td>';
                            echo '<td>'. $document['email'] . '</td>';
                            echo '<td>'. $document['phone'] . '</td>';
                            echo '<td>'. $document['address'] . '</td>';
                            echo '<td width=250>';
                            echo '<a class="btn btn-success" href="update.php?id='.$document['_id'].'">Update</a>';
                            echo ' ';
                            echo '<a class="btn btn-danger" href="delete.php?id='.$document['_id'].'">Delete</a>';
                            echo '</td>';
                            echo '</tr>';
                        }
                    ?>
                </tbody>
            </table>
        </div>
        <div class="row">
            <div class="col-md-6">
                <a href="create.php" class="btn btn-success">Add User</a>
            </div>
            <div class="col-md-6 text-md-right">
                <form action="logout.php" method="POST">
                    <button type="submit" class="btn btn-danger">Logout</button>
                </form>
            </div>
        </div>
    </div>
    <div class="footer">
        N Amal Thomson - Reg. MCA S2 (B) - Amal Jyothi College of Engineering
    </div>
</body>
</html>
