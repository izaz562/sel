package SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class9 {
	@Test
	public void youtube() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","E:\\softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.youtube.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("selenium videos");
		driver.findElement(By.id("search-btn")).click();
	}

}
