package SELENIUM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {

	public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "E:\\softwares\\chromedriver.exe");
WebDriver  driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://www.google.co.in");
//driver.navigate().to("http://www.google.co.in");
//Thread.sleep(5000);
//driver.navigate().back();
//driver.navigate().forward();
//driver.navigate().refresh();
driver.manage().deleteAllCookies();

	}

}
