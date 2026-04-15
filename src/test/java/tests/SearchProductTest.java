package tests;
import org.testng.annotations.Test;

import pageobjects.CheckoutPage;
import pageobjects.LandingPage;
import pageobjects.LoginPage;
import pageobjects.SearchProductPage;
import pageobjects.ShoppingCartPage;
import base.Base;

public class SearchProductTest extends Base{

	@Test
	public void searchProduct()
	{
		LandingPage landingPage = new LandingPage(getDriver());
		landingPage.myAccountDropdown().click();
		landingPage.loginOption().click();

		System.out.println(prop.getProperty("email"));
		LoginPage loginPage = new LoginPage(getDriver());
		loginPage.emailAddressField().sendKeys(prop.getProperty("email"));
		loginPage.passwordField().sendKeys(prop.getProperty("password"));
		loginPage.loginButton().click();

		SearchProductPage searchProductPage = new SearchProductPage(getDriver());
		searchProductPage.searchProduct().sendKeys("iphone");
		searchProductPage.clickInputBtn().click();
		searchProductPage.iphone().click();

		ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
		shoppingCartPage.checkoutBtn().click();

		CheckoutPage checkoutPage = new CheckoutPage(getDriver());
		checkoutPage.paymentFirstname().sendKeys("soni");
		checkoutPage.paymentLastname().sendKeys("kushwaha");
		checkoutPage.paymentAddress1().sendKeys("Bihar, siwan");
		checkoutPage.paymentCity().sendKeys("New York");
		checkoutPage.selectCounty();
		checkoutPage.selectRegion();
		checkoutPage.buttonShippingAddress().click();
		checkoutPage.buttonShippingMethod().click();
		checkoutPage.buttonAgree().click();
		checkoutPage.buttonPaymentMethod().click();
		checkoutPage.buttonConfirm().click();
		checkoutPage.successMsg();
		checkoutPage.orderPlacedMsg();

	}

}
