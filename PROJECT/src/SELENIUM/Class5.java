package SELENIUM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class5 {
	@Test
	public void cookies() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","E:\\softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		// delete all existing cookies
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		//launch site
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);
		// testing cookies
		if(driver.manage().getCookies().size()!=0)
		{
			System.out.println("cookies loaded");
			
		}
		else
		{
			System.out.println("no cookies");
			
		}
			//close site
		driver.close();
		
	}

}
