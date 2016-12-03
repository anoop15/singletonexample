package com.test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;

import org.testng.annotations.Test;

import com.config.configration;
import com.utility.Driver;
import com.utility.testbase;

public class firsttest extends testbase{

	
	
	@Test
	public void test() throws InterruptedException{
		Driver.Instance.get(configration.url.app_url);
		Driver.Instance.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(15);
	}
	
	
}
