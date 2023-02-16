package demo.s;

import org.testng.annotations.Test;

import groovyjarjarantlr4.v4.runtime.misc.LogManager;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestAPITesting {
	@Test
	public void nana()
	{
	
		Response res=RestAssured.get("https://reqres.in/api/users/2");
		System.out.println(res.asString());
		System.out.println("status code is:"+res.getStatusCode());

	}
}
