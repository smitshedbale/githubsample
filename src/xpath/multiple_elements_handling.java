package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class multiple_elements_handling {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\dell\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		int count=0;
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		List<WebElement> allelem = driver.findElements(By.xpath("//div"));
		for(WebElement ele1:allelem)
		{
			String text=ele1.getText();
			System.out.println(text);
			count++;
	    }
      System.out.println(count);
	}
}