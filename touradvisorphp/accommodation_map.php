<?php
define('HOST', '104.236.78.39');
define('USER','imaya');
define('PASS','#Imaya1993*');
define('DB', 'touradvisor');
$con = mysqli_connect(HOST,USER,PASS,DB) or die('unable to connect');
if($_SERVER['REQUEST_METHOD']=='GET'){

 $sql = "SELECT * FROM accommodations INNER JOIN geolocations ON accommodations.geolocation_id = geolocations.geolocation_id LIMIT 0, 1000";

 $r = mysqli_query($con,$sql);

 $row = mysqli_fetch_array($r);

 $result["accommodations"] = array();
 while ($row = mysqli_fetch_array($r)){
    $data = array();
    $data["accommodation_id"]=$row["accommodation_id"];
    $data["restaurant_name"]=$row["restaurant_name"];
    $data["email"]=$row["email"];
    $data["phone"]=$row["phone"];
    $data["cost_per_day"]=$row["cost_per_day"];
    $data["image_1"]=$row["image_1"];
    $data["image_2"]=$row["image_2"];
    $data["image_3"]=$row["image_3"];
    $data["latitude"]=$row["latitude"];
    $data["longitude"]=$row["longitude"];
    $data["location_name"]=$row["location_name"];
        array_push($result["accommodations"], $data);
  }

 echo json_encode($result);

 mysqli_close($con);

 }
?>
