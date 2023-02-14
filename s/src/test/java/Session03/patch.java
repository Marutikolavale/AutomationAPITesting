package Session03;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class patch {
	@Test
	public void patch1()
{
		JSONObject json = new JSONObject();
		json.put("name","syali");
		json.put("Job","techar");
		
		RestAssured.baseURI="https://reqres.in/api/users/92";
		RestAssured.given().header("contant-type","application/json").
		contentType(ContentType.JSON).body(json.toJSONString()).when().patch()
		.then().statusCode(200).log().all();
		}
}
