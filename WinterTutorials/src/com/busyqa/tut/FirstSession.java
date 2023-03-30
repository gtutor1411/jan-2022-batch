package com.busyqa.tut;

public class FirstSession {

	public static void main(String[] args) {

		String season = "AUTUMN";
		int temp;

		// IF,ELSE

		if (season.equalsIgnoreCase("WINTER")) {
			temp = 22;
			System.out.println(temp);
		} else {
			temp = 17;
			System.out.println(temp);
		}

		// switch Case
		int month = 5;
		switch (month) {
		case 1:
			System.out.println("JAN");
			break;
		case 2:
			System.out.println("FEB");
			break;
		case 3:
			System.out.println("MAR");
			break;
		}

		// for loop
		for (int i = 0; i <= 11; i++) {
			System.out.println("I love Canada "+i);
		}
		
		
		
		// do..while
				System.out.println("****SubModule-do-While****");
				int i = 0;
				System.out.println("Printing the list of first 10 even numbers \n");
				do {
					System.out.println(i);
					i = i + 2;
				} while (i <= 10);
				
		
				// while
				System.out.println("****SubModule-While****");
				int j = 20;
				System.out.println("Printing the list of first 10 even numbers \n");
				while (j <= 10) {
					System.out.println(i);
					j = i + 2;
				}
		
		
		

	}

}
