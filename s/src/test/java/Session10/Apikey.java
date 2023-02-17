package Session10;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Apikey {
	@Test
	public void Key()
	{
		RequestSpecification Res4 =RestAssured.given();
		Res4.baseUri("https://api.openweathermap.org");
		Res4.basePath("/data/2.5/weather");
		Res4.queryParam("q", "Delhi").queryParam("APIKey","682594a7a4fe4398b96f5d14c507aa0d");
		Response ja = Res4.get();

		Assert.assertEquals(ja.statusCode(), 200);
		System.out.println(ja.statusLine());
		System.out.println(ja.body().asString());

	}
}
