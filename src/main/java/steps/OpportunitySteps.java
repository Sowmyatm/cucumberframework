package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
//import utilities.DataUtils;


public class OpportunitySteps {
	public static WebDriver driver;
	
	@After("@test2")
	 void closeapp() {
		driver.quit();	
	}
	
	@Given("User launches login.salesforce.com")
	public void user_launches_login_salesforce_com() {
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("user enters correct username and password")
	public void user_enters_correct_username_and_password() {
		driver.findElement(By.id("username")).sendKeys("nov22.sowmyatm@gmail.com");
		
		driver.findElement(By.name("pw")).sendKeys("Sowmyatm@123");
		
		driver.findElement(By.id("Login")).click();
		driver.manage().window().maximize();
	}

	@Then("home page should be seen")
	public void home_page_should_be_seen() {
	    String actual=driver.getTitle();
	    String expected="Home Page ~ Salesfore -Developer Edition";
	    if(actual==expected) {
	    	System.out.println("homepage displayed");
	    }
	   
	}

	@When("user clicks on opportunity link")
	public void user_clicks_on_opportunity_link() {
		driver.findElement(By.xpath("//*[@id=\"Opportunity_Tab\"]/a")).click();
		
		
	}

	@Then("opportunity home page should be displayed")
	public void opportunity_home_page_should_be_displayed() {
		String actual=driver.getTitle();
	    String expected="Opportunities: Home ~ Salesfore - Developer Edition";
	    if(actual==expected) {
	    	System.out.println("Opportunities homepage is displayed");
	}
	    
	  
}
}
