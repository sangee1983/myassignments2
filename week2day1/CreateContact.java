package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateContact {

	public static void main(String[] args) {
		//Open the Browser
		ChromeDriver driver=new ChromeDriver();
	//Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
	//Maximize the Browser
		driver.manage().window().maximize();
		//Enter the username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//Enter the Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click the LoginButton
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click on contacts
		driver.findElement(By.linkText("Contacts")).click();
		//Click on createcontacts
		driver.findElement(By.linkText("Create Contact")).click();
		//Type a firstname
		driver.findElement(By.id("firstNameField")).sendKeys("sangeetha");
		//Type a lastname
		driver.findElement(By.id("lastNameField")).sendKeys("vannian");
		//Click on create contact button
		
		driver.findElement(By.id("submitButton")).click();
	WebElement firstName=	driver.findElement(By.id("viewcontact_firstName_sp"));
	String text1= firstName.getText();
	System.out.println(text1);
	String title1=driver.getTitle();
   System.out.println(title1);
	
	driver.close();
	
		
		
			
		

	}

}
