package Session12;

import static org.testng.Assert.assertEquals;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class desserlaztionjsondata {

	@Test
	public void createuser()
	{
		//create requestSpecification
		RequestSpecification r=RestAssured.given();
		r.baseUri("https://reqres.in");
		r.basePath("/api/users");

		//create Request body
		JSONObject data=  new JSONObject();
		data.put("name","maruti");
		data.put("job","QA");
		
		//create post Request
		Response Res = r.contentType(ContentType.JSON).
				body(data.toJSONString()).post();
		
		ResponseBody resbody = Res.getBody();
		//Deserialize ResponseBody i.e json response body to class object
		
		JsonpostRequestResponce Y = resbody.as(JsonpostRequestResponce.class);
		Assert.assertEquals(Y.name, "maruti");
		Assert.assertEquals(Y.job, "QA");
	}
}
