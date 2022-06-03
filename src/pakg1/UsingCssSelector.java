package pakg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class UsingCssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();//for maximize window
		
		driver.get("https://github.com/");//website url
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[class='HeaderMenu-link flex-shrink-0 no-underline']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[autocomplete='username']")).sendKeys("Sasikumar");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("google");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		Thread.sleep(1000);
		driver.close();	
		
		
		driver.close();
	}


}
