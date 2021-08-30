package postautocopy;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteInc extends BaseClass {

	@Test(dependsOnMethods="postautocopy.CreateInc.createNewInc")
	public void deleteInc() {
		
	
	/*//Get the URL/Endpoint for the services
	RestAssured.baseURI = "https://dev78371.service-now.com/api/now/table/incident";
	
	//Authentication (basic)
	RestAssured.authentication = RestAssured.basic("admin", "bv0MMhw0tUXC");			
	*/
	//Request type - Get -> Response
	Response response = request
			.get(sys_id);
		
		
	//Validate Response code
	System.out.println(response.getStatusCode());
	
	//Check the response format
	System.out.println(response.getContentType());
	
	//print the response from postman console
	response.prettyPrint();
	
	
		
	}
	
}
	