package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import net.bytebuddy.implementation.bytecode.assign.Assigner.EqualTypesOnly;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.containsString;
//import static org.hamcrest.Matchers.hasXPath;
import static org.hamcrest.Matchers.*;

public class Get {

	@Test(enabled=false)
	public void getTest() {
//initiate an extent report
		given()
//no prereq
		.when()
			.get("https://restful-booker.herokuapp.com/booking/7111")
			
		.then()
			.statusCode(200)
			.body("firstname",equalTo("Girish"))
			.log()
			.all();

	}
	
	
	
	@Test(enabled=false)
	public void getTestWithParams() {

		given()
			.pathParam("bookingId", "1247")
		.when()
			.get("https://restful-booker.herokuapp.com/booking/{bookingId}")
			
		.then()
			.statusCode(200)			
			.log()
			.all();

	}
	
	@Test(enabled=false)
	public void getXmlResponse() {		
		given()
		
		.when()
			.get("http://thomas-bayer.com/sqlrest/CUSTOMER/10")
		
		.then()
			.statusCode(200)
			.body("Customer.ID",equalTo("10"))
			.body("Customer.FIRSTNAME",equalTo("Sue"))
			;		
	}
	
	
	
	@Test(enabled=false)
	public void lazyTest() {
		
		given()
		
		.when()
			.get("http://thomas-bayer.com/sqlrest/CUSTOMER/10")
			
		.then()
			
			.body("CUSTOMER.text()",containsString("Sue"))
			.statusCode(200);
	}
	
	
	@Test(enabled=false)
	public void getTestXpath() {		
		given()
		
		
		.when()
			.get("http://thomas-bayer.com/sqlrest/CUSTOMER/10")
		
		.then()
			.body(hasXPath("/CUSTOMER/ID",containsString("10")))
			.statusCode(200);	
		
	}
	
	
	
	@Test(enabled=false)
	public void grabbingOtherResponseParameters() {		
		Response response =
				given()		
				.when()
					.get("http://thomas-bayer.com/sqlrest/CUSTOMER/10");
		/*
		.then()
			.body(hasXPath("/CUSTOMER/ID",containsString("10")))
			.statusCode(200);
			
		*/
		
		System.out.println(response.getHeader("Content-Type"));
		//Suppose you want to validate mulitple headers
		Headers headers =response.getHeaders();
		for(Header h: headers) {
			System.out.println(h.getName()+"--->"+h.getValue());
		}
		
		
	}
	
	@Test(enabled=false)
	public void getCookiesFromResponse() {
		Response response =
				given()		
				.when()
					.get("http://thomas-bayer.com/sqlrest/CUSTOMER/10");
		
		System.out.println(response.getCookie("GIVETHECOOKIENAMEHERE"));
		
	}
	
	
	@Test(enabled=true)
	public void getBooking() {
		boolean result1=false;
		boolean result2=false;
		boolean result3= false;
		RestAssured.baseURI="https://restful-booker.herokuapp.com/booking/4881";
		RequestSpecification httpRequest=RestAssured.given();
		Response response = httpRequest.get(); 
		//statuscode
		if(response.getStatusCode()==200) {
			System.out.println("Statuscode Passed");
			result1=true;
		}else {
			System.out.println("Statuscode Failed");
		}
		
		//headers
		if(response.getHeader("Content-Type").contains("application/json")) {			
			System.out.println("headers Passed");
			result2=true;
		}else {
			System.out.println("headers Failed");
		};
		
		ResponseBody responseBody=response.getBody();
		String stringBody=responseBody.asString();
		System.out.println(stringBody);
		
		if(stringBody.contains("firstname")) {			
			System.out.println("body Passed");
			result3=true;
		}else {
			System.out.println("body Failed");
		};
		
		Assert.assertTrue(result1&&result2&&result3);
		
		
	}
	
	

}
