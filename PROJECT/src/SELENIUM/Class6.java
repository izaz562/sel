package SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Class6 {
	@Test
	public void google() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","E:\\softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("abdulkalam");
		Thread.sleep(5000);
		Actions a=new Actions(driver);
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(2000);
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(2000);
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		// close site
		driver.close();
	}

}
