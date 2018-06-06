package SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Class7 {
	@Test
	public void flipkart () throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","E:\\softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.flipkart.com");
		Thread.sleep(5000);
		// create DOM to men elemnt
		WebElement e=driver.findElement(By.xpath("//*[text()='Men']"));
		Thread.sleep(2000);
		// move mouse pointer to men
		Actions a=new Actions(driver);
		a.moveToElement(e).build().perform();
		Thread.sleep(5000);
		// close site
		driver.close();
		
	}

}
