package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		//getText method 
		//it is the method used for text validation such as title validation error message validation
		//Declaring the WebElement object
		WebElement regTitleText =driver.findElement(By.xpath("//h2[normalize-space()='Register']"));
		//varify the Registration Title is displayed
		if(regTitleText.isDisplayed()) {
			System.out.println("Registration Title is displayed");
			//validating registration title
			String actRegTitle=regTitleText.getText();
			String expRegTitle="Register";
//			if(actRegTitle.equals(expRegTitle)) {
//				System.out.println("Actual and Expected Registration title are same");
//				System.out.println("Registration title of the page is"+actRegTitle);
//				
//			 }
//			


			
		   }		
		
		
		
	

	}

}
