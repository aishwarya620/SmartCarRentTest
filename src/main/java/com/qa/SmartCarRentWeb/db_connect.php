<?php

/**
 * A class file to connect to database
 */
class DB_CONNECT {
	
	// constructor
	function __construct() {
		// connecting to database
		$this->connect();
	}
	
	//destructor
	function __destruct() {
		// closing db connection
		$this->close();
	}
	
	/**
	 * Function to connect with database
	 */
	function connect() {
		// import database connection variables
		require_once dirname(__FILE__).'/config_db.php';
		// Connecting to mysql database
		$conn = mysqli_connect(DB_SERVER, DB_USER, DB_PASSWORD, DB_DATABASE);
		// Check connection
 		if (!$conn) {
			die("Connection failed: " . mysqli_connect_error());
		} 
		// returing connection cursor
		return  $conn ;
	}
	
	/**
	 * Function to close db connection
	 */
	function close() {
		// closing db connection
		mysqli_close($this->connect());
	}
}
?>