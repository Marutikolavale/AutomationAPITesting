package Seesion08;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DigestAuto {
	@Test
	public void d()
	{
		RequestSpecification res2 =RestAssured.given();	
		res2.baseUri("http://httpbin.org");
		res2.basePath("/digest-auth/undefined/Maruti/Maruti");

		Response au = res2.auth().digest("Maruti", "Maruti").get();
		System.out.println(au.statusLine());
		System.out.println(au.body().asString());
	}
}
