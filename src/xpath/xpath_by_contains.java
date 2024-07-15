package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class xpath_by_contains {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\dell\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://online.actitime.com/sshedbale1");
	//login username smita.shedbale@gmail.com
	//login password  qbstVgAq
	driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("smita.shedbale@gmail.com");
	driver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys("qbstVgAq");
	driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
}
}
