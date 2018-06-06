package SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class13 {
	@Test
	public void js() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","E:\\softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.id("Email"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments.style.border='2px dashed green';e");
	}

}
