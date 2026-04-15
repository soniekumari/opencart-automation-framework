package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CheckoutPage {

	WebDriver driver;

	private static final Logger log = LogManager.getLogger(CheckoutPage.class);

	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		log.info("Checkout Page initialized");
	}

	@FindBy(id = "input-payment-firstname")
	WebElement paymentFirstname;

	@FindBy(id = "input-payment-lastname")
	WebElement paymentLastname;

	@FindBy(id = "input-payment-address-1")
	WebElement paymentAddress1;

	@FindBy(id = "input-payment-city")
	WebElement paymentCity;

	@FindBy(id = "input-payment-country")
	WebElement country;

	@FindBy(id = "input-payment-zone")
	WebElement region;

	@FindBy(id = "button-shipping-address")
	WebElement buttonShippingAddress;

	@FindBy(id = "button-shipping-method")
	WebElement buttonShippingMethod;

	@FindBy(name = "agree")
	WebElement buttonAgree;

	@FindBy(id = "button-payment-method")
	WebElement buttonPaymentMethod;

	@FindBy(id = "button-confirm")
	WebElement buttonConfirm;

	@FindBy(xpath = "//ul[@class='breadcrum']//a[text()='Success']")
	WebElement successMsg;

	@FindBy(xpath = "//*[@id='content']/h1[text()='Your order has been placed!']")
	WebElement orderPlacedMsg;

	public WebElement paymentFirstname() {
		log.info("Accessing Payment Firstname field");
		return paymentFirstname;
	}

	public WebElement paymentLastname() {
		log.info("Accessing Payment Lastname field");
		return paymentLastname;
	}

	public WebElement paymentAddress1() {
		log.info("Accessing Address field");
		return paymentAddress1;
	}

	public WebElement paymentCity() {
		log.info("Accessing City field");
		return paymentCity;
	}

	public void selectCounty() {
		log.info("Selecting Country: United States");
		Select select = new Select(country);
		select.selectByVisibleText("United States");
	}

	public void selectRegion() {
		log.info("Selecting Region: New York");
		Select select = new Select(region);
		select.selectByVisibleText("New York");
	}

	public WebElement buttonShippingAddress() {
		log.info("Clicking Shipping Address button");
		return buttonShippingAddress;
	}

	public WebElement buttonShippingMethod() {
		log.info("Clicking Shipping Method button");
		return buttonShippingMethod;
	}

	public WebElement buttonAgree() {
		log.info("Clicking Agree checkbox");
		return buttonAgree;
	}

	public WebElement buttonPaymentMethod() {
		log.info("Clicking Payment Method button");
		return buttonPaymentMethod;
	}

	public WebElement buttonConfirm() {
		log.info("Clicking Confirm Order button");
		return buttonConfirm;
	}

	public void successMsg() {
		log.info("Checking Success breadcrumb message");
		System.out.println(successMsg.isDisplayed());
	}

	public void orderPlacedMsg() {
		log.info("Checking Order Placed message");
		System.out.println(orderPlacedMsg.isDisplayed());
	}
}