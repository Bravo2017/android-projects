<?php

define('HOST', '104.236.78.39');
define('USER','imaya');
define('PASS','#Imaya1993*');
define('DB', 'touradvisorzone');
$con = mysqli_connect(HOST,USER,PASS,DB) or die('unable to connect');
if($_SERVER['REQUEST_METHOD']=='GET'){

 $id = "get from app";
 $sql = "SELECT * FROM accommodations INNER JOIN attraction_sites ON accommodations.attraction_site_id = attraction_sites.attraction_site_id where accommodations.attraction_site_id LIKE '%$id%'";

 $r = mysqli_query($con,$sql);

 // $row = mysqli_fetch_array($r);

 $result["accommodations"] = array();
 while ($row = mysqli_fetch_array($r)){
    $data = array();
    $data["accommodation_id"]=$row["accommodation_id"];
    $data["restaurant_name"]=$row["restaurant_name"];
    $data["email"]=$row["email"];
    $data["phone"]=$row["phone"];
    $data["cost_per_day"]=$row["cost_per_day"];
    $data["hotel_image"]=$row["hotel_image"];
    $data["interior_image"]=$row["interior_image"];
    $data["guest_image"]=$row["guest_image"];
        array_push($result["accommodations"], $data);
  }

 echo json_encode($result);

 mysqli_close($con);

 }
?>
