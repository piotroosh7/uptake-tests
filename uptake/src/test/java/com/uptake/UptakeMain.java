package com.uptake;

import com.uptake.tests.AboutTest;
import com.uptake.tests.HomeTest;

/**
 * Created by pwysocki on 10/27/17.
 */
public class UptakeMain {
	public static void main(String[] args) {
		HomeTest homeTest = new HomeTest();
		AboutTest aboutTest = new AboutTest();

		// Home page tests
		homeTest.setup();
		homeTest.checkTitle();
		homeTest.checkHomeImage();
		homeTest.close();

		// About page tests
		aboutTest.setup();
		aboutTest.checkTitle();
		aboutTest.checkAboutImage();
		// Tests navigation between About and Home
		aboutTest.confirmAboutNavigation();
		aboutTest.close();
	}
}
