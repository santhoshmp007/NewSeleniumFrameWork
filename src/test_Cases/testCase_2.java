package test_Cases;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pom_Pages.Home_page;
import test_Data.Data_Provider;
import test_Data.ExtendReport;

public class testCase_2 extends ExtendReport {

	@Test()
	public void Reverse2()
	{	
		By ele=	By.id("");	
		
		test=extent.createTest("My second case");
		//test.log(Status.INFO, "markup");
		test.log(Status.PASS, "markup");
		Assert.assertEquals("afg000000sd", "afdgdgsd");
		
    }
	
	
}
