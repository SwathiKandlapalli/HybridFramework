package com.genericlib.demoblazeweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {

	public static WebDriver driver;
	
	@BeforeTest
	public void configBT() {
		driver=new ChromeDriver();
	}
	@AfterTest
	public void configAT() {
		driver.quit();
	}
}
