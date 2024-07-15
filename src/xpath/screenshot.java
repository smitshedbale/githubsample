package xpath;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class screenshot {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\dell\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.com/");
		TakesScreenshot ts= (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\files\\amazonpage.png");
		Files.copy(src, dest);
	}

}
