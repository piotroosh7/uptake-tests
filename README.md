# uptake-tests
Simple Java selenium tests for uptake.com

This project was developed on a mac and, for simplicity, uses only the chromedriver for mac to run. Downloaded from https://sites.google.com/a/chromium.org/chromedriver/downloads

Open in an IDE and run the UptakeMain class to run the tests.

Tested on IntelliJ, the output should look like:
Starting ChromeDriver 2.28.455517 (2c6d2707d8ea850c862f04ac066724273981e88f) on port 17248
Only local connections are allowed.
Oct 27, 2017 1:29:15 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: OSS
Oct 27, 2017 1:29:16 PM com.uptake.tests.HomeTest checkTitle
INFO: Checking home page title
Oct 27, 2017 1:29:16 PM com.uptake.tests.HomeTest checkTitle
INFO: The title of the home page is correct
Oct 27, 2017 1:29:16 PM com.uptake.tests.HomeTest checkHomeImage
INFO: Checking for home page image
Oct 27, 2017 1:29:16 PM com.uptake.tests.HomeTest checkHomeImage
INFO: The image displayed is the correct home page image
Starting ChromeDriver 2.28.455517 (2c6d2707d8ea850c862f04ac066724273981e88f) on port 17931
Only local connections are allowed.
Oct 27, 2017 1:29:17 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: OSS
Oct 27, 2017 1:29:18 PM com.uptake.tests.AboutTest checkTitle
INFO: Checking about page heading
Oct 27, 2017 1:29:18 PM com.uptake.tests.AboutTest checkTitle
INFO: The heading of the about page is correct
Oct 27, 2017 1:29:18 PM com.uptake.tests.AboutTest checkAboutImage
INFO: Checking for about page image
Oct 27, 2017 1:29:18 PM com.uptake.tests.AboutTest checkAboutImage
INFO: The image displayed is the correct about page image
Oct 27, 2017 1:29:18 PM com.uptake.tests.AboutTest confirmAboutNavigation
INFO: Clicking Home button from About page
Oct 27, 2017 1:29:19 PM com.uptake.tests.AboutTest confirmAboutNavigation
INFO: Checking that we are on the home page by verifying the image
Oct 27, 2017 1:29:19 PM com.uptake.tests.AboutTest confirmAboutNavigation
INFO: Successfully navigated to the home page from about

