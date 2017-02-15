/**
 * 
 */
package com.mevenk.webapptester.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mevenk.webapptester.util.WebAppTesterUtil;
import com.mevenk.webapptester.webdriverconfig.PhantomJSWebDriverConfig;

/**
 * @author VENKATESH
 *
 */
public class RunSampleTest {

	/** The PhantomJS web driver to run a sample test. */
	static WebDriver webDriver = null;

	/**
	 * 
	 */
	public RunSampleTest() {

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		runPhantomJSDriver();

	}

	private static void runPhantomJSDriver() {

		webDriver = PhantomJSWebDriverConfig.getPhantomJSWebDriver();

		webDriver.navigate().to("http://venkatesh-vaio:8080/typicalwebapp");

		WebAppTesterUtil.getCurrentStatus(webDriver);

		WebAppTesterUtil.findElementById(webDriver, "fileUploadPageLink").sendKeys(Keys.ENTER);

		WebAppTesterUtil.getCurrentStatus(webDriver);

		WebAppTesterUtil.findElementById(webDriver, "testRequestResponseButton").click();

		WebAppTesterUtil.findElementById(webDriver, "fileupload")
				.sendKeys("C:\\Users\\VENKATESH\\Desktop\\XHRFileUploadSuccess.PNG");

		WebAppTesterUtil.findElementById(webDriver, "fileUploadButton").click();

		WebAppTesterUtil.getCurrentStatus(webDriver);

	}

	@Override
	protected void finalize() {

		if (webDriver != null) {
			webDriver.close();
			webDriver.quit();
		}

	}

}
