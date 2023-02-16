package Session05;

import java.util.Iterator;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class heders {
	@Test
	public void heders1()
	{
		//get RequestSpcipction
		RequestSpecification res =RestAssured.given();
		//Specify base Uri
		res.baseUri("https://reqres.in/");
		//Specify path Uri
		res.basePath("/api/users/2");
		Response r=res.get();
		System.out.println(r);
		//get all headers on list
		Headers hederlist=r.getHeaders();

		for (Header header : hederlist) {

			System.out.println(header.getName()+" = "+header.getValue());
		}


	}
}
