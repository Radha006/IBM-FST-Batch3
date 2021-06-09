package jobboaardprojectActivity;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Activity6 {

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
	    
	    WebElement search = driver.findElement(By.xpath("//*[@id=\"search_keywords\"]"));
	    search.sendKeys("Banking");
	    
	    WebElement searchjobs = driver.findElement(By.xpath("//*[@id=\"post-7\"]/div/div/form/div[1]/div[4]/input"));
	    searchjobs.click();
	    
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;			
	    
	    WebElement openjobs = driver.findElement(By.xpath("//*[@id=\"post-7\"]/div/div/ul/li[1]/a/div[1]/h3"));
	    openjobs.click();
	    
	    WebElement Applyjob = driver.findElement(By.xpath("//*[@id=\"post-3360\"]/div/div/div/div[3]/input"));
	    Applyjob.click();
	    
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;			
	    
	    WebElement email = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/div/div/div[3]/div/p/a"));
	     System.out.println("" + email.getText());
	    
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;			
	    
	    
	    //Close the browser
	    driver.close();
	   
	}

}
