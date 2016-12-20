<?php header('Access-Control-Allow-Origin: *'); ?>
<?php

	if($_SERVER['REQUEST_METHOD']=='POST'){
		$email = $_POST['email'];
		$password = $_POST['password'];
		
		require_once('dbConnect.php');
		
		$sql = "SELECT * FROM users WHERE email = '$email' AND pssword='$password'";
		
		$r = mysqli_query($con,$sql);

		$result["userdetails"] = array();
		 while ($row = mysqli_fetch_array($r)){
		    $data = array();
		    $data["user_id"]=$row["user_id"];
		    $data["name"]=$row["name"];
		    $data["username"]=$row["username"];
		    $data["email"]=$row["email"];
		    $data["password"]=$row["pssword"];
		    $data["city"]=$row["city"];
		    $data["country"]=$row["country"];
		    $data["user_image"]=$row["user_image"];
			array_push($result["userdetails"], $data);
		  }

		 echo json_encode($result);
	}
