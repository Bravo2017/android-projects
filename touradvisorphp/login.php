<?php header('Access-Control-Allow-Origin: *'); ?>
<?php

	if($_SERVER['REQUEST_METHOD']=='POST'){
		$email = $_POST['email'];
		$password = $_POST['password'];
		
		require_once('dbConnect.php');
		
		$sql = "SELECT * FROM users WHERE email = '$email' AND pssword='$password'";
		
		$result = mysqli_query($con,$sql);
		
		$check = mysqli_fetch_array($result);
		
		if(isset($check)){
			echo 'You have successfuly login';
		}else{
			echo 'Could not login';
		}
	}
