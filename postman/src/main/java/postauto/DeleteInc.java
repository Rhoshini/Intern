package postauto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.codehaus.groovy.transform.EqualsAndHashCodeASTTransformation;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class DeleteInc {

	@Test
	public void deleteInc() {
		
	
	//Get the URL/Endpoint for the services
	RestAssured.baseURI = "https://dev78371.service-now.com/api/now/table/incident";
	
	//Authentication (basic)
	RestAssured.authentication = RestAssured.basic("admin", "bv0MMhw0tUXC");
	
	List<Header> headerlist = new ArrayList<Header>();
	headerlist.add(new Header("content-type", "application/json"));
	headerlist.add(new Header("accept", "application/xml"));
	
	Headers headersMap = new Headers(headerlist);
	
	//Request type - Get -> Response
		Response response = RestAssured
				.given()
				.log()
				.all()
				.param("sysparm_limit",	"1")
				.headers(headersMap)
				.get();
				
	
	/*//Request type - Get -> Response
	Response response = RestAssured
			.given()
			.log()
			.all()
			.contentType(ContentType.JSON)
			.delete("b34d80992f123010efcac786f699b6ce");*/
	
/*	//Request type - Get -> Response
	Response response = RestAssured
			.given()
			.log()
			.all()
			.param("sysparm_limit", "1")
			.contentType(ContentType.JSON)
			.get()
			.then()
			.statusCode(200)
			.assertThat()
			.body("result.number", equalTo("INC0000011"));
	*/
		
		Map<String, String> cookies = response.getCookies();
		for (Entry<String, String> eachCookie : cookies.entrySet()) {
			System.out.println(eachCookie.getKey());
			System.out.println(eachCookie.getValue());
			
		}
		
		
	//Validate Response code
	System.out.println(response.getStatusCode());
	
	//Check the response format
	System.out.println(response.getContentType());
	
	//print the response from postman console
	response.prettyPrint();
	
	
		
	}
	
}
