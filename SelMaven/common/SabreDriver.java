package com.sabre.dxp.webdriver.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SabreDriver {

	
	public static WebDriver getChromeDriver(){
		System.setProperty("webdriver.chrome.driver","C:\\Deepti\\H2K\\FirstSel\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    return driver;
	}
	
	public static WebDriver getFirefoxDriver(){
		System.setProperty("webdriver.gecko.driver", "C:\\Deepti\\softwaresqa\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    return driver;
	}
}
	
		
		
	
		
		
		
		
		
				
	

	

