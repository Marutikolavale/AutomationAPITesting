package Session07;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class QueryParamter {
	@Test
	public void FF()
	{
		Logger p= LogManager.getLogger("QueryParamter");
		RequestSpecification res=RestAssured.given();
		//spciflyUrl
		res.baseUri("https://reqres.in/");
		res.basePath("api/users");
		res.queryParam("page", 2).queryParam("id", 10);
		//Perform get  Request
		Response ans = res.get();
		//res response body
		String	a=ans.getBody().asString();
		//Print response body
		System.out.println("ResponsBody"+a);
		p.info("print Responce body");
		//get json path view of response body
		JsonPath d = ans.jsonPath();
		//get first_Name
		//x.data.first_name
		String firstName = d.get("data.first_name");
		Assert.assertEquals("Byron",firstName);


	}
}
