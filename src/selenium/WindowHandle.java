package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Set<String> WindowHandles = driver.getWindowHandles();
		System.out.println(WindowHandles.size());
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.findElement(By.partialLinkText("OrangeHRM, Inc")).click();
		
		Set<String> WindowHandles1 = driver.getWindowHandles();
		System.out.println(WindowHandles1.size());
		
		Iterator<String> it=WindowHandles1.iterator();
		String mainWindow= it.next();
		
		while(it.hasNext()) {
			String tabWindow= it.next();
			driver.switchTo().window(tabWindow);
			boolean elements =driver.findElement(By.xpath("//input[@id='Form_submitForm_EmailHomePage']")).isDisplayed();
			if (elements) {
				driver.findElement(By.xpath("//input[@id='Form_submitForm_EmailHomePage']")).sendKeys("raghu@gmail.com");
				
			}else {
				continue;
				
			}
		}

	}

}
