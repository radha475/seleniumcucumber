package seleniumCucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CucumberDemoClass {
	
	@Test
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\RKWorkRelated\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com/");
		Thread.sleep(5000);
		System.out.println("waited for 5 seconds");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(5000);
		System.out.println("waited for 5 seconds");
		driver.close();
	}

}
