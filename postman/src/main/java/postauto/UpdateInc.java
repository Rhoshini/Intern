package postauto;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class UpdateInc {

	@Test
	public void updateInc() {
		
	
	//Get the URL/Endpoint for the services
	RestAssured.baseURI = "https://dev78371.service-now.com/api/now/table/incident";
	
	//Authentication (basic)
	RestAssured.authentication = RestAssured.basic("admin", "bv0MMhw0tUXC");
	
	//Request type - Get -> Response
	Response response = RestAssured
			.given()
			.log()
			.all()
			.contentType(ContentType.JSON)
			.body("{\r\n" + 
					"    \"short_description\": \"Short description created\",\r\n" + 
					"    \"description\": \"Description created via postman\",\r\n" + 
					"    \"category\": \"Rest API\"\r\n" + 
					"}")
			.put("b74d4c592f123010efcac786f699b679");
	
	//Validate Response code
	System.out.println(response.getStatusCode());
	
	//Check the response format
	System.out.println(response.getContentType());
	
	//print the response from postman console
	response.prettyPrint();
	
	
		
	}
	
}
