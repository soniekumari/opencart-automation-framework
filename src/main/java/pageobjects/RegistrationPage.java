package pageobjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage{
	WebDriver driver;
	Logger log = LogManager.getLogger(RegistrationPage.class);

	public RegistrationPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "input-firstname")
	WebElement firstnameField;
	
	@FindBy(id = "input-lastname")
	WebElement lastnameField;
	
	@FindBy(id = "input-email")
	WebElement emailAddressField;
	
	@FindBy(id = "input-telephone")
	WebElement telephoneNumberField;
	
	@FindBy(id = "input-password")
	WebElement passwordField;
	
	@FindBy(id = "input-confirm")
	WebElement confirmPasswordField;
	
	@FindBy(name = "agree")
	WebElement privacyPolicyCheckbox;
	
	@FindBy(css = "input[value='Continue']")
	WebElement continueButton;

	public WebElement firstnameField() {
		log.info("Accessing First Name field");
		return firstnameField;
	}

	public WebElement lastnameField() {
		log.info("Accessing Last Name field");
		return lastnameField;
	}

	public WebElement emailAddressField() {
		log.info("Accessing Email Address field");
		return emailAddressField;
	}

	public WebElement telephoneNumberField() {
		log.info("Accessing Telephone Number field");
		return telephoneNumberField;
	}

	public WebElement passwordField() {
		log.info("Accessing Password field");
		return passwordField;
	}

	public WebElement confirmPasswordField() {
		log.info("Accessing Confirm Password field");
		return confirmPasswordField;
	}

	public WebElement privacyPolicyCheckbox() {
		log.info("Accessing Privacy Policy Checkbox");
		return privacyPolicyCheckbox;
	}

	public WebElement continueButton() {
		log.info("Accessing Continue Button");
		return continueButton;
	}
}
