# uptake-tests
Simple Java selenium tests for uptake.com

This project was developed on a mac and, for simplicity, uses only the chromedriver for mac to run. Downloaded from https://sites.google.com/a/chromium.org/chromedriver/downloads

Open in an IDE and run the UptakeMain class to run the tests.

Tested on IntelliJ, the output should look like:<br>
Starting ChromeDriver 2.28.455517 (2c6d2707d8ea850c862f04ac066724273981e88f) on port 17248<br>
Only local connections are allowed.<br>
Oct 27, 2017 1:29:15 PM org.openqa.selenium.remote.ProtocolHandshake createSession<br>
INFO: Detected dialect: OSS<br>
Oct 27, 2017 1:29:16 PM com.uptake.tests.HomeTest checkTitle<br>
INFO: Checking home page title<br>
Oct 27, 2017 1:29:16 PM com.uptake.tests.HomeTest checkTitle<br>
INFO: The title of the home page is correct<br>
Oct 27, 2017 1:29:16 PM com.uptake.tests.HomeTest checkHomeImage<br>
INFO: Checking for home page image<br>
Oct 27, 2017 1:29:16 PM com.uptake.tests.HomeTest checkHomeImage<br>
INFO: The image displayed is the correct home page image<br>
Starting ChromeDriver 2.28.455517 (2c6d2707d8ea850c862f04ac066724273981e88f) on port 17931<br>
Only local connections are allowed.<br>
Oct 27, 2017 1:29:17 PM org.openqa.selenium.remote.ProtocolHandshake createSession<br>
INFO: Detected dialect: OSS<br>
Oct 27, 2017 1:29:18 PM com.uptake.tests.AboutTest checkTitle<br>
INFO: Checking about page heading<br>
Oct 27, 2017 1:29:18 PM com.uptake.tests.AboutTest checkTitle<br>
INFO: The heading of the about page is correct<br>
Oct 27, 2017 1:29:18 PM com.uptake.tests.AboutTest checkAboutImage<br>
INFO: Checking for about page image<br>
Oct 27, 2017 1:29:18 PM com.uptake.tests.AboutTest checkAboutImage<br>
INFO: The image displayed is the correct about page image<br>
Oct 27, 2017 1:29:18 PM com.uptake.tests.AboutTest confirmAboutNavigation<br>
INFO: Clicking Home button from About page<br>
Oct 27, 2017 1:29:19 PM com.uptake.tests.AboutTest confirmAboutNavigation<br>
INFO: Checking that we are on the home page by verifying the image<br>
Oct 27, 2017 1:29:19 PM com.uptake.tests.AboutTest confirmAboutNavigation<br>
INFO: Successfully navigated to the home page from about<br>

