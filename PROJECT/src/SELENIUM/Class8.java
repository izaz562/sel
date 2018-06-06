package SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Class8 {
	@Test 
	public void gmail() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","E:\\softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		// create account
driver.findElement(By.partialLinkText("Create acc")).click();

// full fill blanks
driver.findElement(By.name("FirstName")).sendKeys("izaz");
driver.findElement(By.name("LastName")).sendKeys("ahammad");
driver.findElement(By.name("GmailAddress")).sendKeys("izaz0529");
Thread.sleep(2000);
driver.findElement(By.name("Passwd")).sendKeys("izaz@1993");
Thread.sleep(2000);
driver.findElement(By.name("PasswdAgain")).sendKeys("izaz@1993");
driver.findElement(By.xpath("//*[@title='Birthday']")).click();
Actions a=new Actions(driver);
a.sendKeys("f").build().perform();
a.sendKeys(Keys.ENTER).build().perform();
driver.findElement(By.name("BirthDay")).sendKeys("05");
driver.findElement(By.name("BirthYear")).sendKeys("1993");
driver.findElement(By.xpath("//*[@name='Gender']")).click();
Actions n=new Actions(driver);
n.sendKeys("M").build().perform();
n.sendKeys(Keys.ENTER).build().perform();












	}

}
