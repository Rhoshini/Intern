package postautocopy;

import org.testng.annotations.BeforeSuite;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class BaseClass {
	
	public static RequestSpecification request;
	public static String sys_id;
	
	
	@BeforeSuite
	public void initialize() {
		//Get the URL/Endpoint for the services
				RestAssured.baseURI = "https://dev78371.service-now.com/api/now/table/incident";
				
				//Authentication (basic)
				RestAssured.authentication = RestAssured.basic("admin", "bv0MMhw0tUXC");
				
				request = RestAssured.given().log().all();
	}

}
