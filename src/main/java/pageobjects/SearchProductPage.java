package pageobjects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProductPage {
	WebDriver driver;

	Logger log = LogManager.getLogger(SearchProductPage.class);
	public SearchProductPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "input[name='search']")
	WebElement searchProduct;
	
	@FindBy(css = "span[class='input-group-btn']")
	WebElement clickInputBtn;
	
	@FindBy(linkText = "iPhone")
	WebElement iphone;

	public WebElement searchProduct() {
		log.info("Accessing Search Product field");
		return searchProduct;
	}

	public WebElement clickInputBtn() {
		log.info("Accessing Search Button");
		return clickInputBtn;
	}

	public WebElement iphone() {
		log.info("Accessing iPhone product element");
		return iphone;
	}
	
}
