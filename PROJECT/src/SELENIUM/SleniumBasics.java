package SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleniumBasics {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumhq.org");
		/*String se=driver.findElement(By.xpath("//label[@for='q']")).getAttribute("title");
		if(se.equals("Search SeleniumHQ.org's sites for selenium content"));
		{
		System.out.println("Place holder is  verified---------------pass");
		}
		 else
		{
			System.out.println("Place holder not  verified---------------fail");
		}*/
		
		
		
		/*String sp=driver.findElement(By.xpath("//a[@title='Selenium Projects']")).getAttribute("title");
        if(sp.equals("Selenium Projects"));
        {
        	System.out.println("Tool tip verified---- pass");
        }
        {
        	System.out.println("Tool tip not verfied----fail");

        }*/
		
		
		
		
		 
		/*String gs=driver.findElement(By.xpath("//a[@title='Get Selenium']")).getAttribute("title");
        if(gs.equals("Download"));{
        	System.out.println("Tool tip verified---- pass");
        }else
        {
        	System.out.println("Tool tip not verified----fail");

        }*/
		
		
		/*String gd=driver.findElement(By.xpath("(//a[text()='Documentation'])[1]")).getAttribute("title");
        if(gd.equals("Documentation"));
        {
        	System.out.println("Tool tip verified---- pass");
        }
        {
        	System.out.println("Tool tip not verified----fail");

        }*/ 
		
		String support=driver.findElement(By.xpath("//a[@title='Get help with Selenium']")).getAttribute("title");
        if(support.equals("Support"));
        {
        	System.out.println("Tool tip verified---- pass");
        }
        {
        	System.out.println("Tool tip not verified----fail");

        }
		
		
		
        
	}
	
}
