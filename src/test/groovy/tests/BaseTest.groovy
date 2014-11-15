package tests

import static org.junit.Assert.*
import geb.junit4.GebReportingTest
import geb.junit4.GebTest;

import org.junit.Before
import org.junit.Rule
import org.junit.rules.MethodRule
import org.junit.runners.model.FrameworkMethod
import org.junit.runners.model.Statement
import org.openqa.selenium.Dimension
import org.openqa.selenium.Point
import org.openqa.selenium.WebDriver
import org.openqa.selenium.logging.LogEntries
import org.openqa.selenium.logging.LogEntry
import org.openqa.selenium.logging.LogType


class BaseTest extends GebReportingTest {


	@Rule
	public ExceptionWrapperRule rule = new ExceptionWrapperRule(this)

	@Override
	@Before
	public void setupReporting() {
		WebDriver driver = browser.getDriver()
		driver.manage().window().setPosition(new Point(0, 0));
		driver.manage().window().setSize(new Dimension(1200, 1000));
		super.setupReporting();
	}


}
