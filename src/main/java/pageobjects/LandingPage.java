package pageobjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage{
	WebDriver driver;
	Logger log = LogManager.getLogger(LandingPage.class);
	public LandingPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='My Account']")
	WebElement myAccountDropdown;
	
	@FindBy(linkText = "Login")
	WebElement loginOption;

	public WebElement myAccountDropdown()
	{
		log.info("Clicking on My Account dropdown");
		return myAccountDropdown;
	}
	public WebElement loginOption()
	{
		log.info("Clicking on Login option");
		return loginOption;
	}
	
}
