package com.sabre.dxp.webdriver.onewayflight;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.sabre.dxp.webdriver.common.SabreDriver;

public class OneWayFlight_TC {

	
	private List<WebElement> radioButton;
	WebDriver driver;
	
	 public void datepicker(){
		 
	 }
			
	  
	 //@Test
		public void test1() throws Exception
	{
		
		
	 //1. Open Chrome Browser
	    // 2. launch ===> www.virginaustralia.com
			driver = SabreDriver.getChromeDriver();
			driver.get("https://www.virginaustralia.com/au/en/");
			Thread.sleep(1000);
			
		    

		//3. Click on Departure text box
		//3.a. ==> Recognize the text box ==> oBrowser.findElement(By.id("react-select-3--value"))
		//3.b then Enter value to the text box
			//driver.findElements(By.name("trip_type")).get(1).click();
			//driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id='flights-form']/fieldset/div[3]/fieldset/label[1]/span")).click();
			//Thread.sleep(1000);
			driver.findElement(By.id("flights-originSurrogate")).sendKeys("Sydney (SYD)");
			//driver.findElement(By.id("flights-originSurrogate")).sendKeys(Keys.TAB);
			//Thread.sleep(1000);
			//driver.findElement(By.id("flights-destinationSurrogate")).click();
			driver.findElement(By.id("flights-destinationSurrogate")).sendKeys("Brisbane (BNE)");
			//Thread.sleep(1000);
			//driver.findElement(By.id("flights-destinationSurrogate")).sendKeys(Keys.TAB);
			//Thread.sleep(1000);
			driver.findElement(By.id("flights-departure-date")).click();
			WebElement webElements = driver.findElement(By.xpath("//*[@id='dp1495512731134']/div/div[1]"));
			WebElement webElements1 = driver.findElement(By.xpath("//div[contains(@class,'ui-datepicker-group-first')]/table/tr[4]"));
			WebElement webElements2 = driver.findElement(By.xpath("//div[contains(@class,'ui-datepicker-group-first')]/table"));
			//driver.findElement(By.xpath("//div[contains(@class,'ui-datepicker-group-first')]/table/tbody/tr[4]/td[3]/a")).click();
		    //driver.findElement(By.id("flights-submit")).submit();
	}
	 
	@Test
	public void dxpInChrome() throws Exception
{
	
	
 //1. Open Chrome Browser
    // 2. launch ===> www.virginaustralia.com
		driver = SabreDriver.getChromeDriver();
		driver.get("https://www.virginaustralia.com/au/en/");
		Thread.sleep(1000);
		
	    

	//3. Click on Departure text box
	//3.a. ==> Recognize the text box ==> oBrowser.findElement(By.id("react-select-3--value"))
	//3.b then Enter value to the text box
		//driver.findElements(By.name("trip_type")).get(1).click();
		//driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='flights-form']/fieldset/div[3]/fieldset/label[1]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("flights-originSurrogate")).sendKeys("Sydney (SYD)");
		//driver.findElement(By.id("flights-originSurrogate")).sendKeys(Keys.TAB);
		Thread.sleep(1000);
		//driver.findElement(By.id("flights-destinationSurrogate")).click();
		driver.findElement(By.id("flights-destinationSurrogate")).sendKeys("Brisbane (BNE)");
		//Thread.sleep(1000);
		//driver.findElement(By.id("flights-destinationSurrogate")).sendKeys(Keys.TAB);
		Thread.sleep(1000);
		driver.findElement(By.id("flights-departure-date")).click();
	    driver.findElement(By.id("flights-submit")).click();
	    //driver.findElement(By.xpath("//div[2]/div[4]/div/div[1]/table/tbody/tr[1]/td[4]/a")).click();
		driver.findElement(By.xpath("//*/div/div[2]/table/tbody/tr[1]/td[4]/a")).click();
	    driver.findElement(By.id("flights-submit")).submit();
	    Thread.sleep(5000);
	    //driver.findElement(By.id("yui_3_1_2_1_14955167919886073")).click();
	 
		
		
		
		
		
	
		
		
		
		
	
		//driver.findElement(By.id("frm_2012158061206//*[@id="flights-form"]/fieldset/div[3]/fieldset/label[1]/span151238")).click();
		// Pick departure date
		
		/*WebElement dateBox = driver.findElement(By.xpath("//*[@id="ui-datepicker-div"]/div[2]
				dateBox.sendKeys("05312017");*/
		
		Thread.sleep(5000);
		
}
				
			
				
		private By ByXPath(String string) {
		// TODO Auto-generated method stub
		return null;
	}


		//@AfterClass
       public void closeBrowser(){
    	   driver.close();
       }
				
		
		
		
		
		
	
		
		
		
		
		
				
	/*	
		
		sendKeys("Abu Dhabi, Abu Dhabi Airport");
		
		List<WebElement> autoSuggest = driver.findElements(By
	            .id("frm_2012158061206151234ui_autocomplete"));
	    // verify the size of the list
	    System.out
	            .println("Size of the AutoSuggets is = " + autoSuggest.size());
	
		*/
	
	
	 
	
	private void sendKeys(String string) {
		// TODO Auto-generated method stub
		
	}
}
	

