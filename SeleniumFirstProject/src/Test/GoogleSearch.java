package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Setting the Chrome Driver Property
		System.setProperty("webdriver.chrome.driver", "binaries\\chromedriver.exe");
		
		//Instantiate Chrome Driver
		WebDriver driver = new ChromeDriver();
		
		//Maximizing the browser window
		driver.manage().window().maximize();
		
		//Opening Google Home page
		driver.get("https://www.google.com");
		
		//Identifying google search text field
		WebElement searchfield = driver.findElement(By.name("q"));
		
		//Identifying the search button
		//WebElement searchButton = driver.findElement(By.name("btnK"));
		
		//Type a search keyword
		searchfield.sendKeys("Selenium");
		//Clicking on the search button
		//searchButton.click(); // Not working
		
		//Pressing the ENTER button
		searchfield.sendKeys(Keys.ENTER);
		
		//Solution 1
		//driver.findElement(By.xpath("//*[@id=\"Rzn5id\"]/div/a[2]")).click();
		
		//Solution 2 // This is a good 
		WebElement engButton = driver.findElement(By.xpath("//*[@id=\"Rzn5id\"]/div/a[2]"));
		engButton.click();
		engButton.click();
		
		
		
	}

}
