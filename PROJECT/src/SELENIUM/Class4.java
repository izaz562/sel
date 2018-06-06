package SELENIUM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class4 {
	@Test
	public void secure() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","E:\\softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);
		String x=driver.getCurrentUrl();
		if(x.contains("https"))
		{
			System.out.println("securable site");
			
		}
		else
		{
			System.out.println("not securable");
		}
		// close site
		driver.close();
	}
		
		
	}
	


