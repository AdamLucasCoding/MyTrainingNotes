package com.revature.drivers;

public class StaticTests {
	//This variable is to test scope in static variables
	public static String staticWorksVar = "This static variable works";
	public String worksVar = "This non static variable works";
	
	
	public static int change = 10;
	
	public static void staticFunction() {
		System.out.println("Statics can run in main");
		
		System.out.println(staticWorksVar + " in this class function");
		
		return;
	}
	
	public void function() {
		System.out.println("Non statics run in main");
		
		System.out.println(worksVar + " in this class function");
	}
	
	
	//NON STATIC FUNCTION CAN ACCESS STATIC VARIABLES AND FUNCTIONS
	public void changeIntTest() {
		System.out.println(change);
		change = 15;
	}
}
