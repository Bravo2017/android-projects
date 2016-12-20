<?php header('Access-Control-Allow-Origin: *'); ?>
<?php

	if($_SERVER['REQUEST_METHOD']=='POST'){
		$name = $_POST['name'];
		$email = $_POST['email'];
		$pssword = $_POST['password'];
    $city = $_POST['city'];
    $country = $_POST['country'];

		require_once('dbConnect.php');

		$sql = "INSERT INTO users (name,email,pssword,city, country) VALUES ('$name','$email','$pssword','$city', '$country')";


		if(mysqli_query($con,$sql)){
			echo "Successfully Registered";
		}else{
			echo "Could not register";

		}
	}else{
echo 'error';
}
