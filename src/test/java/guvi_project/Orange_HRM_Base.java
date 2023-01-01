package guvi_project;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

public class Orange_HRM_Base extends Orange_HRM_Utill {
	
	String[][] data = { { "Admin", "admin123" }, { "Admin", "admin" } };

	@DataProvider(name = "database")
	public String[][] dp() {
		return data;
	}

	@BeforeSuite
	public void browserLaunch() {

		browserLaunch(getpropvalue("ch_browser"));
		launchUrl(getpropvalue("url"));
	}

	@AfterSuite
	public void afterTest() {
		driver.quit();
	}
}
