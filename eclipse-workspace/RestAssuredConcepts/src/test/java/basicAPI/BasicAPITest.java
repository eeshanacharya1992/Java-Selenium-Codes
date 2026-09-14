package basicAPI;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class BasicAPITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//given method will take all input details needed to submit for API
		//when method used to submit API - will have resource and http method
		// then method will validate the response
		//equalTo method comes from hamcrest package
		//validate response body using below code and just add method .body("scope", equalTo("APP"));
		//server validation .header("server", "Apache/2.4.52 (Ubuntu)");
		RestAssured.baseURI ="https://rahulshettyacademy.com/";
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
	.body("{\r\n"
			+ "  \"location\": {\r\n"
			+ "    \"lat\": -38.383494,\r\n"
			+ "    \"lng\": 33.427362\r\n"
			+ "  },\r\n"
			+ "  \"accuracy\": 50,\r\n"
			+ "  \"name\": \"Rahul Shetty Academy\",\r\n"
			+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
			+ "  \"address\": \"29, side layout, cohen 09\",\r\n"
			+ "  \"types\": [\r\n"
			+ "    \"shoe park\",\r\n"
			+ "    \"shop\"\r\n"
			+ "  ],\r\n"
			+ "  \"website\": \"http://rahulshettyacademy.com\",\r\n"
			+ "  \"language\": \"French-IN\"\r\n"
			+ "}\r\n"
			+ "").when().post("maps/api/place/add/json").then().log().all().assertThat()
	.statusCode(200).body("scope", equalTo("APP"))
	.header("server", "Apache/2.4.52 (Ubuntu)");
		//add place->update place with new address -> get place to validate if new address is present in response
	
	}

}
