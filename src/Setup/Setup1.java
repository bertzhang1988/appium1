package Setup;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Setup1 {

	protected WebDriver driver;

	@BeforeTest
	public void SetUp() {
		System.out.println("20000");
		DesiredCapabilities capabilities=DesiredCapabilities.android();
		//DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "nexus 6p");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "7.1.1");
		capabilities.setCapability("browserName", "Chrome");
		URL url = null;
		try {
			url = new URL("http://127.0.0.1:4723/wd/hub");
		} catch (MalformedURLException e) {

		}
		driver = new AndroidDriver(url, capabilities);

	}

	@Test
	public void f() {
		driver.get("http://www.facebook.com");
	}

}
