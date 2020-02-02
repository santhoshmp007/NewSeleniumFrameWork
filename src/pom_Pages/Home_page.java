package pom_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import test_Cases.testCase_1;
import test_Data.Data_Provider;


public class Home_page {
	//Data_Provider ob1=new Data_Provider("");
	//testCase_1 ob2=new testCase_1();
	/////////////////////////Objects////////////////////////////////////
	
	public By passWord=By.xpath("//*[text()='Enter Password']");
	public By login_Button=By.xpath("(//span[text()='Login'])[2]");
	public By userName=By.xpath("//*[@id='tsf']/div[2]/div[1]/div[1]/div/div[2]/input");
	
	///////////////////////Functions//////////////////////////////////////
	public void enterUserName(WebDriver driver, String search)
	{		
		
		driver.findElement(userName).sendKeys(search);;
	}
	public void enterPassword(WebDriver driver)
	{
		//driver.findElement(passWord).sendKeys(ob1.Read_value("Sheet1","sfdgfd"));
	}
	public void logIn(WebDriver driver)
	{
		//driver.findElement(login_Button).sendKeys(ob1.Read_value("Sheet1","sfdgfd"));
	}

}
