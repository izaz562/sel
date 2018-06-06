package SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class3 {
  @Test
  public void f() {
	  WebDriver driver=new FirefoxDriver();
	  Reporter.log("The browser is opened  now");
	  driver.manage().window().maximize();
	  Reporter.log("The browser is maximized ");
	  driver.get("https://www.google.co.in");
	  Reporter.log("The google browser are opened ");
	  driver.findElement(By.name("q")).sendKeys("grepthor software solution");
	  Reporter.log("The data \"grepthor software solution\"is enterd" );
	  
  }
}
