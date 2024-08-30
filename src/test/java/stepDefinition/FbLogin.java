package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FbLogin {
	WebDriver driver;
	@Given("user launches the fb url")
	public void user_launches_the_fb_url() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	   
	}

	@When("user enter the email")
	public void user_enter_the_email() {
		driver.findElement(By.id("email")).sendKeys("cucumber");
	    
	    
	}

	@When("user enter the password")
	public void user_enter_the_password() {
		driver.findElement(By.id("pass")).sendKeys("123");
	   	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.name("login")).click();
	   
	}

	@Then("user logged in successfully")
	public void user_logged_in_successfully() {
		
		
	    
	}


}
