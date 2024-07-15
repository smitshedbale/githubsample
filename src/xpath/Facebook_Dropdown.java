package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Dropdown {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver", "C:\\\\Users\\\\dell\\\\Downloads\\\\edgedriver_win64\\\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(5000);
		//Select day dropdown
		WebElement name = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s=new Select(name);
		s.selectByVisibleText("20");
		
		//Select month dropdown
		Thread.sleep(5000);
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s1=new Select(month);
		s1.selectByVisibleText("Apr");
		
		//Select year dropdown
		Thread.sleep(5000);
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select s2=new Select(year);
		s2.selectByVisibleText("1987");
	}

}
