package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class OrangehrmDemo {
WebDriver driver;
@Given("user launches the  Orangehrm url")
public void user_launches_the_orangehrm_url() {
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   
}

@When("user entering the username")
public void user_entering_the_username() {
	driver.findElement(By.name("username")).sendKeys("Admin");
    
}

@When("user entering the password")
public void user_entering_the_password() {
	driver.findElement(By.name("password")).sendKeys("admin123");
   
}

@When("user clicks on the login button")
public void user_clicks_on_the_login_button() {
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	 boolean displayed = driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
      if(displayed) {
    	  System.out.println("login successfully");
      }else {
    	  System.out.println("login un successful");
      }
}

@When("user entering the username {string}")
public void user_entering_the_username(String user) {
	driver.findElement(By.name("username")).sendKeys(user);
   
}

@When("user entering the password {string}")
public void user_entering_the_password(String pass) {
	driver.findElement(By.name("password")).sendKeys(pass);
    
}





}

