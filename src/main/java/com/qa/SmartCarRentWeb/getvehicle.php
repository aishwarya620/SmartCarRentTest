<?php 
require_once  'db_connect.php';
// connecting to db
$db = new DB_CONNECT();
$conn = $db->connect();
$response = array();

$vehiclelist = array();


$query="SELECT * FROM tbl_vehicle";


$result = $conn->query($query);			
if(mysqli_num_rows($result) > 0) {
	while($row = mysqli_fetch_object($result)){
		$vehiclelist[] = $row;
	}
	if($vehiclelist>0)
	{		
		$response["success"] = 1;
		$response["vehiclelist"] = $vehiclelist;
	}
	else {
		$response["success"] = 0;
		$response["message"] = "No Vehicle found.";
	}
		
	
}
else {
		// no user found
	$response["success"] = 0;
	$response["message"] = "No Vehicle found.";
}


echo json_encode($response);
?>