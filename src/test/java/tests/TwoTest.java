package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import base.Base;

public class TwoTest extends Base {

	@Test
	public void testTwo() throws IOException {

		System.out.println("Test two");
		getDriver().get(prop.getProperty("url"));
	}
}