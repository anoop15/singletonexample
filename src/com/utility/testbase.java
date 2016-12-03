package com.utility;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class testbase {
	@BeforeClass
	public void setup(){
		Driver.Initialize();
		
	}
	@AfterClass
	public void cleanup(){
	
		Driver.close();
		
	}
}
