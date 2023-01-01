package guvi_project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.hotkey.Keys;
import org.testng.annotations.Test;

public class User_Add_page  {
	@FindBy(xpath = "//span[text()='PIM']")
	public static WebElement click_pim;
	@FindBy(xpath = "//a[text()='Add Employee']")
	public static WebElement click_add_emp;
	@FindBy(name = "firstName")
	public static WebElement f_name;
	@FindBy(name = "middleName")
	public static WebElement mid_nmae;
	@FindBy(name = "lastName")
	public static WebElement last_nmae;
	@FindBy(xpath = "//label[text()='Employee Id']//following::input[1]")
	public static WebElement emp_id;
	@FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
	public static WebElement enable_login_details;
	@FindBy(xpath = "//div//input[@class='oxd-input oxd-input--active']//following::input[7]")
	public static WebElement login_u_nmae;
	@FindBy(xpath = "//div//input[@class='oxd-input oxd-input--active']//following::input[10]")
	public static WebElement login_pw;
	@FindBy(xpath = "//div//input[@class='oxd-input oxd-input--active']//following::input[11]")
	public static WebElement login_confirm_pw;
	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement save_login;
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[2]/div/div/div[2]/input")
	public static WebElement nick_name;
	@FindBy(xpath = "//*[@id=\\\"app\\\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[2]/input")
	public static WebElement other_id;
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input")
	public static WebElement driving_lic;
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div/input")
	public static WebElement driving_lic_ex_date;
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[3]/div[1]/div/div[2]/input")
	public static WebElement SSN_number;
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[3]/div[2]/div/div[2]/input")
	public static WebElement SIN_number;
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div")
	public static WebElement nationality;
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div")
	public static WebElement Marital_Status;
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div/input")
	public static WebElement d_o_b;
	@FindBy(xpath = "//input[@value='1']")
	public static WebElement gender_male;
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/div/div[1]/div/div[2]/input")
	public static WebElement millitory_service;
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/div/div[2]/div/div[2]/div/label")
	public static WebElement smoker_click;
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[5]/button")
	public static WebElement save;
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div/div/div[2]/div/div")
	public static WebElement blood_group;
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[5]/button")
	public static WebElement save_final;

	@Test(priority = 1)
	public void addnewuser() {
		test = extent.createTest("Registerlogin_page");
		PageFactory.initElements(User_Add_page.driver, this);
		User_Add_page.click_pim.click();
		User_Add_page.click_add_emp.click();
		User_Add_page.f_name.sendKeys("Ram");
		User_Add_page.mid_nmae.sendKeys("krishnan");
		User_Add_page.last_nmae.sendKeys("jawahar");
		String value = User_Add_page.emp_id.getAttribute(" ");
		System.out.println(value);
		User_Add_page.enable_login_details.click();
		User_Add_page.login_u_nmae.sendKeys("Ramakrishnan");
		User_Add_page.login_pw.sendKeys("Password@1234");
		User_Add_page.login_confirm_pw.sendKeys("Password@1234");
		User_Add_page.save_login.click();
		User_Add_page.nick_name.sendKeys("ramu");
		User_Add_page.other_id.sendKeys("12345");
		User_Add_page.driving_lic.sendKeys("TN123456789");
		User_Add_page.driving_lic_ex_date.sendKeys("01-01-2023" + Keys.ENTER);

	}
}
