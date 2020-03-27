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

public class Automation_Testcasepage {
static WebDriver driver;
By testcase=By.xpath("/html/body/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a");
By navi=By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div/div/div/div[1]/div[1]/ul/li[1]/div[1]/a/i[1]");
By sr=By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div/div/div/div[1]/div[1]/ul/li[1]/div[2]/p/span[3]");
public void url() { // url for launch the chrome
	System.setProperty("webdriver.chrome.driver",  "src\\test\\resources\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
}
public void TestcasePage() throws InterruptedException //using webdriver get visting the testing website
{
	driver.get("http://practice.automationtesting.in/");
	System.out.println(driver.getTitle());
	Thread.sleep(5000);
}
public void testcaseDeatils()
{
	driver.findElement(testcase).click();
	driver.findElement(navi).click();
}
public void submit4() throws InterruptedException, IOException
{
	String e="3) Click on Shop Menu";
	 String e1=driver.findElement(sr).getText();
	 if(e.equals(e1))
	 {
		 System.out.println("pass");// loging button
	 }
	 else
	 {
		 System.out.println("FAIL");
	 }
Thread.sleep(3000);
TakesScreenshot ts=(TakesScreenshot)driver;
File Source=ts.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(Source, new File("src\\test\\resources\\screenshot\\testcase.png")); // loging button

	driver.close();
}}
