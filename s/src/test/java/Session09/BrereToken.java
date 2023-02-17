package Session09;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class BrereToken {
@Test
	public void Token()
	{
	RequestSpecification res3=RestAssured.given();
	res3.baseUri("https://gorest.co.in");
	res3.basePath("/public/v2/users	");
	
	JSONObject jO = new JSONObject();
	}
}
