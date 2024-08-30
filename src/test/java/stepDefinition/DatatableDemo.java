package stepDefinition;

import java.util.List;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DatatableDemo {
	@Given("user passing the data at step level")
	public void user_passing_the_data_at_step_level(io.cucumber.datatable.DataTable dataTable)  {
	    
		
		List<String> asList = dataTable.asList();
	//	
//		for(String s :asList) {
//			System.out.println(s);
//			
//		}
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		for(String s :asList) {
			WebElement uname = driver.findElement(By.id("email"));
			uname.sendKeys(s);
		  
			uname.clear();
			}
		}
	@Given("user sending multiple datas at step level")
	public void user_sending_multiple_datas_at_step_level(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> asLists = dataTable.asLists();
		for(List<String>Lists:asLists) {
			for(String l:Lists) {
				 
			
			//	System.out.println("aslists"+l);
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com");
			WebElement element1 = driver.findElement(By.id("email"));
			element1.sendKeys(l);
			}
		}
	 	}
	
	@Given("user typing multiple inputs")
	public void user_typing_multiple_inputs(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		Map<String, String> asMap = dataTable.asMap();
		Set<Entry<String, String>> entrySet = asMap.entrySet();
		for(Entry<String, String> Map: entrySet) {
			String key = Map.getKey();
			String value = Map.getValue();
			
			
			
		//	System.out.println("map"+Map.getKey());
			//System.out.println("map"+Map.getValue());
     if(key.equals("username")) {
		
		WebElement element1 = driver.findElement(By.id("email"));
		element1.sendKeys(value);
     }else if(key.equals("password")) {
          WebElement	element2 = driver.findElement(By.id("pass"));
          element2.sendKeys(value);
		  Thread.sleep(3000);
		
     }else {
    	 System.out.println("no locators found");
    }
		}
	}
		
	
	
	@Given("user passing the input data")
	public void user_passing_the_input_data(DataTable dataTable) {
		
		List<Map<String, String>> asMaps = dataTable.asMaps();
		
		for(Map<String, String> map:asMaps) {
			Set<Entry<String, String>> entrySet = map.entrySet();
			for(Entry<String, String> maps: entrySet) {
				System.out.println("maps"+maps.getKey());
				System.out.println("maps"+maps.getValue());
			}
			
		}
		

}
}

















