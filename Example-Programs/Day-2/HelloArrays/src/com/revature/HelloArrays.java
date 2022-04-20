package com.revature;

import com.revature.drivers.StaticTests;

public class HelloArrays {


	public static void main(String[] args) {
		StaticTests Test = new StaticTests();
		StaticTests Test2 = new StaticTests();
		
		
		StaticTests.staticFunction();	//Must be accessed in a static way, from the class 
										//type, not an instance.
		
		Test.function();
		
		System.out.println(Test.worksVar);
		
		//System.out.println(StaticTests.worksVar);	Cannot access non statics through class
		//DOESN'T WORK								type, only through instantiation.
		
		//All instantiated objects share the same static variables.
		Test.changeIntTest();			//Output: 10, Changes static to 15
		
		Test2.changeIntTest();			//Output: 15, Different instance shared the static
										//value.
	}

}