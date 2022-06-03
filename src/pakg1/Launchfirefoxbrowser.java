package pakg1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launchfirefoxbrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://github.com/");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		//driver.navigate().
		Thread.sleep(3000);
		
		//driver.quit();
		driver.close();
	}

}
 