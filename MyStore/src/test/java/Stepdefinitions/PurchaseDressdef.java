package Stepdefinitions;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.PurchaseDressPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class PurchaseDressdef 
{
	WebDriver driver = null;

	@Before
	public void browsersetup() //set up browser
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


	}


	@Given("^user is signed on to my store page with valid (.*) and (.*)")
	public void user_is_signed_on_to_my_store_page_with_valid_abcd345_gmail_com_and_ab1234(String Emailid, String Password) 
	{
		PurchaseDressPage dress = new PurchaseDressPage(driver);
		dress.usersignedintoMystore(Emailid, Password);

	}
	@When("user clicks Dresses link")
	public void user_clicks_dresses_link() 
	{
		PurchaseDressPage dress = new PurchaseDressPage(driver);
		dress.clickdresses();
	}

	@And("Select evening dress link")
	public void select_evening_dress_link() 
	{
		PurchaseDressPage dress = new PurchaseDressPage(driver);
		dress.VerifyEveningdresslink();
	}
	@And("click on printed dress image")
	public void click_on_printed_dress_image() 
	{
		PurchaseDressPage dress = new PurchaseDressPage(driver);
		dress.clickprinteddress();

	}

	@And("click on add to cart button")
	public void click_on_add_to_cart_button() 
	{
		PurchaseDressPage dress = new PurchaseDressPage(driver);
		dress.clickaddtocart();

	}

	@And("click on proceed to check out button in alert window")
	public void click_on_proceed_to_check_out_button_in_alert_window() 
	{
		PurchaseDressPage dress = new PurchaseDressPage(driver);
		dress.alertcheckout();

	}

	@And("click proceed to check out button in shopping cart summary page")
	public void click_proceed_to_check_out_button_in_shopping_cart_summary_page() 
	{
		PurchaseDressPage dress = new PurchaseDressPage(driver);
		dress.summarycheckout();

	}

	@And("click procced to check out button in address page")
	public void click_procced_to_check_out_button_in_address_page() 
	{
		PurchaseDressPage dress = new PurchaseDressPage(driver);
		dress.Addresscheckout();
	}

	@And("Accept the terms of service and click proceed to checkout in shipping page")
	public void accept_the_terms_of_service_and_click_proceed_to_checkout_in_shipping_page() 
	{
		PurchaseDressPage dress = new PurchaseDressPage(driver);
		dress.Shippingchekout();
	}

	@And("Select Pay by check option")
	public void select_pay_by_check_option() 
	{
		PurchaseDressPage dress = new PurchaseDressPage(driver);
		dress.paycheck();
	}

	@And("click confirm order button")
	public void click_confirm_order_button() 
	{
		PurchaseDressPage dress = new PurchaseDressPage(driver);
		dress.confirmorder();
	}

	@Then("order is placed successfully on My Store")
	public void order_is_placed_successfully_on_my_store() 
	{
		PurchaseDressPage dress = new PurchaseDressPage(driver);
		dress.verifySuccessfullpurchase();
	}


}
