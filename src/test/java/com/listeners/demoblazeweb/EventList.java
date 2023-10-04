package com.listeners.demoblazeweb;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.genericlib.demoblazeweb.Base;

public class EventList implements ITestListener {

	public void onTestFailure(ITestResult result) {
	TakesScreenshot ss = (TakesScreenshot)Base.driver;
	File src=ss.getScreenshotAs(OutputType.FILE);
	long time=System.currentTimeMillis();
	File dest=new File("Screenshots/"+time+".png");
	try {
		FileUtils.copyFile(src, dest);
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	}
}
