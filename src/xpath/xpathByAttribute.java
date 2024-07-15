package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class xpathByAttribute {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\dell\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	WebDriver driver= new EdgeDriver();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("Mobiles under 20000");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
}

}
