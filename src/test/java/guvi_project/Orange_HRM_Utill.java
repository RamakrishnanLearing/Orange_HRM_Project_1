package guvi_project;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Orange_HRM_Utill {
	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest test;

	// Browser Launch
	public static void browserLaunch(String name) {

		switch (name) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "FireFox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("No valid options given choosing the default browser");
			driver = new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	// Launch the url
	public static void launchUrl(String url) {
		driver.get(url);
	}

//get properties from config.properties
	public static String getpropvalue(String key) {
		String value = null;
		try {
			Properties prop = new Properties();
			FileInputStream ip = new FileInputStream("./config.properties");
			prop.load(ip);
			value = prop.getProperty(key);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

}
