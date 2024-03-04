package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calanderHandle {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		String Year =  "2024";
		String Month = "March";
		String Date = "30";
		driver.findElement(By.id("datepicker")).click();
		
		
		while(true) {
			String mon =driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String yr =driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(mon.equals(Month) && yr.equals(Year)) {
				break;
				
				
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			
			
		}
		List<WebElement> allDates =driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for(WebElement dt: allDates) {
			if(dt.getText().equals(Date)) {
				dt.click();
				
			}
		}
		
		

	}

}
