<?php 
require_once  'db_connect.php';
// connecting to db
$db = new DB_CONNECT();
$conn = $db->connect();
$response = array();



$mobile = $_REQUEST['mobile']; 
$pass = $_REQUEST['password'];
//$usertype = $_REQUEST['usertype']; 

if(isset($mobile) && isset($pass))
{
	$query = "SELECT * FROM tbl_users WHERE mobile = '$mobile' AND password = md5('$pass') ";
	
	//echo $query;
	//exit;
	
	$res=$conn->query($query); 
	
	
	if (mysqli_num_rows($res) > 0) 
	{	
		//  successfully login
		    $row = mysqli_fetch_object($res);
		    $response["success"] = 1;
		    $response["id"] = $row->userid;;
		    $response["name"] = $row->name;
		    $response["mobile"] = $row->mobile;
		    $response["email"] = $row->email;
		    $response["city"] = $row->city;
		    $response["usertype"] = $row->usertype;
		   
			$response["message"] = "Login successfully.";
			// echoing JSON response
			echo json_encode($response);
	}
	else 
		{
			// failed to login
			$response["success"] = 0;
			$response["message"] = "Please Enter the correct mobilenumber and password.";
			// echoing JSON response
			echo json_encode($response);
		}
	}

else
{
	// failed to insert row
	$response["success"] = 0;
	$response["message"] = "ALL field is required";
	// echoing JSON response
	echo json_encode($response);
}
?>
