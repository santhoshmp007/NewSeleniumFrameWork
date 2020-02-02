package test_Cases;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.*;
import pom_Pages.Home_page;
import test_Data.Data_Provider;
import test_Data.ExtendReport;

public class testCase_1 extends ExtendReport{
	Data_Provider ob1=new Data_Provider("C:\\Users\\THI1706258\\Desktop\\mars\\eclipse\\Read excel23456789\\Java\\Excel\\testData_Excel.xlsx");;
	
	
	
	
	
	
	@BeforeTest
	public void BefTest()
	{
		
	}
	
	
	/*
	//@DataProvider
	//public Object[][] Data()
	//{
	//Object[][] data= ob1.Read_value("Sheet1");
	
	//return data;
	//}
	*/
	@Test(priority=1)
	public void Reverse()
	{	
		By ele=	By.id("");	
		test=extent.createTest("MyFirstTest jnkllk");	
		//test.log(Status.INFO, "markup");
		test.log(Status.PASS, "markup");
		Assert.assertEquals("afgsd", "afdgdgsd");
		
    }
	@Test(priority=1)
	public void Reverse2()
	{	
		By ele=	By.id("");	
		test=extent.createTest("MyFirstTest");	
		//test.log(Status.INFO, "markup");
		test.log(Status.PASS, "markup");
		Assert.assertEquals("afgsd", "afdgdgsd");
		
    }
	
		
}	    
	

