package TestCases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import Utility.CaptureScreenshot;
import Utility.ReadData;

public class LoginPageTest extends TestBase{
	
	LoginPage login;
	@BeforeMethod
	public void setUp() throws Exception {
		initalization();
		login=new LoginPage();
	}
	
	@Test
	public void verifyTitleTest() throws Exception {
		//String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		//Assert.assertEquals(actTitle,"Swag Labs");	
		Assert.assertEquals(actTitle,ReadData.readExcelFile(0,0));
	}
	
	@Test //(enabled=false)
	public void verifyUrlTest() throws Exception {
		//String exp="https://www.saucedemo.com/";
		String act=login.verifyUrl();
		//Assert.assertEquals(act,"https://www.saucedemo.com/");
		Assert.assertEquals(act,ReadData.readExcelFile(1,0));
	}
	
	@Test //(enabled=false)
	public void verifyLogoTest() {
		boolean act = login.verifyLogo();
		Assert.assertEquals(act,true);
	}
	
	@Test //(enabled=false)
	public void verifyRobotLogoTest() {
		boolean act=login.verifyRobotLogo();
		Assert.assertEquals(act,true);
	}
	
	@Test //(enabled=false)
	public void verifyloginAppTest() throws Exception {
		String label=login.verifyloginApp();
		//Assert.assertEquals(label,"PRODUCTS");
		Assert.assertEquals(label, ReadData.readExcelFile(2, 0));
	}
	
	@Test //(enabled=false)
	public void verifyloginApp2Test() throws Exception {
		//Assert.assertEquals(login.verifyloginApp2(),"https://www.saucedemo.com/inventory.html");
		Assert.assertEquals(login.verifyloginApp2(),ReadData.readExcelFile(3,0));
	}
	
	@AfterMethod
	public void closeBrowser(ITestResult it) throws Exception {
		if(ITestResult.FAILURE==it.getStatus()) 
		{
			CaptureScreenshot.Screenshot(it.getName());
		}
		driver.close();
	}
	
	
	

}
