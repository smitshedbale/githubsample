package xpath;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Child_BowserPopup {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\dell\\Downloads\\edgedriver_win64(1)\\msedgedriver.exe");
        WebDriver driver= new EdgeDriver();	
        driver.get("https://www.flipkart.com");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mobiles");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[1]")).click();
        Thread.sleep(3000);
        Set<String> allwins = driver.getWindowHandles();
        for( String win1:allwins)
        {
        	driver.switchTo().window(win1);
        	System.out.println(driver.getTitle());
        }
        String url=driver.getCurrentUrl();
        System.out.println(url);
	}

}
