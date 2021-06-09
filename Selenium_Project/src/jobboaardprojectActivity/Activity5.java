package jobboaardprojectActivity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Create a new instance of the Chrome driver
				WebDriver driver = new ChromeDriver();
				
				//Open the browser
				driver.get("https://alchemy.hguy.co/jobs");
				
				//Check the menuitem says "Jobs"
			    WebElement classNameLocator = driver.findElement(By.xpath("//*[@id=\"menu-item-24\"]/a"));
			    System.out.println("The menu item is:" + classNameLocator.getText());
			    classNameLocator.click();
			    
			    //Verify that on the correct page
			    String title = driver.getTitle();
			    System.out.println("Page title is: " + title);
			    
			    if (title.equals("Jobs – Alchemy Jobs")) {
			    	
			    	System.out.println("Title is correct");
			    	
			    }
			    	else {
			    		
			    		System.out.println("Title is incorrect");
			    		
			    }
			    
			  //Close the browser
				driver.close();
}

}
