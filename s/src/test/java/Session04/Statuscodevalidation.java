package Session04;

import org.testng.annotations.Test;

import  static io.restassured.RestAssured.*;

public class Statuscodevalidation {
@Test
	public void getBBdSystle()
	{
		given()
		.when().get("https://reqres.in/api/users/2")
		
		.then().statusCode(200).statusLine("HTTP/1.1 200 OK");
	}
}
