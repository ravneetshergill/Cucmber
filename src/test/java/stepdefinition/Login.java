package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	WebDriver driver;

	@Given("User must be on homepage by clicking url {string}")
	public void user_must_be_on_homepage_by_clicking_url(String url) {
		//Starting chrome and opening url
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
				
		//Maximizing browser
		driver.manage().window().maximize();
	}

	@When("^Enter valid (.*) and (.*)$")
	public void enter_valid_username_and_password(String username, String password) throws InterruptedException {
		//Entering data in username and password
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);
	}

	@When("Click on Sign In button")
	public void click_on_sign_in_button() {
		//Clicking on Sign in button
		driver.findElement(By.id("log-in")).click();
	}

	@Then("User must be navigated to his\\/her account")
	public void user_must_be_navigated_to_his_her_account() {
		String actual = driver.getCurrentUrl();
		Assert.assertEquals("https://demo.applitools.com/app.html", actual);
	}
}
