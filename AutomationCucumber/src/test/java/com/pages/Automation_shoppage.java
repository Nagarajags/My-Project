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

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Automation_shoppage {
static WebDriver driver;
By shop=By.xpath("/html/body/div[1]/div[1]/header/div[2]/nav/ul/li[1]/a");
By add=By.xpath("/html/body/div[1]/div[2]/div/div/ul/li[2]/a[2]");
public void url() { // url for launch the chrome
	System.setProperty("webdriver.chrome.driver",  "src\\test\\resources\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
}
public void shopPage() throws InterruptedException //using webdriver get visting the testing website
{
	driver.get("http://practice.automationtesting.in/");
	System.out.println(driver.getTitle());
	Thread.sleep(5000);
	 
}
public void shopDeatils()
{
	driver.findElement(shop).click(); // move to to element achiving by creating object
	driver.findElement(add).click();
}
public void submit2() throws InterruptedException, IOException
{
Thread.sleep(3000);
TakesScreenshot ts=(TakesScreenshot)driver;
File Source=ts.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(Source, new File("src\\test\\resources\\screenshot\\shop.png")); // loging button

	driver.close();
}}

