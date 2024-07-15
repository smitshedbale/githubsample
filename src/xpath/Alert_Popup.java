package xpath;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alert_Popup {
	public static void main(String[] args) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\dell\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			WebDriver driver=new EdgeDriver();
			driver.get("https://demo.guru99.com/test/delete_customer.php");
			driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1234");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
		//Transfer cntrl to Alert popup
			Alert alt = driver.switchTo().alert();
            alt.accept();//clicks OK
            //To click cancel button 
           // alt.dismiss();
	}

	
}
