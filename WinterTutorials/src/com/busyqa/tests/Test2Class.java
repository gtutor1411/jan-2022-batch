package com.busyqa.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2Class {
	
	// Tests for external website
	
	
	
	@BeforeTest
	public void test2_BeforeTest() {

		System.out.println("I am in test2_BeforeTest");

	}
	
	@AfterTest
	public void test2_AfterTest() {

		System.out.println("I am in test2_AfterTest");

	}
	
	@BeforeClass
	public void test2_BeforeClass() {

		System.out.println("I am in test2_BeforeClass");

	}
	
	@AfterClass
	public void test2_AfterClass() {

		System.out.println("I am in test2_AfterClass");

	}
	
	@BeforeMethod
	public void test2_BeforeMethod() {

		System.out.println("I am in test2_BeforeMethod");

	}
	
	
	@AfterMethod
	public void test2_AfterMethod() {

		System.out.println("I am in test2_AfterMethod");

	}
	
	

	@Test(priority = 1)
	public void test2_TestCase1() {
		System.out.println("I am in test2_TestCase1-completed registration");
	}

	@Test(priority = 2)
	public void test2_TestCase2() {
		System.out.println("I am in test2_TestCase2-completed login");
	}

	@Test(priority = 3)
	public void test2_TestCase3() {
		System.out.println("I am in test2_TestCase3");
	}

}
