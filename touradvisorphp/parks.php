<?php
define('HOST', '104.236.78.39');
define('USER','imaya');
define('PASS','#Imaya1993*');
define('DB', 'touradvisor');
$con = mysqli_connect(HOST,USER,PASS,DB) or die('unable to connect');
if($_SERVER['REQUEST_METHOD']=='GET'){

 $category = "National Park";
 $sql = "SELECT * FROM attraction_sites INNER JOIN geolocations ON attraction_sites.geolocation_id = geolocations.geolocation_id LIMIT 0, 1000";

 $r = mysqli_query($con,$sql);

 $row = mysqli_fetch_array($r);

 $result["parks"] = array();
 while ($row = mysqli_fetch_array($r)){
    $data = array();
    $data["attraction_site_id"]=$row["attraction_site_id"];
    $data["site_name"]=$row["site_name"];
    $data["image_1"]=$row["image_1"];
    $data["image_2"]=$row["image_2"];
    $data["image_3"]=$row["image_3"];
    $data["categories"]=$row["categories"];
    $data["latitude"]=$row["latitude"];
    $data["longitude"]=$row["longitude"];
    $data["location_name"]=$row["location_name"];
        array_push($result["parks"], $data);
  }

 echo json_encode($result);

 mysqli_close($con);

 }
?>
