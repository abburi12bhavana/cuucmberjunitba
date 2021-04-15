package step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class stepdef {
	WebDriver driver = new ChromeDriver();
	@Given("I am able to navigate onto login page")
	public void i_am_able_to_navigate_onto_login_page() {
		System.setProperty("webdriver.chrome.driver","C:/Users/AbburiBhavana/Desktop/drivers/chromedriver.exe");
		String baseurl="https://opensource-demo.orangehrmlive.com/";
		driver.get(baseurl);
		driver.manage().window().maximize();
		
	    
	}
	
	@Then("I should see error message as {string}")
	public void i_should_see_error_message_as(String string) {
	    String actualerr = driver.findElement(By.id("spanMessage")).getText();
	String expectederr ="Invalid credentials";
	driver.close();


	}



	

	@When("I enter the user as {string}")
	public void i_enter_the_user_as(String string) {
driver.findElement(By.name("txtUsername")).click();
		
		WebElement element = driver.findElement(By.id("txtUsername")); 
		element.sendKeys(string);
	    
	}
	@When("I enter the password as {string}")
	public void i_enter_the_password_as(String string) {
driver.findElement(By.name("txtPassword")).click();
		
		WebElement element = driver.findElement(By.id("txtPassword")); 
		element.sendKeys(string);
	    
	}
	@When("I click on login button")
	public void i_click_on_login_button() {
		driver.findElement(By.id("btnLogin")).click();
	    
	}
	@Then("I should see welcome")
	public void i_should_username_as() {
		driver.findElement(By.id("welcome")).isDisplayed();
		System.out.println("execution sucsessfull");}
	}





