package demo.s;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestAPITesting {
@Test
	public void nana()
	{
 Response res=RestAssured.get("https://reqres.in/api/users/2");
 System.out.println(res.asString());
		
	}
}
