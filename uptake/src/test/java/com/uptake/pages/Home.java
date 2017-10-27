package com.uptake.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by pwysocki on 10/26/17.
 */
public class Home {
	private WebDriver driver;
	private static final String PAGE_URL = "https://www.uptake.com";
	private static final String HOME_IMAGE_CLASS = "l-hero-header__image";
	private static final String HOME_IMAGE = "https://uptake.imgix.net/images/hero-home-motion03.jpg";

	@FindBy(className = HOME_IMAGE_CLASS)
	WebElement homePageImage;

	public Home(WebDriver driver){
		this.driver=driver;
		driver.get(PAGE_URL);
		PageFactory.initElements(driver, this);
	}

	/**
	 * Retrieves title from PAGE_URL
	 */
	public String getHomeTitle() {
		return driver.getTitle();
	}

	/**
	 * Retrieves the attribute under homePageImage WebElement locator
	 */
	public boolean isHomeImageCorrect() {
		return homePageImage.getAttribute("style").contains(HOME_IMAGE);
	}

	public String getHomeImageClass() {
		return HOME_IMAGE_CLASS;
	}
}