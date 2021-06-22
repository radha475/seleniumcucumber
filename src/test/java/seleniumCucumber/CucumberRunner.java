package seleniumCucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberRunner {
	WebDriver driver;

	@Given("^I am on facebook home page$")
	public void I_am_on_facebook_home_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\RKWorkRelated\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com/");
		Thread.sleep(5000);
		System.out.println("Opened facebook page");
	}

	@When("^I click on create new account$")
	public void I_click_on_create_new_account() throws InterruptedException {
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(5000);
		System.out.println("Clicked on create new account");
	}

	@Then("^I should see signup page$")
	public void I_should_see_signup_page() {
		System.out.println("I can see signup page now");
		driver.close();
	}

}
