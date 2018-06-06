package SELENIUM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.testng.annotations.Test;

public class Class14 {
	@Test
	public void cal() throws IOException, AWTException, InterruptedException{
		Runtime.getRuntime().exec("calc.exe");
		Thread.sleep(5000);
		StringSelection s=new StringSelection("12345");
		Toolkit.getDefaultToolkit().getSystemClipboard().getContents("s,null");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ADD);
		r.keyRelease(KeyEvent.VK_ADD);
		
	}

}
