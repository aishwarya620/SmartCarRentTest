<?php 
require_once  'db_connect.php';
require_once 'sendpush.php';
// connecting to db
$db = new DB_CONNECT();
$conn = $db->connect();
$response = array();

 //customer name
$coursename = $_REQUEST['coursename'];
$coursedescription = $_REQUEST['coursedescription'];
$fees = $_REQUEST['fees']; // emailid/mobile number
//$courseimage = $_REQUEST['courseimage'];
$userid = $_REQUEST['userid'];
$subcategoryid = $_REQUEST['subcategoryid'];


if(isset($coursename) && isset($coursedescription))
{
	if(isset($_FILES['courseimage']['name']))
	{
	    $targetPath = "../upload/course/";   
	    $targetPath = getTargetPath($targetPath);
	    $filename = $_FILES['courseimage']['name'];
	    $random = rand(100, 999);
	    uploadImage($_FILES['courseimage'], $targetPath, $random, $filename);
	    $filename = $targetPath.$filename;   
    }
    else
    {
    	$filename="";
    }

    if(isset($_FILES['coursevideo']['name']))
	{
	    $targetPath = "../upload/course/";   
	    $targetPath = getTargetPath($targetPath);
	    $videofilename = $_FILES['coursevideo']['name'];
	    $random = rand(100, 999);
	    uploadImage($_FILES['coursevideo'], $targetPath, $random, $videofilename);
	    $videofilename = $targetPath.$videofilename;   
    }
    else
    {
    	$videofilename="";
    }

	
		$sql="INSERT INTO course (subcategoryid, userid,coursename, coursedescription, fees,courseimage, coursevideo,status,verify ) VALUES ('$subcategoryid','$userid','$coursename', '$coursedescription','$fees','$filename', '$videofilename','active','no');";
		
	//echo $sql;
	//exit;

		$result = $conn->query($sql);  	
		if ($result==TRUE) 
		{
			//  successfully inserted into database
			
			$lecturerName = "";
		
			
			$querylecturer = "SELECT name FROM users WHERE userid = $userid";	
			
			//echo $querystudent;
			$reslecturer=$conn->query($querylecturer); 
			
			if (mysqli_num_rows($reslecturer) > 0) 
			{
			
				  $rowlecturer = mysqli_fetch_object($reslecturer);
				  $lecturerName = $rowlecturer->name;
			}
			
			$ids = array();
			$userids = array();
			$querytoken = "SELECT userid, token FROM users WHERE usertype = 'Student'";
			//echo $querytoken;
			$restoken=$conn->query($querytoken); 
			
			if (mysqli_num_rows($restoken) > 0) 
			{
				while($rowtoken = mysqli_fetch_object($restoken))
				{
					$ids[] = $rowtoken->token; 
					$userids[] = $rowtoken->userid;
				}
			}
			else{
		
		// failed to login
				$response["success"] = 0;
				$response["message"] = "Failed to update token1.";
				// echoing JSON response
				//echo json_encode($response);
			}
		
		
			if (count($ids) > 0) 
			{
				//print_r($ids);
				//exit;

				$message = "{'usertype': 'Student','message':'".$lecturerName." has created course ".$coursename."'}";
				startNotificationProcess($ids, $message);
				for($i = 0 ; $i < count($userids) ; $i++)
				{
					$querynotification = "INSERT INTO notifications(userid, notificationdata, createdby, createdon) VALUES ($userids[$i], '$message', $userids[$i], now())";
					$resnotification=$conn->query($querynotification);
				}
				$response["success"] = 1;
			    $response["message"] = "Course added successfully";
				//echo json_encode($response);

			}
			
		
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
<?php
function UploadImage($image, $target_path, $random, $filename){
    if ($image['error'] == 0) {
        $target_path = $target_path . $filename;
        // $filename_url = $filename;
        
        
        if(move_uploaded_file($image['tmp_name'], $target_path) ){
            // $response['fileupload'] = "success";
            $responseFlag = 1;
        } else{
            // $response['fileupload'] = "fail";
            $responseFlag = 0;
        }

        // return $responseFlag;
    }
}
function getTargetPath($path){
    //get all folders in path specified, store them in array
    $arrayFolders = explode("/", $path);
    //Store folder at 0th position of array as base folder name
    $baseFolder = $arrayFolders[0];
    for($i = 1; $i < count($arrayFolders); $i++){
        $baseFolder .= "/".$arrayFolders[$i];
        //check if path directory in $baseFolder exists, if not create
        if(!file_exists($baseFolder)){
            mkdir($baseFolder);
        }
    }
    return $baseFolder;
}
?>
