package Setup;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import AppiumStart.SetUpAppiumServer;

public class Setup5 {
	protected WebDriver driver;
	private SetUpAppiumServer AppiumServer;

	@BeforeSuite
	public void SetUpServer() {
		AppiumServer = new SetUpAppiumServer();
		AppiumServer.startServer();
	}

	@BeforeClass
	public void setUp() throws Exception {

		// Created object of DesiredCapabilities class.
		DesiredCapabilities capabilities = new DesiredCapabilities();

		// Set android deviceName desired capability. Set it Android Emulator.
		capabilities.setCapability("deviceName", "Android Emulator");

		// Set browserName desired capability. It's Android in our case here.
		capabilities.setCapability("browserName", "Android");

		// Set android platformVersion desired capability. Set your emulator's
		// android version.
		capabilities.setCapability("platformVersion", "6.0");

		// Set android platformName desired capability. It's Android in our case
		// here.
		capabilities.setCapability("platformName", "Android");

		// Set android appPackage desired capability. It is
		// com.android.calculator2 for calculator application.
		// Set your application's appPackage if you are using any other app.
		capabilities.setCapability("appPackage", "com.android.calculator2");

		// Set android appActivity desired capability. It is
		// com.android.calculator2.Calculator for calculator application.
		// Set your application's appPackage if you are using any other app.
		capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");

		// Created object of RemoteWebDriver will all set capabilities.
		// Set appium server address and port number in URL string.
		// It will launch calculator app in emulator.
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@AfterClass
	public void TearUp() {
		driver.quit();
	}

	@AfterSuite
	public void closeServer() {
		AppiumServer.stopServer();
	}
}
