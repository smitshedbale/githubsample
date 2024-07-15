package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class xpathByAttributenText {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver", "C:\\\\Users\\\\dell\\\\Downloads\\\\edgedriver_win64\\\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Smita");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Shedbale");
		//driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9763221744");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("smita.shedbale@gmail.com");
		Thread.sleep(7000);
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("smita.shedbale@gmail.com");
		//input[@name='reg_email_confirmation__']
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("abc");
	}

}
