<?php 
require_once  'db_connect.php';
// connecting to db
$db = new DB_CONNECT();
$conn = $db->connect();
$response = array();

 
$userid = $_REQUEST['userid'];
$vehicleid = $_REQUEST['vehicleid'];
$source = $_REQUEST['source'];
$destination = $_REQUEST['destination'];
$km = $_REQUEST['km'];
$currentlocation = $_REQUEST['currentlocation'];
$actype = $_REQUEST['actype'];
$finalamount = $_REQUEST['finalamount'];

//$status = $_REQUEST['status'];


if(isset($km))
{
		$sql="INSERT INTO tbl_booking (userid, vehicleid ,source, destination, km, currentlocation, actype, finalamount) VALUES ('$userid','$vehicleid','$source','$destination','$km','$currentlocation','$actype','$finalamount');";
		
		//echo $sql;
		//exit;

		$result = $conn->query($sql);  	
		if ($result==TRUE) 
		{
			//  successfully inserted into database
			$response["success"] = 1;
			$response["message"] = "Car Booking Successfully.";
			
		} 
													
		else 
		{
			// failed to insert row
			$response["success"] = 0;
			$response["message"] = "Oops! An error occurred.";
			
		
		}
	}

else
{
	// failed to insert row
	$response["success"] = 0;
	$response["message"] = "ALL field is required";


}
echo json_encode($response);
?>
