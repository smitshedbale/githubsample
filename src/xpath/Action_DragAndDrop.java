package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_DragAndDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\dell\\Downloads\\edgedriver_win64(1)\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
	    WebElement src = driver.findElement(By.xpath("//img[@id='drag1']"));
	   WebElement dest = driver.findElement(By.xpath("//div[@id='div2']"));
	  Actions act=new Actions(driver);
	    act.dragAndDrop(src, dest).perform();
	    		
	}
}
