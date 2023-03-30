package com.api.tests;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Put {
	
	
	@Test
	public void putTest() {
		String body ="{\"firstname\":\"Tom\",\"lastname\":\"Cruise\",\"totalprice\":111,\"depositpaid\":true,\"bookingdates\":{\"checkin\":\"2018-01-01\",\"checkout\":\"2019-01-01\"},\"additionalneeds\":\"No BF\"}";
		
		given()
		.auth()
		.basic("admin", "password123")
		//.header("Accept",ContentType.JSON.getAcceptHeader())	
		.header("Cookie","token=da0a8dd2db18ba8")			
		.contentType(ContentType.JSON)
		.body(body)
		
		.when()
			.put("https://restful-booker.herokuapp.com/booking/7111")
		
		.then()
			.statusCode(200)
			.log().all();
	}
	
	

}
