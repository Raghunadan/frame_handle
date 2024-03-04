package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicWebTable {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://datatables.net/examples/advanced_init/dt_events.html");
		driver.manage().window().maximize();
		
		String nextButtonClassName =driver.findElement(By.id("example_next")).getAttribute("class");
		System.out.println(nextButtonClassName);
		
		List<String> names=new ArrayList<String>();
		
		while(!nextButtonClassName.contains("disabled")) {
			driver.findElement(By.id("example_next")).click();
			
			Thread.sleep(3000);
			List<WebElement> namesElements =driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td[1]"));
			for(WebElement nameElement: namesElements) {
				names.add(nameElement.getText());
				
			}
			nextButtonClassName =driver.findElement(By.id("example_next")).getAttribute("class");
			
			
		}
		for(String name : names) {
			System.out.println(name);
			
	     }
	}
}

