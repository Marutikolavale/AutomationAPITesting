package Session06;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;


public class verifiyBody {

	@Test
	public void AS()
	{
		RequestSpecification res=RestAssured.given();
		res.baseUri("https://reqres.in/");
		res.basePath("api/users?page=2");
		Response r= res.get();
		ResponseBody body = r.getBody();
		String vi = body.asString();
		System.out.println("Response body"+vi);
		//Assert.assertEquals(vi.contains("Maruti"),true);
		
		JsonPath rde = body.jsonPath();
		String fisrtname = rde.get("data[0].first_name");
		Assert.assertEquals(fisrtname,"George");
	}
}
