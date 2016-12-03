package com.utility;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.config.configration;

public class Driver {

	
	public static WebDriver Instance=null;
	public static String browser= configration.Browser.browser;
	public static void Initialize(){
		if(Instance== null)
		{
			if(configration.Browser.browser.equalsIgnoreCase("ff")){
				  System.setProperty("webdriver.firefox.marionette","C:\\Users\\hp\\Downloads\\geckodriver-v0.11.1-win64\\geckodriver.exe");
				Instance= new FirefoxDriver();
			}
			else if (configration.Browser.browser.equalsIgnoreCase("Chrome")){
				System.setProperty("webdriver.chrome.driver", "C://Users//hp//Downloads//chromedriver_win32.chromedriver");
				Instance =new ChromeDriver();
			}
				else if (configration.Browser.browser.equalsIgnoreCase("ie")){
					System.setProperty("webdriver.ie.driver", "C:\\Users\\hp\\Downloads\\IEDriverServer_x64_2.53.1.IEDriverServer.exe");
					Instance =new ChromeDriver();
				}
		}
		
		Instance.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Instance.manage().window().maximize();
	}
	
	public static void close(){
		System.out.println("closing browser ");
		Instance.close();
		Instance=null;
	}
	
	public static void quit(){
		System.out.println("quiting browser ");
		Instance.quit();
		Instance=null;
	}
}
