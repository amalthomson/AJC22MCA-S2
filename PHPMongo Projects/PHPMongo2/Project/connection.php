<?php
require '../vendor/autoload.php';

$client = new MongoDB\Client("mongodb://localhost:27017");

$dbName = 'CRUD';
$collectionName = 'myDB';
$collection = $client->$dbName->$collectionName;
?>
