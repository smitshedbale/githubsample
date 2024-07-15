package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\dell\\Downloads\\edgedriver_win64(1)\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.google.com/");
		WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		Actions act= new Actions(driver);
		act.moveToElement(gmail).contextClick().perform();
		//act.moveToElement(gmail).doubleClick().perform();
		//If you want to connect 2 or more methods then we use buiild method
		act.moveToElement(gmail).contextClick().doubleClick().build().perform();
	}

}
