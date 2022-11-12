package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadData;

public class LoginPage extends TestBase {
	//TC1 - Verify application title
	//TC2 - Verify application URL
	//TC3 - Verify visibility of login logo
	//TC4 - Verify visibility bot logo
	//TC5 - Login to application
	//TC6 - Verify the URL of second page (inventory page)
	
	//Object Repository
	@FindBy(xpath="//div[@class='login_logo']")WebElement swagLogo;
	@FindBy(xpath="//input[@id='user-name']")WebElement userName;
	@FindBy(xpath="//input[@id='password']")WebElement passWord;
	@FindBy(xpath="//input[@id='login-button']")WebElement loginBtn;
	@FindBy(xpath="//div[@class='bot_column']")WebElement robotLogo;
	@FindBy(xpath="//span[contains(text(),Products)][1]")WebElement productLabel;
	@FindBy(xpath="//div[@class='peek']")WebElement Logo2;

	//Constructor used to initalise the webelement
	public	LoginPage()
	{
	PageFactory.initElements(driver,this);
	}
	
	//Method to verify the Title
	public String verifyTitle() {
	return	driver.getTitle();
	}

	//Method to verify the currentUrl
	public String verifyUrl() {
		return driver.getCurrentUrl();
	}
	
	//method to verify the LogoOfSwagLab
	public boolean verifyLogo() {
		return swagLogo.isDisplayed();	
	}
	
	//method to verify the robotLogo
	public boolean verifyRobotLogo() {
		return robotLogo.isDisplayed();
	}
	
	//Method to verify the loginApp
	public String verifyloginApp() throws Exception {
		//userName.sendKeys("standard_user");
		userName.sendKeys(ReadData.readPropertyFile("username"));
		//passWord.sendKeys("secret_sauce");
		passWord.sendKeys(ReadData.readPropertyFile("password"));
		loginBtn.click();
		return productLabel.getText();
	}
	
	//Method to verify the current url of next page
	public String verifyloginApp2() throws Exception {
		verifyloginApp();
		return driver.getCurrentUrl();
	}
	
	
	
	
	
	
	
	
	
	
}
