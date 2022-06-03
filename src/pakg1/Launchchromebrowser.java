package pakg1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launchchromebrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.facebook.com/");
		//driver.navigate().to("https://www.facebook.com/");
	
		Thread.sleep(3000);
		//driver.quit();
		driver.close();
	}

}
