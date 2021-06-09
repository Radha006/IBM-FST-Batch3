package jobboaardprojectActivity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        // Create a new instance of the Chrome driver
		WebDriver driver = new ChromeDriver();
		
		//Open the browser
		driver.get("https://alchemy.hguy.co/jobs");
		
		//Check the url of the page
        String url = driver.getCurrentUrl();
        //Print the url of the page
        System.out.println("Page title is: " + url);
        
      //Close the browser
		driver.close();

	}

}
