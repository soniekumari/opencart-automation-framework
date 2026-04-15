package base;

import java.io.*;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	public Properties prop;

	public WebDriver getDriver() {
		return driver.get();
	}

	@BeforeClass
	public void initializeDriver() throws IOException {

		prop = new Properties();
		String propPath = System.getProperty("user.dir") + "\\src\\test\\resources\\data.properties";

		FileInputStream fis = new FileInputStream(propPath);
		prop.load(fis);

		String browserName = prop.getProperty("browser");

		WebDriver localDriver;

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			localDriver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			localDriver = new FirefoxDriver();

		} else {
			throw new RuntimeException("Browser not supported");
		}

		localDriver.manage().window().maximize();
		localDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.set(localDriver);

		getDriver().get(prop.getProperty("url"));
	}

	public String takeScreenshot(String testName, WebDriver driver) throws IOException {

		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String path = System.getProperty("user.dir") + "\\screenshots\\" + testName + ".png";

		File file = new File(path);
		file.getParentFile().mkdirs();

		FileUtils.copyFile(source, file);
		System.out.println(path);
		return path;
	}

	@AfterClass
	public void tearDown() {
		getDriver().quit();
	}
}