package PracticeUtube;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class LinkClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	 
    driver.get("https://www.google.com/");
    
    driver.findElement(By.name("q")).sendKeys("www.amazon.in"+Keys.ENTER);
    
    driver.findElement(By.linkText("http://www.amazon.in")).click();
	}

}
