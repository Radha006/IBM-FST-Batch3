package jobboaardprojectActivity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Create a new instance of the Chrome driver
				WebDriver driver = new ChromeDriver();
				
				//Open the browser
				driver.get("https://alchemy.hguy.co/jobs");
				
				//Check the website heading
			    WebElement classNameLocator = driver.findElement(By.cssSelector("h1.entry-title"));
			    System.out.println("The heading of the webpage is:" + classNameLocator.getText());
			        
				//Close the browser
				driver.close();
		}
			
}



	


