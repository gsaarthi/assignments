package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefintion {
	public	ChromeDriver driver;

	@Given("Launch the browser")
	public void launchBrowser() {
		driver = new ChromeDriver();	
	}

	@And("Load the url") 
	public void loadUrl() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}

	@And("Enter the username as {string}")
	public void enterUsername(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
	}

	@And("Enter the password as {string}")
	public void enterPassword(String pWord) {
		driver.findElement(By.id("password")).sendKeys(pWord);
	}

	@When("Click on the Login Button")
	public void clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("HomePage should be displayed")
	public void verifyHomePage() {
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		if (text.contains("Bienvenido")) {
			System.out.println("HomePage is displayed");
		}
		else {
			System.out.println("HomePage is not displayed");
		}
	}

	@But("ErrorMessage should be displayed")
	public void verifyErrorMessage() {
		String text = driver.findElement(By.id("errorDiv")).getText();
		if (text.contains("error")) {
			System.out.println("Error message is verified");
		}
		else {
			System.out.println("Error message is not verified");
		}
	}

    @When("Click on crmsfa link")
	public void clickCRMSFALink() {
        driver.findElement(By.partialLinkText("CRM")).click();

	}
    
    @And("Click on Accounts Link")
	public void clickAccountsLink() {
       driver.findElement(By.linkText("Accounts")).click();

	}
    @And("Click on CreateAccount Link")
	public void clickCreateAccountLink() {
   driver.findElement(By.linkText("Create Account")).click();

	}
	
    @Given("Enter the Accountname as (.*)$")
	public void enterAccountName(String cName) {
		driver.findElement(By.id("accountName")).sendKeys(cName);
       
	}
    @Given("Enter the emailid (.*)$")
	public void enteremailid(String emailidname) {
		driver.findElement(By.id("primaryEmail")).sendKeys(emailidname);//10233

	}
   
    
    @When("Click on Submit button")
	public void clickSubmitButton() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}
    
    @Then("ViewAccountsPage should be displayed as (.*)$")
	public void verifyViewAccount(String cName) {
		String text = driver.findElement(By.xpath("//span[@class='requiredField']/following::span")).getText();
		if (text.contains(cName)) {
			System.out.println("Account created successfully");
		}
		else {
			System.out.println("Account is not  created");
		}
		
	}

}
