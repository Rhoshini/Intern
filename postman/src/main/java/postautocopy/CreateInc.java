package postautocopy;

import java.io.File;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class CreateInc extends BaseClass{
	
	
	@Test
	public void createNewInc() {
		/*//Get the URL/Endpoint for the services
		RestAssured.baseURI = "https://dev78371.service-now.com/api/now/table/incident";
		
		//Authentication (basic)
		RestAssured.authentication = RestAssured.basic("admin", "bv0MMhw0tUXC");*/
		
	
		
	
		
		
		//Request type - post -> Response directly
		Response response = request
				.body("{\r\n" + 
						"    \"short_description\": \"Short description created\",\r\n" + 
						"    \"description\": \"Description created via postman\",\r\n" + 
						"    \"category\": \"Rest API\"\r\n" + 
						"}")
				.post();
		
		//Validate Response code
		System.out.println(response.getStatusCode());
		
		//Check the response format
		System.out.println(response.getContentType());
		
		//print the response from postman console
		response.prettyPrint();
		
		//to get the response in json
		JsonPath jsonresponse = response.jsonPath();
		
		//to get a single record
		sys_id = jsonresponse.get("result.sys_id");
		System.out.println("The sys_id is: "+sys_id);
		
		

	
			
		
		
	}

}
