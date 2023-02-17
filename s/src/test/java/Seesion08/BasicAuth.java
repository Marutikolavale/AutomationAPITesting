package Seesion08;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BasicAuth {
	@Test
	public void auth()
	{
		RequestSpecification res1 =RestAssured.given();
		res1.baseUri("https://postman-echo.com");
		res1.basePath("/basic-auth");
		Response f = res1.auth().basic("postman", "password").get();
		System.out.println("Response status"+ f.statusLine());
		System.out.println(f.body().asString());
	}
}
