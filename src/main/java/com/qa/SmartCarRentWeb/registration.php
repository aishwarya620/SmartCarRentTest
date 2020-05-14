<?php 
require_once  'db_connect.php';
// connecting to db
$db = new DB_CONNECT();
$conn = $db->connect();
$response = array();

 //customer name
$name = $_REQUEST['name'];
$email = $_REQUEST['email'];
$mobile = $_REQUEST['mobile']; // emailid/mobile number
$password = $_REQUEST['password']; 
$city = $_REQUEST['city']; //password
$pincode = $_REQUEST['pincode']; //password
$licenseno = $_REQUEST['licenseno']; //password
$usertype = $_REQUEST['usertype']; //password
$sex = $_REQUEST['sex'];

if(isset($email) && isset($password) && isset($mobile))
{
	$query="SELECT * FROM tbl_users where mobile = '$mobile'";	
	$res=$conn->query($query); 
	if (mysqli_num_rows($res) > 0) 
	{	
		//  successfully inserted into database
			$response["success"] = 2;
			$response["message"] = "This User Already Register.";
			
	}
	else
	{

		$sql="INSERT INTO tbl_users(name, email, mobile, password, city, pincode,licenseno,usertype,sex) VALUES ('$name', '$email', '$mobile', md5('$password'), '$city','$pincode','$licenseno','$usertype','$sex');";

		//echo $sql;
		//exit;
		
		$result = $conn->query($sql);  	
		if ($result==TRUE) 
		{
			//  successfully inserted into database
			$response["success"] = 1;
			$response["message"] = "Registered Successfully.";
			
		} 
													
		else 
		{
			// failed to insert row
			$response["success"] = 0;
			$response["message"] = "Oops! An error occurred.";
			
		
		}
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
