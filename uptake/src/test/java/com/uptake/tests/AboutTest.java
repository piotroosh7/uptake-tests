package com.uptake.tests;

import com.uptake.pages.About;
import com.uptake.pages.Home;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by pwysocki on 10/26/17.
 */
public class AboutTest {
	private WebDriver driver;
	private About about;
	private static final Logger LOG = Logger.getLogger(AboutTest.class.getName());
	private static final String RESOURCE_BASE = System.getProperty("user.dir");

	/**
	 * Initializes the Chrome driver and About page object
	 */
	@Before
	public void setup(){
		// Set chromedriver path property
		System.setProperty("webdriver.chrome.driver", RESOURCE_BASE + "/src/main/resources/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		about = new About(driver);
	}

	/**
	 * Checks that the heading of the about page (https://www.uptake.com/about) is correct
	 */
	@Test
	public void checkTitle() {
		final String heading = about.getAboutHeading();
		LOG.info("Checking about page heading");
		Assert.assertEquals("The text in the about page heading is incorrect", "ABOUT UPTAKE", heading);
		LOG.info("The heading of the about page is correct");
	}

	/**
	 * Checks that the image on the page is the about page image
	 */
	@Test
	public void checkAboutImage() {
		final boolean aboutImage = about.isAboutImageCorrect();
		LOG.info("Checking for about page image");
		Assert.assertTrue("About page image is not correct", aboutImage);
		LOG.info("The image displayed is the correct about page image");
	}

	/**
	 * Clicks the Home button from the about page and confirms navigation to the correct page
	 */
	@Test
	public void confirmAboutNavigation() {
		// get the current Url of opened page
		final String currentUrl = driver.getCurrentUrl();
		LOG.info("Clicking Home button from About page");
		about.clickOnHomeButton();
		// initialize new Home object
		Home home = new Home(driver);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(home.getHomeImageClass())));
		// use the home page object to check if the page image is correct
		LOG.info("Checking that we are on the home page by verifying the image");
		Assert.assertTrue("We did not navigate to the correct page", home.isHomeImageCorrect());
		final String urlAfterClickingHome = driver.getCurrentUrl();
		Assert.assertNotEquals("The current page has the same URL as before the click of the Home button", currentUrl, urlAfterClickingHome);
		LOG.info("Successfully navigated to the home page from about");
	}

	/**
	 * Exits the chrome driver
	 */
	@After
	public void close(){
		driver.close();
	}
}