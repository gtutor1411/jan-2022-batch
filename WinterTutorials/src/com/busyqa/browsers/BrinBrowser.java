package com.busyqa.browsers;

public class BrinBrowser {
	
	public static double pi;

	public static boolean download() {
		System.out.println("Browser downladed");
		return true;
	}

	protected void launchBrowser() {
		System.out.println("Browser Launched");
	}

	public void navigateFwd() {
		System.out.println("Navigated fwd");
	}

	public void minimize() {
		System.out.println("Minimized");
	}

	public void maximize() {
		System.out.println("Maximized");
	}

	public void goToGoogle() {
		System.out.println("landed in google");
	}

	public void closeBrowser() {
		System.out.println("browser Closed");
	}

}
