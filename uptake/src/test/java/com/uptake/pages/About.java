package com.uptake.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by pwysocki on 10/26/17.
 */
public class About {
	private WebDriver driver;
	private static final String PAGE_URL="https://www.uptake.com/about";
	private static final String ABOUT_IMAGE = "https://uptake.imgix.net/images/about2.jpg";
	private static final String HEADING_CLASS = "hero-heading__subheading";
	private static final String ABOUT_IMAGE_CLASS = "l-hero-header__image";
	private static final String HOME_BUTTON_XPATH = "/html/body/div[1]/header/section/div[1]";

	@FindBy(className = HEADING_CLASS)
	WebElement heading;

	@FindBy(className = ABOUT_IMAGE_CLASS)
	WebElement aboutPageImage;

	@FindBy(xpath = HOME_BUTTON_XPATH)
	private WebElement homeButton;

	public About(WebDriver driver){
		this.driver=driver;
		driver.get(PAGE_URL);
		PageFactory.initElements(driver, this);
	}

	/**
	 * Retrieves title from PAGE_URL
	 */
	public String getAboutHeading() {
		return heading.getText();
	}

	/**
	 * Retrieves the attribute under homePageImage WebElement locator
	 */
	public boolean isAboutImageCorrect() {
		return aboutPageImage.getAttribute("style").contains(ABOUT_IMAGE);
	}

	/**
	 * Clicks the home button
	 */
	public void clickOnHomeButton() {
		Actions actions = new Actions(driver);
		actions.moveToElement(homeButton).click().perform();
	}
}