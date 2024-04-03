package com.automation.Day2_17th_automation_introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MyFirstAutomationCode {
	
	//Ctrl+ shift + 0 - windows
	
	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
			
			WebDriver driver1 = new EdgeDriver();	//Ctrl+shift+O to run the code
			driver.manage().window().maximize();
			driver.get("https://amazon.com");

			
			
			WebDriver driver2 = new EdgeDriver();	//Ctrl+shift+O to run the code
			driver.manage().window().maximize();
			driver.get("https://walmart.com");
	}
}
