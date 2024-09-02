package request;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get {
	@Test
	public void getRequest() {
		RestAssured.baseURI ="http://reqres.in/api/users";
		RequestSpecification httprequest = RestAssured.given();
		Response response = httprequest.request(Method.GET,"/2");
		String asString = response.getBody().asString();
		System.out.println(asString);
	      String responsebody = response.getBody().prettyPrint();
	     //System.out.println("The response body is:" +responseBody);
	     
	   int statusCode = response.getStatusCode();
	     System.out.println("The status code is:"+statusCode);
	     
	        
	     Assert.assertEquals(statusCode, 200);
	     
	     String statusLine = response.statusLine();
	     System.out.println("The status line is:" +statusLine);
	     
	     String fst_name= response.getBody().jsonPath().getString("data.first_name");
	     System.out.println("First name is:" +fst_name);
	     
	     Assert.assertEquals(fst_name,"Janet");
	     
	     
	 

}
	
	public void learnPOST() {
		
	    RestAssured.baseURI="https://gorest.co.in/public/v1/users";
		
		RequestSpecification httprequest = RestAssured.given();
		
		JSONObject inputparms = new JSONObject();
		//inputparms.put("id",2303275);
		inputparms.put("name", "testuser047");
		inputparms.put("email", "testuser12311@gmail.com");
		inputparms.put("gender", "male");
		inputparms.put("status", "inActive");
		String token="6897546b680dcb81bc1d426cdd6190cecac062b1b9790e4e5c27016145c356b2";
		httprequest.header("Content-Type","application/json");
		httprequest.header("Authorization","Bearer " +token);
		httprequest.body(inputparms.toString());
	    Response response = httprequest.request(Method.POST);  
	    String responsebody = response.getBody().asString();
	    System.out.println("The body of the response is:" +responsebody);
	    int statusCode = response.getStatusCode();
	    System.out.println("The status code is:"+statusCode);
	    Assert.assertEquals(statusCode,201);
	    String statusLine = response.statusLine();
	    System.out.println("The status line is:" +statusLine);
	    
		
		
	}

	
	@Test
	
	public void learnPut() {
		RestAssured.baseURI="https://gorest.co.in/public/v1/users";
		RequestSpecification httprequest = RestAssured.given();
		
		JSONObject inputparms = new JSONObject();
		//inputparms.put("id",2303275);
		inputparms.put("name", "testuser654321");
		inputparms.put("email", "testuser099977@gmail.com");
		inputparms.put("gender", "Male");
		inputparms.put("status", "Inactive");
		
		String token ="6897546b680dcb81bc1d426cdd6190cecac062b1b9790e4e5c27016145c356b2";	
		httprequest.header("Content-Type","application/json");
		httprequest.header("Authorization","Bearer " +token);
		
		httprequest.body(inputparms.toJSONString());
		
	    Response response = httprequest.request(Method.PUT,"/7368219");
	    
	    String responsebody = response.getBody().asString();
	    System.out.println("The body of the response is:" +responsebody);
	    
	    int statusCode = response.getStatusCode();
	    System.out.println("The status code is:"+statusCode);
	    
	    Assert.assertEquals(statusCode,200);
	    
	    String statusLine = response.statusLine();
	    System.out.println("The status line is:" +statusLine);
	    
	 
		
		
		
		
		
		
	}
	@Test
	public void learnDELETE() {
	RestAssured.baseURI="https://gorest.co.in/public/v1/users";
	RequestSpecification httprequest = RestAssured.given();
	String token ="6897546b680dcb81bc1d426cdd6190cecac062b1b9790e4e5c27016145c356b2";
	httprequest.header("Content-Type","application/json");
	httprequest.header("Authorization","Bearer " +token);
	Response response = httprequest.request(Method.DELETE,"/7368219");
	String responsebody = response.getBody().asString();
	System.out.println("The body of the response is:" +responsebody);
	int statusCode = response.getStatusCode();
	System.out.println("The status code is:"+statusCode);
	Assert.assertEquals(statusCode,204);
	String statusLine = response.statusLine();
	System.out.println("The status line is:" +statusLine);
	Assert.assertEquals(statusLine, "HTTP/1.1 204 No Content");
	}

	
}	
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
