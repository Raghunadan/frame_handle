package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_DynamicHandle {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement> frame =driver.findElements(By.tagName("frame"));
		System.out.println(frame.size());
		

	}

}
