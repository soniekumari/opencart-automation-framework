package tests;

import org.testng.annotations.Test;

import pageobjects.LandingRegistrationPage;
import pageobjects.RegistrationPage;
import base.Base;

public class RegistraterTest extends Base {

	@Test
	public void registrater() {

		LandingRegistrationPage landingRegistrationPage =
				new LandingRegistrationPage(getDriver());

		landingRegistrationPage.myAccountDropdown().click();
		landingRegistrationPage.registrationOption().click();

		RegistrationPage registrationPage =
				new RegistrationPage(getDriver());

		registrationPage.firstnameField().sendKeys(prop.getProperty("firstname"));
		registrationPage.lastnameField().sendKeys(prop.getProperty("lastname"));
		registrationPage.emailAddressField().sendKeys(prop.getProperty("email"));
		registrationPage.telephoneNumberField().sendKeys(prop.getProperty("phonenumber"));
		registrationPage.passwordField().sendKeys(prop.getProperty("password"));
		registrationPage.confirmPasswordField().sendKeys(prop.getProperty("conformpass"));
		registrationPage.privacyPolicyCheckbox().click();
		registrationPage.continueButton().click();
	}
}