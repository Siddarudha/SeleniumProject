package utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import base.BaseTest;

public class FetchElements {

	public WebElement getWebElement(String identifierType, String identifierValue) {
		switch (identifierType) {

		case "Xpath":
			return BaseTest.driver.findElement(By.xpath(identifierValue));

		case "ID":
			return BaseTest.driver.findElement(By.id(identifierValue));

		case "NAME":
			return BaseTest.driver.findElement(By.name(identifierValue));

		case "TAGNAME":
			return BaseTest.driver.findElement(By.tagName(identifierValue));

		case "Css":
			return BaseTest.driver.findElement(By.cssSelector(identifierValue));

		default:
			return null;
		}
	}
		public List<WebElement> getWebElements(String identifierType, String identifierValue) {
			switch (identifierType) {

			case "Xpath":
				return BaseTest.driver.findElements(By.xpath(identifierValue));

			case "ID":
				return BaseTest.driver.findElements(By.id(identifierValue));

			case "NAME":
				return BaseTest.driver.findElements(By.name(identifierValue));

			case "TAGNAME":
				return BaseTest.driver.findElements(By.tagName(identifierValue));

			case "Css":
				return BaseTest.driver.findElements(By.cssSelector(identifierValue));

			default:
				return null;
			}
	}
}
