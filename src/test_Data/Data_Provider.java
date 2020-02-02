package test_Data;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.utils.FileUtil;


//Function for loading Excel file
public class Data_Provider {
	
	XSSFWorkbook wb;
	XSSFSheet sheet;
	File file;
	FileInputStream fs;
	
	public  Data_Provider(String path)
	{
		 file= new File(path);
		try {
			 fs=new FileInputStream(file);
		} catch (Exception e) {
		  e.printStackTrace();
		}
		 try {
			wb=new XSSFWorkbook(fs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
//Function for reading excel if only one row required
	public String Read_value(String name,String column)
	{				
		sheet=wb.getSheet(name);
		 XSSFRow row=sheet.getRow(0);
		 XSSFCell cell=null;
		 int columnN=-1;
		 
		 for(int i=0;i<row.getLastCellNum();i++){
			 String val=row.getCell(i).getStringCellValue().trim();
			 String v2=column;
			 if(val.contains(v2))
			 {	 
				 columnN=i;
				
			 }
			 
			  }
		 row=sheet.getRow(1);
		 cell=row.getCell(columnN);
		 String value=String.valueOf(cell.getStringCellValue());	
		 
		 return value;
	}
	
//Function for reading excel if multiple test data required	
	public Object[][] Read_value(String name){
		sheet=wb.getSheet(name);
	Object[][] data= new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
	{
		for(int i=0;i<sheet.getLastRowNum();i++)
		{
			for(int k=0;k<sheet.getRow(0).getLastCellNum();k++)
			{
				data[i][k]=sheet.getRow(i+1).getCell(k).toString();
			}
		}
		return data;
	}
	}
	
//Function to read properties file
	public String Read_properties_file(String property) throws IOException
	
	{
		FileInputStream fi = null;
		File file=new File("C:\\Users\\THI1706258\\Desktop\\mars\\eclipse\\Read excel23456789\\Java\\Properties\\testData_Prop.Properties");
	try {
		 fi=new FileInputStream(file);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Properties pr=new Properties();
	pr.load(fi);
	
	String properties=pr.getProperty(property);
	return properties;
	}

//Function to store excel data in to map
public HashMap<String, Object> Read_ExcelToMap(String SheetName)
{   HashMap<String,Object> map= new HashMap<String,Object>();
	sheet=wb.getSheet(SheetName);
	for(int i=0;i<sheet.getLastRowNum();i++){
	String keyValue=sheet.getRow(0).getCell(i).toString();
	String Value=sheet.getRow(1).getCell(i).toString();
    
	map.put(keyValue, Value);
	}
	return map;
}
//Function to take screenshot and return path
public String Screen(WebDriver driver) throws Exception
{
	TakesScreenshot ts=(TakesScreenshot)driver;
	File fl=ts.getScreenshotAs(OutputType.FILE);
	String path="C:\\Users\\THI1706258\\Desktop\\mars\\eclipse\\Read excel23456789\\Java\\Screens\\"+System.currentTimeMillis()+".png";
    File destination=new File(path);
    FileUtils.copyFile(fl,destination);
    return path;

}

}
