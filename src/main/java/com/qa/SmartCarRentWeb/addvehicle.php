<?php 
require_once  'db_connect.php';
// connecting to db
$db = new DB_CONNECT();
$conn = $db->connect();
$response = array();

 
$vehiclenumber = $_REQUEST['vehiclenumber'];
$vehiclecolor = $_REQUEST['vehiclecolor'];
$vehiclecompany = $_REQUEST['vehiclecompany'];
$vehicletype = $_REQUEST['vehicletype'];
$gsmnumber = $_REQUEST['gsmnumber'];
$currentlocation = $_REQUEST['currentlocation'];
$charges = $_REQUEST['charges'];
$noofseats = $_REQUEST['noofseats'];
$speedlimit = $_REQUEST['speedlimit'];
$ownerid = $_REQUEST['ownerid'];


//$status = $_REQUEST['status'];


if(isset($vehiclenumber))
{

  if(isset($_FILES['vehicleimage']['name']))
	{
	    $targetPath = "/images/";   
	    $targetPath = getTargetPath($targetPath);
	    $filename = $_FILES['vehicleimage']['name'];
	    $random = rand(100, 999);
	    uploadImage($_FILES['vehicleimage'], $targetPath, $random, $filename);
	    $filename = $targetPath.$filename;   
    }
    else
    {
    	$filename="";
    }

		$sql="INSERT INTO tbl_vehicle (vehiclenumber, vehiclecolor ,vehiclecompany,vehicletype,gsmnumber,currentlocation,charges,noofseats,speedlimit,ownerid,vehicleimage) VALUES ('$vehiclenumber','$vehiclecolor','$vehiclecompany','$vehicletype','$gsmnumber','$currentlocation','$charges','$noofseats','$speedlimit','$ownerid','$filename');";
		
		//echo $sql;
		//exit;

		$result = $conn->query($sql);  	
		if ($result==TRUE) 
		{
			//  successfully inserted into database
			$response["success"] = 1;
			$response["message"] = "vehicle Added Successfully.";
			
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
