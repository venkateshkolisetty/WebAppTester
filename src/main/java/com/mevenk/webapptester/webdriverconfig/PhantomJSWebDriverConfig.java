/**
 * 
 */
package com.mevenk.webapptester.webdriverconfig;

import java.io.File;

import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.mevenk.webapptester.util.WebAppTesterConstants;

/**
 * @author VENKATESH
 *
 */
public class PhantomJSWebDriverConfig {

	public static PhantomJSDriver getPhantomJSWebDriver() {
		String phantomJSWebDriverPath = "E:\\work\\JarsAndFiles\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe";
		File phantomJSWebDriverFile = new File(phantomJSWebDriverPath);
		if (!phantomJSWebDriverFile.exists()) {
			System.out.println(phantomJSWebDriverFile.getAbsolutePath() + WebAppTesterConstants.tabSpaceWithDoubleColun
					+ "Does not Exist!!");
			return null;
		}

		System.setProperty("phantomjs.binary.path", phantomJSWebDriverPath);

		DesiredCapabilities phantomJSCapabilities = DesiredCapabilities.phantomjs();
		phantomJSCapabilities.setJavascriptEnabled(true);

		return new PhantomJSDriver(phantomJSCapabilities);
	}

}
