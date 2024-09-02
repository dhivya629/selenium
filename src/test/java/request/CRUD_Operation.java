package request;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class CRUD_Operation {
	@Test
	public void GetRequest() {
		
	
	RestAssured.baseURI="http://reqres.in/api/users";
	 RequestSpecification httprequest = RestAssured.given();
     Response response = httprequest.request(Method.GET);
     String responsebody = response.getBody().prettyPrint();
     System.out.println(responsebody);
     int statusCode = response.statusCode();
     Assert.assertEquals(statusCode, 200);
     
     String statusLine = response.statusLine();
     System.out.println("The status line is:" +statusLine);
     Assert.assertEquals(statusLine,"HTTP/1.1 200 OK" );
     
    
     
     

}
}