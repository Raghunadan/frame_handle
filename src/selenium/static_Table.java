package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class static_Table {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
		System.out.println("Number of rows:"+rows.size());
		List<WebElement> columns =driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th"));
		System.out.println("Number of columns:"+columns.size());
		//String cellvalue =driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[5]/td[4]")).getText();
		//System.out.println("Cell Value is:"+cellvalue);
		
		
//		for(int r=2; r<=rows.size(); r++) {
//			
//			for(int c=1; c<=columns.size(); c++) {
//				String value=driver.findElement(By.xpath("//table[@name='BookTable']/tbody//tr["+r+"]//td["+c+"]")).getText();
//				System.out.print(value+"\t");
//				
				
//			}
//			System.out.println();
//		}
//		
//		for(int r=2; r<=rows.size(); r++) {
//			
//			String authorName =driver.findElement(By.xpath("//table[@name='BookTable']/tbody//tr["+r+"]//td[2]")).getText();
//			if(authorName.equals("Amit")) {
//				
//				String bookname =driver.findElement(By.xpath("//table[@name='BookTable']/tbody//tr["+r+"]//td[1]")).getText();
//				System.out.println("Bookname:" +bookname);
				
//			}
//			
//		}
//		
		        int sum=0;
				for(int r=2; r<=rows.size(); r++) {
					String Price =driver.findElement(By.xpath("//table[@name='BookTable']/tbody//tr["+r+"]//td[4]")).getText();
					sum=sum+Integer.parseInt(Price);
				}
				System.out.println("Total price:" +sum);
				
	}

}
