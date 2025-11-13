package RestAssured;

import io.restassured.RestAssured;

public class Basic {

	public static void main(String[] args) {
		// validate if Add Place API is working as expected
		
		//given - all input details
		//when - Submit the API
		//then - Validate the response
		
		RestAssured.baseURI="https://rahulshettyacademy.com";

	}

}
