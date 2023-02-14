package Session03;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class postData {
@Test
	public void post1()
	{
		JSONObject json = new JSONObject();
		json.put("name","Maruti");
		json.put("Job","QA");
		
		RestAssured.baseURI="https://reqres.in/api/users";
		RestAssured.given().header("contant-type","application/json").
		contentType(ContentType.JSON).body(json.toJSONString()).when().post()
		.then().statusCode(201 ).log().all();
		
	}
}
