package Session03;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Delete {
	@Test
	public void delete1()
	{
		RestAssured.baseURI="https://reqres.in/api/users/92";
		RestAssured.given().when().delete().then().log().all();
	}
}
