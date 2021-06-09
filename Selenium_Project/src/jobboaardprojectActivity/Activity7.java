package jobboaardprojectActivity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a new instance of the Chrome driver
		WebDriver driver = new ChromeDriver();
				
				//Open the browser
				driver.get("https://alchemy.hguy.co/jobs");
				
				 WebElement postjob = driver.findElement(By.cssSelector("#menu-item-26 > a"));
				 System.out.println("The menu item is:" + postjob.getText());
				 postjob.click();
				
				 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;			
				 
				WebElement mail = driver.findElement(By.xpath("//*[@id=\"create_account_email\"]"));
				mail.sendKeys("radha006@gmail.com");
				 System.out.println("Entered your mail" + mail.getText());
				
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
				
				WebElement JobTitle = driver.findElement(By.xpath("//*[@id=\"job_title\"]"));
				JobTitle.sendKeys("Tester");
				 System.out.println("Entered JobTitle" + JobTitle.getText());
				 
				 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
						 
				 WebElement Description = driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p"));
				 Description.sendKeys("Test");
				 //driver.switchTo().alert().sendKeys("Test");
				 System.out.println("Entered Description" + Description.getText());
				
				 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
					 
				 WebElement Appmail = driver.findElement(By.xpath("//*[@id=\"application\"]"));
				 Appmail.sendKeys("radha006@gmail.com");
				 System.out.println("Entered Applicationemail" + Appmail.getText());
				
				 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
					
				WebElement company = driver.findElement(By.xpath("//*[@id=\"company_name\"]"));
				company.sendKeys("IBM");
				 System.out.println("Entered company" + company.getText());
				
				 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
				
				WebElement preview = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/article/div/form/p/input[4]"));
				preview.click();
				
				
				 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
				
				WebElement submit = driver.findElement(By.xpath("//*[@id=\"job_preview_submit_button\"]"));
				submit.click();
				
				//Close the browser
				driver.close();
		}
			
}



