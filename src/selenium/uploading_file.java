package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploading_file {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=driver;
		
		WebElement choosefile =driver.findElement(By.xpath("//input[@id='uploadfile']"));
		js.executeScript("arguments[0].scrollIntoView();", choosefile);
		Thread.sleep(5000);
		choosefile.sendKeys("C:\\Users\\Ramya Kyatham\\OneDrive\\Pictures\\upload1.jpg");
		

	}

}
