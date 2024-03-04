package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframes {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement> frame =driver.findElements(By.tagName("frame"));
		System.out.println(frame.size());
		driver.switchTo().frame(0);
		driver.findElement(By.name("mytext1")).sendKeys("john");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.name("mytext2")).sendKeys("Harry");
		
		
		
		
		

	}

}
