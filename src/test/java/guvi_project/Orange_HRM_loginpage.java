package guvi_project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Orange_HRM_loginpage extends Orange_HRM_Base {
	@FindBy(name = "username")
	public static WebElement uname;
	@FindBy(name = "password")
	public static WebElement pw;
	@FindBy(xpath = "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	public static WebElement login;
	@FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
	public static WebElement actualvalue;

	@Test(dataProvider = "database", priority = 0)
	public void loginpage(String n, String s) {
		test = extent.createTest("Registerlogin_page");
		PageFactory.initElements(Orange_HRM_Base.driver, this);
		Orange_HRM_loginpage.uname.sendKeys(n);
		Orange_HRM_loginpage.pw.sendKeys(s);
		Orange_HRM_loginpage.login.click();
		Assert.assertEquals(true, actualvalue);
	}
}
