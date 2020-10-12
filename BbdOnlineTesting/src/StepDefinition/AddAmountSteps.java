package StepDefinition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddAmountSteps {
	WebDriver driver;
	@Given("^User is on  adding amount page$")
	public void user_is_on_adding_amount_page() {

		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumCucumberSoftwares\\chromedriver.exe");
	

		driver = new ChromeDriver();
		driver.get("http://localhost:4200");
//
		driver.findElement(By.xpath("/html/body/app-root/div/div/div[1]/app-header/div/table/tr/td[1]/button")).click();
		driver.findElement(By.id("userId")).sendKeys("105");
		driver.findElement(By.id("password")).sendKeys("Bahauddin@12");
		driver.findElement(By.xpath("/html/body/app-root/div/div/div[2]/app-main/app-login/div/form/div[3]/button")).click();
	
	}
	
	

	@When("^user enters Account id and Account Balance$")
	public void user_enters_Account_id_and_Account_Balance() throws InterruptedException  {

	
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/app-root/div/div/div[2]/app-main/app-user/table/tr/td[1]/button")).click();
	driver.findElement(By.id("tId")).sendKeys("100105");
	driver.findElement(By.id("tBalance")).sendKeys("2000");


	}

	@Then("^clicks on Add Amount button$")
	public void clicks_on_Add_Amount_button() throws InterruptedException  {
		driver.findElement(By.xpath("/html/body/app-root/div/div/div[2]/app-main/app-add-amount/form/button")).click();
        Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();		
			
	        // Capturing alert message.    
	        String alertMessage= driver.switchTo().alert().getText();		
	        		
	        // Displaying alert message		
	        System.out.println(alertMessage);	

	        		
	        // Accepting alert		
	        alert.accept();
			
			
			

			
	}

	@Then("^displays message amount added successfully$")
	public void displays_message_amount_added_successfully()  {
		  System.out.println("amount added successfully");	
	}



}
