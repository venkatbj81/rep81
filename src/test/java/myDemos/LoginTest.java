package myDemos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest 
{
	@Test
	public void login() 
	{
		WebDriverManager.chromedriver().version("90").setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://crmaccess.vtiger.com/log-in/");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("deepak.h@testyantra.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Deepak1-2");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@id='menu']")));
		
		driver.findElement(By.xpath("//i[@id='menu']")).click();
	}
}
