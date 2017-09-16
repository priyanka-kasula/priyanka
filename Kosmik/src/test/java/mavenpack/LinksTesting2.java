package mavenpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LinksTesting2 {

	WebDriver driver;
	int count=0;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.hdfcbank.com");
	}
	
	
	@Test
	public void linkTesting2()
	{
		List<WebElement> str=driver.findElements(By.tagName("a"));
		System.out.println("Total Links in A page including empty Links is ..."+str.size());
		for (int i=0;i<str.size();i++)
		{
			if(!str.get(i).getText().isEmpty())
			{
				count++;
				System.out.println(str.get(i).getText());
			}
		}
		System.out.println("Total net Links present in page is ..."+count);
	}
	
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}