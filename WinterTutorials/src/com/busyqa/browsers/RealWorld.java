package com.busyqa.browsers;

import com.busyqa.tut.Calculator;
import com.busyqa.tut.GirishBrowser;

public class RealWorld {

	public static void main(String[] args) {		
		
				
		
		System.out.println(BrinBrowser.download());
		BrinBrowser bb = new BrinBrowser();
		bb.launchBrowser();
		bb.minimize();
		bb.maximize();
		bb.goToGoogle();
		bb.closeBrowser();
		
		/*
		
		EvBrowser eb = new EvBrowser();		
		eb.launchBrowser();
		
		GirishBrowser gb = new GirishBrowser();
		gb.launchBrowser();	
		
		*/
		Calculator calc  = new Calculator();
		calc.add(5, 6);
		
		

	}

}
