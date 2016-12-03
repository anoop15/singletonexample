package com.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import javax.management.InstanceAlreadyExistsException;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.config.configration;
import com.utility.Driver;
import com.utility.testbase;

public class suit2 extends testbase{

	
	@Test
	public void search(){
		Driver.Instance.get(configration.url.app_url);
		Driver.Instance.findElement(By.name("email")).sendKeys("anu.lovi@gmail.com");
		Driver.Instance.findElement(By.name("pass")).sendKeys("redrose4you");
		Driver.Instance.findElement(By.id("loginbutton")).click();
		String actual = Driver.Instance.findElement(By.xpath(".//*[@id='u_0_2']/div[1]/div[1]/div/a/span")).getText();
		AssertJUnit.assertEquals(actual, "Anoop");
	}
}
