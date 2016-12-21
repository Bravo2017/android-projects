<?php header('Access-Control-Allow-Origin: *'); ?>
<?php

define('HOST', '104.236.78.39');
define('USER','imaya');
define('PASS','#Imaya1993*');
define('DB', 'touradvisorzone');
$con = mysqli_connect(HOST,USER,PASS,DB) or die('unable to connect');
if($_SERVER['REQUEST_METHOD']=='GET'){

 $sql = "SELECT * FROM attraction_sites INNER JOIN no_of_tweets ON attraction_sites.attraction_site_id = no_of_tweets.attraction_site_id ORDER BY no_of_tweets.no_of_original_tweets DESC";

 $r = mysqli_query($con,$sql);

 $result["trending"] = array();
 while ($row = mysqli_fetch_array($r)){
    $data = array();
    $data["attraction_site_id"]=$row["attraction_site_id"];
    $data["site_name"]=$row["site_name"];
    $data["location_name"]=$row["location_name"];
    $data["site_image"]=$row["site_image"];
    $data["interior_image"]=$row["interior_image"];
    $data["attractions_image"]=$row["attractions_image"];
    $data["opening_hrs"]=$row["opening_hrs"];
    $data["categories"]=$row["categories"];
    $data["attraction_name"]=$row["attraction_name"];
    $data["no_of_original_tweets"]=$row["no_of_original_tweets"];
    $data["no_of_retweets"]=$row["no_of_retweets"];
        array_push($result["trending"], $data);
  }

 echo json_encode($result);

 mysqli_close($con);

 }
?>
