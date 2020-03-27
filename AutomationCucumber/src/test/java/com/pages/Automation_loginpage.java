package com.pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Excel.Excel_login;

public class Automation_loginpage extends Excel_login {
	static WebDriver driver;
	By account1=By.xpath("/html/body/div[1]/div[1]/header/div[2]/nav/ul/li[2]/a");
	By email=By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div[1]/form/p[1]/input");
	By password=By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div[1]/form/p[2]/input");
	By loginbutton=By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div[1]/form/p[3]/input[3]");
	By logoutt=By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/nav/ul/li[6]/a");
public void url() { // url for launch the chrome
	System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
}
public void loginPage() throws InterruptedException //using webdriver get visting the testing website
{
	driver.get("http://practice.automationtesting.in/");
	System.out.println(driver.getTitle());
	Thread.sleep(5000);
	 
}
public void loginDeatils() throws IOException, InterruptedException
{
	driver.findElement(account1).click(); // move to to element achiving by creating object
	for(int i=0;i<=4;i++)
	{
	Excel_login el=new Excel_login();
	driver.findElement(email).sendKeys(el.excel_username(i)); // passing the vaild mail
	driver.findElement(password).sendKeys(el.excel_password(i)); // passing the vaild password
	driver.findElement(loginbutton).click();
	Thread.sleep(9000);
	driver.findElement(logoutt).click();
}
}
public void submit1() throws InterruptedException, IOException
{
	TakesScreenshot ts=(TakesScreenshot)driver;
	File Source=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Source, new File("src\\test\\resources\\screenshot\\login.png"));

	driver.close();
}}

