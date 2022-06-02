package Stepdefinitions;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.SignInPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class Sigindef 
{
	WebDriver driver = null;


	@Before
	public void browsersetup() 
	{
		//define path of Chrome driver
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+"/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver(); // this will open the chrome driver
		//add wait time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		driver.manage().window().maximize();

	}

	@After
	public void closebrowser() 
	{
		driver.close();
		driver.quit();

	}

	@Given("User is at my store login page")
	public void user_is_at_my_store_login_page() 
	{
		driver.navigate().to("http://automationpractice.com/index.php");
	}

	@And("user clicks on sign in link")
	public void user_clicks_on_sign_in_link() 

	{
		SignInPage signin = new SignInPage(driver);
		signin.clicksigninlink();
	}

	@When("^user enters registered (.*) and (.*)$")
	public void user_enters_registered_emailid_and_password(String Emailid , String Password) 
	{
		SignInPage signin = new SignInPage(driver);
		signin.entervalidEmailidandPassword(Emailid, Password);
	}

	@And("click sign in button")
	public void click_sign_in_button() 
	{
		SignInPage signin = new SignInPage(driver);
		signin.clicksigninbutton();
	}

	@Then("user is successfully logged in to My Account page")
	public void user_is_successfully_logged_in_to_my_account_page() 
	{
		SignInPage signin = new SignInPage(driver);
		signin.verifysucessfullsignin();
	}

}
