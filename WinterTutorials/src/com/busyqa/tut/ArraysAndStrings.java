package com.busyqa.tut;

public class ArraysAndStrings {

	public static void main(String[] args) {
		
		int employeeId = 1;

		int[] employeeIdArray = new int[5];

		employeeIdArray[0] = 100;
		employeeIdArray[1] = 101;
		employeeIdArray[2] = 102;
		employeeIdArray[3] = 103;
		employeeIdArray[4] = 104;

		System.out.println(employeeIdArray.length);
		System.out.println(employeeIdArray[2]);

		for (int i = 0; i < employeeIdArray.length; i++) {
			System.out.println(employeeIdArray[i]);			
		}
		
		
		
		
		//Strings 
		
		
		String country = "India,is,cold";
		
		
		/*
		System.out.println(country.concat(" is cold"));
		System.out.println(country.substring(2));
		System.out.println(country.substring(1,4));
		System.out.println(country.toUpperCase());
		System.out.println(country.toLowerCase());
		System.out.println(country.equalsIgnoreCase("CANADA"));
		*/
		
		String[] result = country.split(",");
		System.out.println(result[2]);
		
		
		

	}
	
	
		
		
	

}
