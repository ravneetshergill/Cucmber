package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RememberMe {

	WebDriver driver;
	
	@Given("User must be on homepage url {string}")
	public void user_must_be_on_homepage_url(String url) {
		//Starting chrome and opening url
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
					
		//Maximizing browser
		driver.manage().window().maximize();
	}

	@When("User clicks on remember me check box")
	public void user_clicks_on_remember_me_check_box() throws InterruptedException {
		driver.findElement(By.cssSelector("body > div > div > form > div.buttons-w > div.form-check-inline > label > input")).click();
		Thread.sleep(2000);
	}

	@Then("Remeber me checkbox must get selected")
	public void remeber_me_checkbox_must_get_selected() {
		boolean selected = driver.findElement(By.cssSelector("body > div > div > form > div.buttons-w > div.form-check-inline > label > input")).isSelected();
		System.out.println(selected);
	}
}
