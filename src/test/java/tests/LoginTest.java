package tests;

import java.io.IOException;

import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.AccountPage;
import pageobjects.LandingPage;
import pageobjects.LoginPage;
import base.Base;

public class LoginTest extends Base{
	Logger log;
	@Test(dataProvider = "getLoginData")
	public void login(String email, String password, String expectedResult) throws IOException
	{

		LandingPage landingPage = new LandingPage(getDriver());
		landingPage.myAccountDropdown().click();
		log.debug("Clicked on my account");
		landingPage.loginOption().click();
		log.debug("Clicked on login option");

		LoginPage loginPage = new LoginPage(getDriver());
		loginPage.emailAddressField().sendKeys(email);
		log.debug("Email address got enter");
		loginPage.passwordField().sendKeys(password);
		log.debug("Password got enter");
		loginPage.loginButton().click();
		log.debug("Clicked on login button");

		AccountPage accountPage = new AccountPage(getDriver());

		String actualResult = null;
		try {
			if(accountPage.editAccountInformation().isDisplayed())
			{
				actualResult = "Successfull";
				log.debug("User got logged in");
			}
		}catch(Exception e)
		{
			actualResult = "Failure";
			log.debug("User didn't log in");
		}

//		Assert.assertTrue(accountPage.editAccountInformation().isDisplayed());
		Assert.assertEquals(actualResult, expectedResult);
		log.debug("Login test got passed");

	}

	@DataProvider
	public Object[][] getLoginData()
	{
		Object[][] data = {{"sonie_selenium@gmail.com","soni1234","Successfull"},{"dummy@gmail.com","12345","Failure"}};
		return data;
	}


}
