<?php header('Access-Control-Allow-Origin: *'); ?>
<?php

define('HOST', '104.236.78.39');
define('USER','imaya');
define('PASS','#Imaya1993*');
define('DB', 'touradvisorzone');
$con = mysqli_connect(HOST,USER,PASS,DB) or die('unable to connect');
if($_SERVER['REQUEST_METHOD']=='GET'){

 $sql = "SELECT * FROM attraction_sites INNER JOIN attractions ON attraction_sites.attraction_site_id = attractions.attraction_site_id";

 $r = mysqli_query($con,$sql);

 $result["siteattractions"] = array();
 while ($row = mysqli_fetch_array($r)){
    $data = array();
    $data["attraction_name"]=$row["attraction_name"];
    $data["other_places_found"]=$row["other_places_found"];
        array_push($result["siteattractions"], $data);
  }

 echo json_encode($result);

 mysqli_close($con);

 }
?>
