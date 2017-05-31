package com.sabre.dxp.webdriver.onewayflight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sabre.dxp.webdriver.common.SabreDriver;

public class ExpediaOneWayFlight {

	
	
   @Test
	public void expediaOnewayFlight() throws InterruptedException{
	   
	   System.setProperty("webdriver.chrome.driver","C:\\Deepti\\H2K\\FirstSel\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	   
		
		
    //launch Expedia.com
	 
	driver.get("https://www.airberlin.com/en/site/start.php?utm_content=B%7cBR_[US]%3E0-General%20(en)&utm_source=bing&utm_medium=cpc&utm_campaign=B-US_BR%7C00%3D%5BUS%5D%3E00%20%5Ben%7CGeo%3AUS%5D&utm_term=air%20berlin&gclid=CMPk_vbph9QCFUuegQodWlACzA&gclsrc=ds");
	
	driver.findElement(By.id("scope-unit-1")).click();
	driver.findElement(By.id("route-outbound-VON")).sendKeys("Munich");
	driver.findElement(By.id("route-inbound-NACH")).sendKeys("Frankfurt");
	//Thread.sleep(2000);
	//driver.findElement(By.id("outboundDateField")).clear();
	Thread.sleep(2000);
	driver.findElement(By.id("outboundDateField")).sendKeys("06/24/2017");
	//Thread.sleep(2000);
	//driver.findElement(By.id("returnDateField")).clear();
	//Thread.sleep(2000);
	driver.findElement(By.id("returnDateField")).sendKeys("09/20/2017");
	Thread.sleep(2000);
	driver.findElement(By.name("submitSearch")).submit();
	
	
	

	
	

	
	
	
}
}



