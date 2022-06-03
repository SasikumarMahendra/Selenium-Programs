package PracticeUtube;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Try1 {

public static void main(String[]args)
{
	
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();

driver.get("https://www.google.com/");

driver.findElement(By.name("q")).sendKeys("www.amazon.in"+Keys.ENTER);

}
}