package pakg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginandLogoutBasicScript
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");

	FirefoxDriver driver = new FirefoxDriver();
  driver.get("https://github.com/");

driver.manage().window().maximize();
Thread.sleep(2000);

driver.findElement(By.linkText("Sign in")).click();
Thread.sleep(2000);

driver.findElement(By.name("login")).sendKeys("admin");
Thread.sleep(2000);
//driver.findElement(By.id("username")).sendKeys("admin");

driver.findElement(By.name("password")).sendKeys("manager");

Thread.sleep(2000);

driver.findElement(By.name("commit")).click();

Thread.sleep(2000);
driver.close();



}

}