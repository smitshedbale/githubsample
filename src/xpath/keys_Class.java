package xpath;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class keys_Class {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver", "C:\\\\Users\\\\dell\\\\Downloads\\\\edgedriver_win64\\\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		Thread.sleep(3000);
		driver.get("https://online.actitime.com/sshedbale1");
		//login username smita.shedbale@gmail.com
		//login password  qbstVgAq
		driver.findElement(By.id("username")).sendKeys("smita.shedbale@gmail.com",Keys.TAB,"qbstVgAq",Keys.ENTER);
	}

}
