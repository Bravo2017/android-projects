<?php
define('HOST', '104.236.78.39');
define('USER','imaya');
define('PASS','#Imaya1993*');
define('DB', 'touradvisorzone');
$con = mysqli_connect(HOST,USER,PASS,DB) or die('unable to connect');
if($_SERVER['REQUEST_METHOD']=='GET'){

 $category = "National Sanctuary";
 $sql = "SELECT * FROM attraction_sites INNER JOIN geolocations ON attraction_sites.geolocation_id = geolocations.geolocation_id where attraction_sites.categories LIKE '%$category%'";

 $r = mysqli_query($con,$sql);

 // $row = mysqli_fetch_array($r);

 $result["details"] = array();
 while ($row = mysqli_fetch_array($r)){
    $data = array();
    $data["attraction_site_id"]=$row["attraction_site_id"];
    $data["site_name"]=$row["site_name"];
    $data["latitude"]=$row["latitude"];
    $data["longitude"]=$row["longitude"];
    $data["location_name"]=$row["location_name"];
    $data["longitude"]=$row["longitude"];
    $data["site_image"]=$row["site_image"];
    $data["interior_image"]=$row["interior_image"];
    $data["attractions_image"]=$row["attractions_image"];
    $data["opening_hrs"]=$row["opening_hrs"];
    $data["categories"]=$row["categories"];
        array_push($result["details"], $data);
  }

 echo json_encode($result);

 mysqli_close($con);

 }
?>
