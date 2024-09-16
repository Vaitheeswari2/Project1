package com.omrbranch.StepDefinition;
import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.omrbranch.baseclass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
public class HooksClass extends BaseClass {
	@Before
	public void beforeScenario() throws FileNotFoundException, IOException {

		browserLaunch(getPropertyValue("browser"));
		launchtheappln(getPropertyValue("url"));
		maximizewindow();
		implicitWait();

	}

	@After
	public void afterScenario(Scenario scenario) throws IOException, AWTException {
//		scaleLess();
		scenario.attach(takeScreenshotinByte(), "images/png", "Every Scenario");
		closeAll();
	}


}
