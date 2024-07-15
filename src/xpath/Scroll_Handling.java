package xpath;

import java.awt.Window;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Scroll_Handling {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\dell\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,4000)"); //positive y axis means scrolls down
		Thread.sleep(5000);
		jse.executeScript("window.scrollBy(0,-3000)");//negative y axis means scrolls up
		
	
	}

}
