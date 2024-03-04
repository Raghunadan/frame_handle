package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame_Handling {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		List<WebElement> frame= driver.findElements(By.tagName("iframe"));
		System.out.println("frame");
		driver.switchTo().frame(0);
		driver.findElement(By.name("RESULT_TextField-0")).sendKeys("Raghu");
		
		
		

	}

}
