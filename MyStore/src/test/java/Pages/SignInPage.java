package Pages;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SignInPage 
{
	WebDriver driver;
	By Link_sigin = By.xpath("//a[contains(text(),'Sign in')]");
	By Txt_email = By.name("email");
	By Txt_password = By.name("passwd");
	By Btn_signin = By.id("SubmitLogin");
	By Btn_mypersonalinfo = By.xpath("//span[contains(text(),'My personal information')]");
	By Btn_orderhistory = By.xpath("//span[contains(text(),'Order history and details')]");
	By Btn_mycreditslips = By.xpath("//span[contains(text(),'My credit slips')]");
	By Btn_myaddress = By.xpath("//span[contains(text(),'My addresses')]");
	By btn_mywishlist = By.xpath("//span[contains(text(),'My wishlists')]");


	public SignInPage(WebDriver driver) 
	{
		this.driver = driver;
	}

	public void clicksigninlink() 
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(Link_sigin));
		driver.findElement(Link_sigin).click();

	}

	public void entervalidEmailidandPassword(String Emailid , String Password) 
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(Txt_email));
		driver.findElement(Txt_email).sendKeys(Emailid);
		driver.findElement(Txt_password).sendKeys(Password);

	}

	public void clicksigninbutton() 
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(Btn_signin));
		driver.findElement(Btn_signin).click();
	}

	public void verifysucessfullsignin() 
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(Btn_mypersonalinfo));
		driver.findElement(Btn_mypersonalinfo).isDisplayed();
		wait.until(ExpectedConditions.visibilityOfElementLocated(Btn_orderhistory));
		driver.findElement(Btn_orderhistory).isDisplayed();
		wait.until(ExpectedConditions.visibilityOfElementLocated(Btn_mycreditslips));
		driver.findElement(Btn_mycreditslips).isDisplayed();
		wait.until(ExpectedConditions.visibilityOfElementLocated(Btn_myaddress));
		driver.findElement(Btn_myaddress).isDisplayed();
		wait.until(ExpectedConditions.visibilityOfElementLocated(btn_mywishlist));
		driver.findElement(btn_mywishlist).isDisplayed();

	}

}
