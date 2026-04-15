package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base;

public class FourTest extends Base{
	public WebDriver driver;
	@Test
	public void testFour() throws IOException
	{
		System.out.println("Test Four");
        getDriver().get(prop.getProperty("url"));
        Assert.assertTrue(false); // to trigger listener screenshot
	}
}
