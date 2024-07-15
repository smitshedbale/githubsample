package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class xpath_by_index {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\\\Users\\\\dell\\\\Downloads\\\\edgedriver_win64\\\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://online.actitime.com/sshedbale1");
		//login username smita.shedbale@gmail.com
		//login password  qbstVgAq
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("smita.shedbale@gmail.com");
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("qbstVgAq");
		driver.findElement(By.xpath("(//div)[11]")).click();
		
	}

}
