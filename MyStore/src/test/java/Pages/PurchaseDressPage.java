package Pages;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PurchaseDressPage 
{
	WebDriver driver;
	By Link_sigin = By.xpath("//a[contains(text(),'Sign in')]");
	By Txt_email = By.name("email");
	By Txt_password = By.name("passwd");
	By Btn_signin = By.id("SubmitLogin");
	By Btn_mypersonalinfo = By.xpath("//span[contains(text(),'My personal information')]");
	By Tab_Dresses = By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]");
	By Link_EveningDresses = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]");
	By Link_printedDress = By.tagName("img");
	By Btn_cart = By.xpath("//span[contains(text(),'Add to cart')]");
	By Btn_Alertcheckout = By.xpath("//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]/span[1]");
	By Btn_summarycheckout = By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]/span[1]");
	By Btn_Addresscheckout = By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]");
	By Chkbox_termsofservice = By.xpath("//input[@id='cgv']");
	By Btn_shippingcheckout = By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[1]/button[1]/span[1]");
	By Btn_paybycheck = By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[2]/div[1]/p[1]/a[1]/span[1]");
	By Btn_confirmorder = By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]");
	By txt_success = By.xpath("//p[contains(text(),'Your order on My Store is complete.')]");

	public PurchaseDressPage(WebDriver driver) 
	{
		this.driver = driver;
	}

	public void usersignedintoMystore(String Emailid , String Password) 
	{
		driver.navigate().to("http://automationpractice.com/index.php");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(Link_sigin));
		driver.findElement(Link_sigin).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(Txt_email));
		driver.findElement(Txt_email).sendKeys(Emailid);
		driver.findElement(Txt_password).sendKeys(Password);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Btn_signin));
		driver.findElement(Btn_signin).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(Btn_mypersonalinfo));
		driver.findElement(Btn_mypersonalinfo).isDisplayed();
	}

	public void clickdresses() 
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(Tab_Dresses));
		driver.findElement(Tab_Dresses).click();
	}

	public void VerifyEveningdresslink() 
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(Link_EveningDresses));
		driver.findElement(Link_EveningDresses).click();

	}

	public void clickprinteddress() 
	{
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(Link_printedDress));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(Link_printedDress)).perform();
		driver.findElement(Link_printedDress).click();
	}

	public void clickaddtocart() 
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(Btn_cart));
		driver.findElement(Btn_cart).click();

	}

	public void alertcheckout() 
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
		wait.until(ExpectedConditions.visibilityOfElementLocated(Btn_Alertcheckout));
		driver.findElement(Btn_Alertcheckout).click();


	}

	public void summarycheckout() 
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOfElementLocated(Btn_summarycheckout));
		driver.findElement(Btn_summarycheckout).click();
	}

	public void Addresscheckout() 
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOfElementLocated(Btn_Addresscheckout));
		driver.findElement(Btn_Addresscheckout).click();
	}

	public void Shippingchekout() 
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(Chkbox_termsofservice));
		//to scroll down 
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(Chkbox_termsofservice).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(Btn_shippingcheckout));
		driver.findElement(Btn_shippingcheckout).click();

	}

	public void paycheck() 
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOfElementLocated(Btn_paybycheck));
		driver.findElement(Btn_paybycheck).click();

	}

	public void confirmorder() 
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOfElementLocated(Btn_confirmorder));
		driver.findElement(Btn_confirmorder).click();

	}

	public void verifySuccessfullpurchase() 
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOfElementLocated(txt_success));
		driver.findElement(txt_success).isDisplayed();
	}

}
