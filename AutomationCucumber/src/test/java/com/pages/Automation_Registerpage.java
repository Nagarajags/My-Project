package com.pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Excel.Excel_login;

public class Automation_Registerpage extends Excel_login{
	static WebDriver driver;
	
	
	 By account1=By.xpath("/html/body/div[1]/div[1]/header/div[2]/nav/ul/li[2]/a");
	By email=By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div[2]/form/p[1]/input");
	By password=By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div[2]/form/p[2]/input");
	By registerbutton=By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div[2]/form/p[3]/input[3]");
	By signoutt=By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/nav/ul/li[6]/a");
	
	
public void url() { // url for launch the chrome
	System.setProperty("webdriver.chrome.driver",  "src\\test\\resources\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
}
public void RegisterPage() throws InterruptedException //using webdriver get visting the testing website
{
	driver.get("http://practice.automationtesting.in/");
	System.out.println(driver.getTitle());
	 
}
public void RegisterDeatils() throws InterruptedException, IOException
{
	driver.findElement(account1).click(); // move to to element achiving by creating object
	for(int i=0;i<=4;i++)
	{
		Excel_login el=new Excel_login();
	
	driver.findElement(email).sendKeys(el.excel_username(i)); // passing the vaild mail
	driver.findElement(password).sendKeys(el.excel_password(i));
	Thread.sleep(20000);
	driver.findElement(registerbutton).click();
	Thread.sleep(3000);
	driver.findElement(signoutt).click();
	/*driver.close();
	Thread.sleep(4000);
	driver.findElement(email).sendKeys("nagarajags453@gmail.com"); // passing the vaild mail
	driver.findElement(password).sendKeys("Ngaraja#432$21");// passing the vaild password
*/
	}
	
	}	
public void submit() throws InterruptedException, IOException
{
	TakesScreenshot ts=(TakesScreenshot)driver;
	File Source=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Source, new File("src\\test\\resources\\screenshot\\register.png")); // loging button
Thread.sleep(3000);
	driver.close();
}}

