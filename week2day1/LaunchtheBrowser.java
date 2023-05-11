package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchtheBrowser {

	public static void main(String[] args) throws InterruptedException      {
	//launch the browser
		ChromeDriver driver=new ChromeDriver();
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Maximize the window
		driver.manage().window().maximize();
		//Find the element username enter the user name
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//Find the element password enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		Thread.sleep(1000);
		
	//Click the Loginbutton	
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Close the Browser
		//driver.close();

	}

}
