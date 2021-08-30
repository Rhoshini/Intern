package postauto;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class GetInc {

	@Test
	public void getTheInc() {
		
	
	//Get the URL/Endpoint for the services
	RestAssured.baseURI = "https://dev78371.service-now.com/api/now/table/incident";
	
	//Authentication (basic)
	RestAssured.authentication = RestAssured.basic("admin", "bv0MMhw0tUXC");
	
	//Request type - Get -> Response
	Response response = RestAssured
			.given()
			.param("catagory", "software")
			.param("sysparm_fields", "number,sys_id")
			.accept(ContentType.XML)
			.get();
	
	//Validate Response code
	System.out.println(response.getStatusCode());
	
	//Check the response format
	System.out.println(response.getContentType());
	
	//print the response from postman console
	response.prettyPrint();
	
	/*to get the response in json
	JsonPath jsonresponse = response.jsonPath();
	
	//to get the incident numbers
	List<String> incnums = jsonresponse.getList("result.number");
	
	//to get the number of incs in the list
	System.out.println(incnums.size());*/

	//to get the response in xml
	XmlPath xmlresponse = response.xmlPath();
	
	//to get the inc number in xml
	List<Object> incnumsxml = xmlresponse.getList("response.result.number");
	
	//to get the number count
	System.out.println(incnumsxml.size());
	
		
	}
	
}
