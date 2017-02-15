/**
 * 
 */
package com.mevenk.webapptester.runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mevenk.webapptester.util.WebAppTesterUtil;
import com.mevenk.webapptester.webdriverconfig.PhantomJSWebDriverConfig;

/**
 * @author VENKATESH
 *
 */
public class RunKTMRYDUYTBMultiple {

	/**
	 * The PhantomJS web driver to run Katamarayudu trailer video multiple
	 * times.
	 */
	static WebDriver webDriver = null;

	/**
	 * 
	 */
	public RunKTMRYDUYTBMultiple() {

	}

	private static void runKtmryduMultiple(int noOfTimes) throws InterruptedException {

		long currentNoOfViews;

		int refreshCount = 0;

		WebElement viewCountWebElement;

		String noOfViewsString;

		String ktmryduYouTubeUrlPath = "https://www.youtube.com/watch?v=-gqmAr3isc8";

		webDriver = PhantomJSWebDriverConfig.getPhantomJSWebDriver();

		webDriver.navigate().to(ktmryduYouTubeUrlPath);

		System.out.println("Running " + noOfTimes + " times");

		while (refreshCount < noOfTimes) {

			WebAppTesterUtil.getCurrentStatus(webDriver);

			viewCountWebElement = WebAppTesterUtil.findElementByCssSelector(webDriver,
					"#watch7-views-info > div.watch-view-count");

			while (viewCountWebElement == null || !viewCountWebElement.isDisplayed()) {
				System.out.println("Waiting for " + viewCountWebElement);
				Thread.sleep(1000);
			}

			noOfViewsString = viewCountWebElement.getText().replaceAll(",", "").replaceAll(" views", "");
			currentNoOfViews = new Long(noOfViewsString);

			System.out.println("No of views : " + currentNoOfViews);

			webDriver.navigate().refresh();

			refreshCount++;

		}

		System.out.println("\n\n----- Process Complete !! -----\n\n");

	}

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		runKtmryduMultiple(1000000000);
	}

	@Override
	protected void finalize() {

		if (webDriver != null) {
			System.out.println("Closing & Quitting " + webDriver);
			webDriver.close();
			webDriver.quit();
		}

	}

}
