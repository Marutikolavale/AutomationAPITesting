package Session03;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class get {
@Test
	public static  void get1()
	{
	 Response res = get("https://reqres.in/api/users/2");
	 System.out.println("status code : "+res.getStatusCode());
	 System.out.println("get body: "+res.getBody().asString());
	 System.out.println("get time: "+res.getTime());
	 System.out.println("Responce Hedar: "+res.getHeader("Contant-type"));
	 int actualStatusCode =res.getStatusCode();
	 assertEquals(actualStatusCode, 201);
	}
@Test
public  void B()
{
	baseURI="https://reqres.in/api/users";
	given()
	.queryParam("page","2")
	.when().get()
	.then().statusCode(200);
	}
}
