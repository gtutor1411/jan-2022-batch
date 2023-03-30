package com.api.tests;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;
import java.util.Map;

public class Delete {
	
	
	@Test
	public void delTest() {
		
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Cookie", "token=2758e134eae777e");
		
		given()
			.auth()
			.basic("admin", "password123")
			//.header("Accept",ContentType.JSON.getAcceptHeader())	
			.header("Cookie","token=0c766a55dc0c0bb")			
			.contentType(ContentType.JSON)
			//.headers(headers)
		.when()
			.delete("https://restful-booker.herokuapp.com/booking/11427")
		.then()
			.statusCode(201)
			.log().all();
		
		
	}

}

