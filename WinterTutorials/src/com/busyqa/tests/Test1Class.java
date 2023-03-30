package com.busyqa.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1Class {
	// Tests for internal website

	@BeforeSuite
	public void test1_BeforeSuite() {

		System.out.println("I am in test1_BeforeSuite");

	}

	@AfterSuite
	public void test1_AfterSuite() {

		System.out.println("I am in test1_AfterSuite");

	}

	@BeforeTest
	public void test1_BeforeTest() {

		System.out.println("I am in test1_BeforeTest");

	}

	@AfterTest
	public void test1_AfterTest() {

		System.out.println("I am in test1_AfterTest");

	}

	@BeforeClass
	public void test1_BeforeClass() {

		System.out.println("I am in test1_BeforeClass");

	}

	@AfterClass
	public void test1_AfterClass() {

		System.out.println("I am in test1_AfterClass");

	}

	@BeforeMethod
	public void test1_BeforeMethod() {

		System.out.println("I am in test1_BeforeMethod");

	}

	@AfterMethod
	public void test1_AfterMethod() {

		System.out.println("I am in test1_AfterMethod");

	}

	@Test(priority = 1, enabled = true,groups="important")
	public void test1_TestCase1() {
		System.out.println("test1_TestCase1-Navigating to webiste");
		System.out.println("test1_TestCase1-Entering Details");
		System.out.println("test1_TestCase1-Test whether the details are entered correctly");
		System.out.println("Test Began");
		boolean result1;
		if ("Google".equalsIgnoreCase("Apple")) {
			System.out.println("Test Failed");
			result1 = false;
		} else {
			System.out.println("Test Passed");
			result1 = true;
		}

		boolean result2;
		if ("Apple".equalsIgnoreCase("Apple")) {
			System.out.println("Test Passed");
			result2 = true;
		} else {
			System.out.println("Test Failed");
			result2 = false;
		}
		/*
		 * assertEquals("Google", "Apple");//execution stops assertEquals("Apple",
		 * "Apple");
		 */
		
		System.out.println("Test Completed");
		assertEquals(true, result1 && result2);

	}

	@Test(dependsOnMethods = "test1_TestCase1")
	public void test1_dependentMethod() {
		System.out.println("I am in test1_dependentMethod");
	}

	@Test(priority = 2,groups="important")
	public void test1_TestCase2() {
		System.out.println("I am in test1_TestCase2-completed login");
	}

	@Test(priority = 3,groups="notimportant")
	public void test1_TestCase3() {
		System.out.println("I am in test1_TestCase3");
	}
	
	

}
