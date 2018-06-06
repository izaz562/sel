package SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class15 {
	@Test
	public void gmail() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","E:\\softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
		Thread.sleep(5000);
		// enter the user id
		driver.findElement(By.id("identifierId")).sendKeys("shaikizaz123");
	
		Thread.sleep(5000);
		// enter next text
		driver.findElement(By.xpath("//span[contains(.,'Next')]")).click();
		Thread.sleep(5000);
		// enter password 
		driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys("izaz@1994");
		Thread.sleep(5000);
		// enter login
		driver.findElement(By.xpath("//span[contains(.,'Next')]")).click();
		Thread.sleep(10000);
		// click compose
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3 T-I-JW T-I-JO']")).click();
		
	} 

}
