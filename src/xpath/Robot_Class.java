package xpath;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Robot_Class {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver", "C:\\\\Users\\\\dell\\\\Downloads\\\\edgedriver_win64\\\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		Thread.sleep(5000);
		driver.get("https://www.amazon.com/");
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(5000);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
Thread.sleep(5000);
		
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
		
	}

}
