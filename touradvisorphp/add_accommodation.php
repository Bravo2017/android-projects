<?php header('Access-Control-Allow-Origin: *'); ?>
<?php

	if($_SERVER['REQUEST_METHOD']=='POST'){
    $location_name = $_POST['location_name'];
    $latitude = $_POST['latitude'];
    $longitude = $_POST['longitude'];
    $county = $_POST['county'];
		$restaurant_name = $_POST['restaurant_name'];
		$email = $_POST['email'];
    $phone = $_POST['phone'];
		$cost_per_day = $_POST['cost_per_day'];
    $hotel_image = $_POST['hotel_image'];
    $interior_image = $_POST['interior_image'];
    $guest_image = $_POST['guest_image'];
    $rating = $_POST['rating'];

		require_once('dbConnect.php');

    $sql_location = "INSERT INTO geolocations (location_name,latitude,longitude,county) VALUES ('$location_name','$latitude','$longitude','$city', '$county')";
    if(mysqli_query($con,$sql_location)){
			$sql_geo_id = "SELECT geolocation_id FROM geolocations WHERE latitude = '$latitude' AND longitude='$longitude'";
      if(mysqli_query($con,$sql_geo_id)){
        $geo_id = geolocations ['geolocation_id'];
        echo $geo_id;
  			$sql_site_id = "SELECT attraction_site_id FROM attraction_sites INNER JOIN geolocations ON attraction_sites.geolocation_id = geolocations.geolocation_id WHERE attraction_sites.location_name = geolocations.location_name";
        if(mysqli_query($con,$sql_site_id)){
          $site_id = attraction_sites ['attraction_site_id'];
          $sql = "INSERT INTO accommodations (restaurant_name,email,phone,cost_per_day, hotel_image,interior_image,guest_image,rating, attraction_site_id, geolocation_id) VALUES ('$restaurant_name','$email','$phone','$cost_per_day', '$county', '$rating','$site_id','$geo_id')";
      		if(mysqli_query($con,$sql)){
      			echo "Successfully Registered";
      		}else{
      			echo "Could not register";
      		}
    		}
        else{
    			echo "Could not register";
        }
      }else
      {
  			echo "Location name does not exist";
      }
		}else
    {
			echo "Could not add geolocation";
		}
	}else{
echo 'error';
}
