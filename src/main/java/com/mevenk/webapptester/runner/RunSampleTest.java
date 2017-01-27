/**
 * 
 */
package com.mevenk.webapptester.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mevenk.webapptester.util.WebAppTesterConstants;
import com.mevenk.webapptester.webdriverconfig.PhantomJSWebDriverConfig;

/**
 * @author VENKATESH
 *
 */
public class RunSampleTest {

	/**
	 * 
	 */
	public RunSampleTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param webDriver
	 */
	private static void getCurrentStatus(WebDriver webDriver) {
		System.out.println("Current Status" + WebAppTesterConstants.tabSpaceWithDoubleColun + webDriver.getCurrentUrl()
				+ WebAppTesterConstants.tabSpaceWithSingleColun + webDriver.getTitle());
	}

	/**
	 * Find element by id.
	 *
	 * @param webDriver
	 *            the web driver
	 * @param elementId
	 *            the element id
	 * @return the web element
	 */
	private static WebElement findElementById(WebDriver webDriver, String elementId) {
		return webDriver.findElement(By.id(elementId));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		runPhantomJSDriver();

	}

	private static void runPhantomJSDriver() {

		WebDriver phantomJSDriver = PhantomJSWebDriverConfig.getPhantomJSWebDriver();

		phantomJSDriver.navigate().to("http://venkatesh-vaio:8080/typicalwebapp");

		getCurrentStatus(phantomJSDriver);

		findElementById(phantomJSDriver, "fileUploadPageLink").sendKeys(Keys.ENTER);

		getCurrentStatus(phantomJSDriver);

		findElementById(phantomJSDriver, "testRequestResponseButton").click();

		findElementById(phantomJSDriver, "fileupload").sendKeys("C:\\Users\\VENKATESH\\Desktop\\XHRFileUploadSuccess.PNG");

		findElementById(phantomJSDriver, "fileUploadButton").click();

		getCurrentStatus(phantomJSDriver);

		phantomJSDriver.close();
		phantomJSDriver.quit();

	}

}
