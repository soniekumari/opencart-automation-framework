package pageobjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingRegistrationPage{
		WebDriver driver;
		Logger log = LogManager.getLogger(LandingRegistrationPage.class);
		public LandingRegistrationPage(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath = "//*[@id='top-links']/ul/li[2]/a")
		WebElement myAccountDropdown;
		
		@FindBy(linkText = "Register")
		WebElement registrationOption;
		
		public WebElement myAccountDropdown()
		{
			log.info("Clicking on My Account dropdown");
			return myAccountDropdown;
		}
		public WebElement registrationOption()
		{
			log.info("Clicking on Registration option");
			return registrationOption;
		}
		
}	
