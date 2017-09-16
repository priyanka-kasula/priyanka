package mavenpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LinksTesting1 
{

WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	
	@Test
	public void linktesting1()
	 {
		String expval=driver.findElement(By.linkText("Images")).getAttribute("href");
		driver.findElement(By.linkText("Images")).click();
		String actval=driver.getCurrentUrl();
		if(actval.contains(expval))
		{
			System.out.println("Images links are same \n" +  actval  +  "\n"  + expval);
		}
		else
		{
			System.out.println("Images links are different \n"+actval+"\n"+ expval);
		}
	 }
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
