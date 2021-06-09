package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase {

	public static void main(String[] args) {
	
		//Create a new instance of the Firefox driver
		WebDriver driver = new ChromeDriver();
		
		//Open the browser
        driver.get("https://www.google.com");
        
       //Close the browser
        driver.close();

	}

}
