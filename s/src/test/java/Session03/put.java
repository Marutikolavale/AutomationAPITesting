package Session03;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class put {
@Test
	public void put1()
{
		JSONObject json = new JSONObject();
		json.put("name","Sunil");
		json.put("Job","javadeveleper");
		
		RestAssured.baseURI="https://reqres.in/api/users/92";
		RestAssured.given().header("contant-type","application/json").
		contentType(ContentType.JSON).body(json.toJSONString()).when().put()
		.then().statusCode(200).log().all();
		}
}
