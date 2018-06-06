package SELENIUM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.testng.annotations.Test;

public class Class16 {
	@Test
	public void note() throws InterruptedException, AWTException, IOException{
Runtime.getRuntime().exec("notepad.exe");
		
		//goto file menu
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_F);
	    r.keyRelease(KeyEvent.VK_F);
	    r.keyRelease(KeyEvent.VK_ALT);
	    Thread.sleep(3000);
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(3000);
        StringSelection s=new StringSelection("this is window based testing");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
	    Thread.sleep(3000);
	    r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
	    r.keyRelease(KeyEvent.VK_V);
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    Thread.sleep(3000);
	    r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    Thread.sleep(3000);
	    StringSelection i=new StringSelection("F:\\Izaz\\Workspace\\Project1\\src");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(i,null);
	    Thread.sleep(3000);
	    r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
	    r.keyRelease(KeyEvent.VK_V);
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    Thread.sleep(3000);
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(3000);
	    r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_F4);
	    r.keyRelease(KeyEvent.VK_F4);
	    r.keyRelease(KeyEvent.VK_ALT);
	    
        

	    
	    
	    
	}

}
