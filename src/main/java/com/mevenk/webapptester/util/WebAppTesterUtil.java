/**
 * 
 */
package com.mevenk.webapptester.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author VENKATESH
 *
 */
public class WebAppTesterUtil {

	/**
	 * 
	 */
	public WebAppTesterUtil() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param webDriver
	 */
	public static void getCurrentStatus(WebDriver webDriver) {
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
	public static WebElement findElementById(WebDriver webDriver, String elementId) {
		return webDriver.findElement(By.id(elementId));
	}

	/**
	 * Find element by xpath.
	 *
	 * @param webDriver
	 *            the web driver
	 * @param xpathExpression
	 *            the xpath expression
	 * @return the web element
	 */
	public static WebElement findElementByXpath(WebDriver webDriver, String xpathExpression) {
		return webDriver.findElement(By.xpath(xpathExpression));
	}

	/**
	 * Find element by css selector.
	 *
	 * @param webDriver
	 *            the web driver
	 * @param selector
	 *            the selector
	 * @return the web element
	 */
	public static WebElement findElementByCssSelector(WebDriver webDriver, String selector) {
		return webDriver.findElement(By.cssSelector(selector));
	}

	/**
	 * Find element by class name.
	 *
	 * @param webDriver
	 *            the web driver
	 * @param className
	 *            the class name
	 * @return the web element
	 */
	public static WebElement findElementByClassName(WebDriver webDriver, String className) {
		return webDriver.findElement(By.className(className));
	}

	/**
	 * Find element by name.
	 *
	 * @param webDriver
	 *            the web driver
	 * @param name
	 *            the name
	 * @return the web element
	 */
	public static WebElement findElementByName(WebDriver webDriver, String name) {
		return webDriver.findElement(By.name(name));
	}

	/**
	 * Find element by tag name.
	 *
	 * @param webDriver
	 *            the web driver
	 * @param tagName
	 *            the tag name
	 * @return the web element
	 */
	public static WebElement findElementByTagName(WebDriver webDriver, String tagName) {
		return webDriver.findElement(By.tagName(tagName));
	}

	/**
	 * Find element by link text.
	 *
	 * @param webDriver
	 *            the web driver
	 * @param linkText
	 *            the link text
	 * @return the web element
	 */
	public static WebElement findElementByLinkText(WebDriver webDriver, String linkText) {
		return webDriver.findElement(By.linkText(linkText));
	}

	/**
	 * Find element by partial link text.
	 *
	 * @param webDriver
	 *            the web driver
	 * @param partialLinkText
	 *            the partial link text
	 * @return the web element
	 */
	public static WebElement findElementByPartialLinkText(WebDriver webDriver, String partialLinkText) {
		return webDriver.findElement(By.partialLinkText(partialLinkText));
	}
}
