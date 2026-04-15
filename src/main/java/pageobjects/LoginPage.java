package pageobjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	Logger log = LogManager.getLogger(LoginPage.class);
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-email")
	WebElement emailAddressField;
	
	@FindBy(id = "input-password")
	WebElement passwordField;
	
	@FindBy(css = "input[value='Login']")
	WebElement loginButton;
	
	public WebElement emailAddressField()
	{
		log.info("Entering email: ");
		return emailAddressField;
	}
	public WebElement passwordField()
	{
		log.info("Entering password");
		return passwordField;
	}
	public WebElement loginButton()
	{
		log.info("Clicking on Login button");
		return loginButton;
	}
}
