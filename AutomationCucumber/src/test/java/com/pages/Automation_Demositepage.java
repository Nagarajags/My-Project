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
import org.openqa.selenium.support.ui.Select;

public class Automation_Demositepage {
	static WebDriver driver;
	By demosite=By.xpath("/html/body/div[1]/div[1]/header/div[2]/nav/ul/li[5]/a");

	By Firstname=By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[1]/input");

	By Lastname=By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[2]/input");

	By Address=By.xpath("/html/body/section/div/div/div[2]/form/div[2]/div/textarea");

	By Email=By.xpath("/html/body/section/div/div/div[2]/form/div[3]/div[1]/input");

	By Phno=By.xpath("/html/body/section/div/div/div[2]/form/div[4]/div/input");

	/*By gender=By.xpath("/html/body/section/div/div/div[2]/form/div[5]/label");
*/	By male=By.xpath("/html/body/section/div/div/div[2]/form/div[5]/div/label[1]/input");

	By Female=By.xpath("/html/body/section/div/div/div[2]/form/div[5]/div/label[2]/input");

	By hobbies=By.id("checkbox1");

	By lang1=By.xpath("/html/body/section/div/div/div[2]/form/div[7]/div/multi-select/div[1]");

	By lang2=By.xpath("/html/body/section/div/div/div[2]/form/div[7]/div/multi-select/div[2]/ul/li[8]/a");

	By Skill=By.id("Skills");

	By Country=By.xpath("/html/body/section/div/div/div[2]/form/div[9]/div/select");

	By selcountry=By.xpath("//span[@class='select2-selection select2-selection--single']");

	By inp=By.xpath("/html/body/span/span/span[1]/input");

	By ind=By.xpath("//*[@id='select2-country-results']/li");

	By year=By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[1]/select");

	By month=By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[2]/select");

	By Day=By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[3]/select");

	By pass=By.xpath("/html/body/section/div/div/div[2]/form/div[12]/div/input");

	By cpass=By.xpath("/html/body/section/div/div/div[2]/form/div[13]/div/input");

	By submit=By.id("Button1");

	public void start()
	{
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void launch_Application() throws InterruptedException
	{
		driver.get("http://practice.automationtesting.in/");
		Thread.sleep(5000);
	}
	public void Details_filling() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(demosite).click();
		driver.findElement(Firstname).sendKeys("naga");
		driver.findElement(Lastname).sendKeys("nagendra");
		driver.findElement(Address).sendKeys("Chennai");
		driver.findElement(Email).sendKeys("nagaraj0000@gmail.com");
		driver.findElement(Phno).sendKeys("9874561230");
		/*List rb=dr.findElement(gender);
		((WebElement)rb.get(0)).click();*/
		driver.findElement(male).click();
		driver.findElement(hobbies).click();
		driver.findElement(lang1).click();
		driver.findElement(lang2).click();
		
		WebElement a=driver.findElement(Skill);
		Select d1=new Select(a);
		d1.selectByVisibleText("Adobe InDesign");
		
		WebElement a1=driver.findElement(Country);
		Select d2=new Select(a1);
		d2.selectByVisibleText("India");
		
		
		driver.findElement(selcountry).click();
		driver.findElement(inp).sendKeys("India");
		driver.findElement(ind).click();
		
		WebElement a2=driver.findElement(year);
		Select d3=new Select(a2);
		d3.selectByVisibleText("2015");
		
		WebElement a3=driver.findElement(month);
		Select d4=new Select(a3);
		d4.selectByVisibleText("September");
		
		WebElement a4=driver.findElement(Day);
		Select d5=new Select(a4);
		d5.selectByVisibleText("12");
		
		driver.findElement(pass).sendKeys("Giri@123");
		driver.findElement(cpass).sendKeys("Giri@123");
		Thread.sleep(3000);
		
		}
	public void submit() throws InterruptedException, IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File Source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Source, new File("src\\test\\resources\\screenshot\\demosite.png")); // loging button

		driver.findElement(submit).click();
		Thread.sleep(3000);
		driver.close();
	}


}
