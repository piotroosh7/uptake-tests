package com.uptake.tests;

import com.uptake.pages.Home;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


/**
 * Created by pwysocki on 10/26/17.
 */
public class HomeTest {
	private WebDriver driver;
	private Home home;
	private static final Logger LOG = Logger.getLogger(HomeTest.class.getName());
	private static final String RESOURCE_BASE = System.getProperty("user.dir");

	/**
	 * Initializes the Chrome driver and Home page object
	 */
	@Before
	public void setup(){
		// Set chromedriver path property
		System.setProperty("webdriver.chrome.driver", RESOURCE_BASE + "/src/main/resources/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		home = new Home(driver);
	}

	/**
	 * Checks that the title of the home page (https://www.uptake.com/) is correct
	 */
	@Test
	public void checkTitle() {
		final String title = home.getHomeTitle();
		LOG.info("Checking home page title");
		Assert.assertEquals("The title of the home page is incorrect", "Industrial Analytics for Global Industry | Uptake", title);
		LOG.info("The title of the home page is correct");
	}

	/**
	 * Checks that the image on the page is the home page image
	 */
	@Test
	public void checkHomeImage() {
		final boolean homeImage = home.isHomeImageCorrect();
		LOG.info("Checking for home page image");
		Assert.assertTrue("Home page image is not correct", homeImage);
		LOG.info("The image displayed is the correct home page image");
	}

	/**
	 * Exits the chrome driver
	 */
	@After
	public void close(){
		driver.close();
	}
}