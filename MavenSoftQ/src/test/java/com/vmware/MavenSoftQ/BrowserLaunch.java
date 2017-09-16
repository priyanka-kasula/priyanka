package com.vmware.MavenSoftQ;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch
{
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		System.out.println("hello");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.getPageSource();
		
		//driver.close();
		
		driver.quit();
		
	}

}
