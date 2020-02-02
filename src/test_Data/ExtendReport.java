package test_Data;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import test_Cases.testCase_1;

import org.openqa.selenium.WebDriver;

public class ExtendReport {
	Data_Provider ob1=new Data_Provider("C:\\Users\\THI1706258\\Desktop\\mars\\eclipse\\Read excel23456789\\Java\\Excel\\testData_Excel.xlsx");;
	
	public WebDriver driver;
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	
	@BeforeSuite
	public  void Extend()
	{
		htmlReporter = new ExtentHtmlReporter("C:\\Users\\THI1706258\\Desktop\\mars\\eclipse\\Read excel23456789\\Java\\Extend_Report\\extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
	}
	@BeforeMethod
	public void BeforeMethod() throws IOException
	{   
		
		System.setProperty("webdriver.chrome.driver","E:\\New folder\\chromedriver.exe");
		driver=new ChromeDriver();
				
		driver.get(ob1.Read_properties_file("URL"));
			
	
	}
	
	public void close()
	{
		
	}
	
	@AfterMethod
	public void flush(ITestResult result) throws Exception
	{
	{
			
			if(result.getStatus()==ITestResult.FAILURE)
			{
				String path=ob1.Screen(driver);
				test.fail(result.getThrowable().getMessage(),MediaEntityBuilder.createScreenCaptureFromPath(path).build());
			}
			
			extent.flush();
			driver.close();
			driver.quit();
		}
		
	}
	

}
