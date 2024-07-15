package xpath;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class screenshotLogo {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\dell\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		WebElement logo = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		//TakesScreenshot ts= (TakesScreenshot) driver;
		File src = logo.getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\files\\googlelogo.png");
		Files.copy(src, dest);
	}

}
