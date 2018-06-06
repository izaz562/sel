package SELENIUM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Class10 {
	@Test
	public void selenium() throws InterruptedException, AWTException{
		System.setProperty("webdriver.chrome.driver","E:\\softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumhq.org/download/");
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.xpath("//*[text()='Download'][1]"));
		Actions a=new Actions(driver);
		a.contextClick(e).build().perform();
		Thread.sleep(5000);
		//java code (to handle window based context model)
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);

		

	}

}
