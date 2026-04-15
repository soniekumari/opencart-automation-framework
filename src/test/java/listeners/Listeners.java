package listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.*;

import base.Base;
import utilities.ExtentReporter;

public class Listeners extends Base implements ITestListener {

	ExtentReports extentReport = ExtentReporter.getExtentReport();
	ExtentTest extentTest;
	ThreadLocal<ExtentTest> extentTestThread = new ThreadLocal<>();

	public void onTestStart(ITestResult result) {

		extentTest = extentReport.createTest(result.getName());
		extentTestThread.set(extentTest);
	}

	public void onTestSuccess(ITestResult result) {

		extentTestThread.get().log(Status.PASS, "Test Passed");

	}

	public void onTestFailure(ITestResult result) {

		extentTestThread.get().fail(result.getThrowable());

		try {
			String fullPath = takeScreenshot(result.getName(), getDriver());

			String fileName = fullPath.substring(fullPath.lastIndexOf("\\") + 1);

			String relativePath = "../screenshots/" + fileName;
			relativePath = relativePath.replace("\\", "/");

			System.out.println("Screenshot Path in Report: " + relativePath);

			extentTestThread.get().addScreenCaptureFromPath(relativePath, "Failure Screenshot");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		extentTestThread.get().log(Status.SKIP, "Test Skipped");
	}

	public void onFinish(ITestContext context) {
		extentReport.flush();
	}
}