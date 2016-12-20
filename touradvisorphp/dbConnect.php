<?php header('Access-Control-Allow-Origin: *'); ?>
<?php
define('HOST', '104.236.78.39');
define('USER','imaya');
define('PASS','#Imaya1993*');
define('DB', 'touradvisorzone');

	$con = mysqli_connect(HOST,USER,PASS,DB) or die('Unable to Connect');
