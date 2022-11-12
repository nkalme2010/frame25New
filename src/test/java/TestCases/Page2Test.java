package TestCases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import Pages.Page2;
import Utility.CaptureScreenshot;
import Utility.ReadData;

public class Page2Test extends TestBase {
	LoginPage login;
	Page2 inventory;
	
	@BeforeMethod
		public void setUp() throws Exception 
	{
		initalization();
		login=new LoginPage();
		inventory=new Page2();
	}
	
	@Test(enabled=false)
	public void verifyTitleTest() throws Exception {
	login.verifyloginApp2();
	String	a=inventory.verifyTitle();
	Assert.assertEquals(a,ReadData.readExcelFile(0, 0));
	}
	
	@Test(enabled=false)
	public void verifyProductsTextTest() throws Exception {
	login.verifyloginApp2();
	String a = inventory.verifyProductsText();
	Assert.assertEquals(a,ReadData.readExcelFile(0,1));
	}
	
	@Test(enabled=false)
	public void verifySmallLogoTest() throws Exception 
	{
		login.verifyloginApp2();
		boolean a = inventory.verifySmallLogo();
		Assert.assertEquals(a,true);
	}
	
	@Test(enabled=false)
	public void verifyBigLogoTest() throws Exception {
		login.verifyloginApp2();
		boolean a = inventory.verifyBigLogo();
		Assert.assertEquals(a,true);
	}
	
	@Test(enabled=false)
	public void  add6ProductTest() throws Exception {
		login.verifyloginApp2();
		String a=inventory.add6Product();
		Assert.assertEquals(a,"6");
		
	}
	
	@Test(enabled=false)
	public void remove2productsTest() throws Exception {
		login.verifyloginApp2();
		String a = inventory.remove2products();
		Assert.assertEquals(a,"4");
	}
	
	@Test
	public void verifyTwitterlogoTest() throws Exception {
		login.verifyloginApp2();
		boolean a = inventory.verifyTwitterlogo();
		Assert.assertEquals(a,true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 @AfterMethod
	public void closeBrowser(ITestResult it) throws Exception {
	 if(ITestResult.FAILURE	==	it.getStatus())
	 {
	CaptureScreenshot.Screenshot(it.getName());
	 }
		driver.close();
	}
	
	
	
}
