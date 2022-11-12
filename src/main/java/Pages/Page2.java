package Pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadData;
import Utility.UtilityMethod;

public class Page2 extends TestBase{
	
	//TC1 - verify the visibility of small logo
	//TC2 - verify the visibility of big logo
	//TC3 - Add 6 product in cart
	//TC4 - Remove 2 product from cart
	//TC5 - verify the visibility of twitter logo (Assignment)
	//TC6 - verify the visibility of fb logo (Assignment)
	//TC7 - verify the visibility of linkedin logo (Assignment
	
	//Object Repository
	@FindBy(xpath="//span[@class='title']")private WebElement products;
	@FindBy(xpath="//img[@class='footer_robot']")private WebElement smallLogo1;
	@FindBy(xpath="//div[@class='peek']")private WebElement largeLogo1;
	@FindBy(xpath="//select[@class='product_sort_container']")private WebElement dropDown;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']")private WebElement product1;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")private WebElement product2;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")private WebElement product3;
	@FindBy(xpath="//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")private WebElement product4;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']")private WebElement product5;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-onesie']")private WebElement product6;
	@FindBy(xpath="//span[@class='shopping_cart_badge']")private WebElement cartBadge;
	@FindBy(xpath="//a[contains(text(),'Twitter')]")private WebElement twitter;
	@FindBy(partialLinkText="Twitt")private WebElement twitter2;
	@FindBy(xpath="//a[contains(text(),'Facebook')]")private WebElement facebook;
	@FindBy(xpath="//a[contains(text(),'LinkedIn')]")private WebElement linkedin;
	@FindBy(xpath="//div[@id='shopping_cart_container']")private WebElement cart;
	@FindBy(xpath="//span[contains(text(),'Your Cart')]")private WebElement yourCart;
	//button[@id='remove-sauce-labs-fleece-jacket']
	//button[@id='remove-sauce-labs-bolt-t-shirt']
	@FindBy(xpath="//button[@id='remove-sauce-labs-fleece-jacket']")private WebElement removeProduct1;
	@FindBy(xpath="//button[@id='remove-sauce-labs-bolt-t-shirt']")private WebElement removeProduct2;
	
	//Constructor
	
	public Page2()
	{
		PageFactory.initElements(driver,this);
	}
	
//Methods
	
//Method to verify title
	public String verifyTitle()
	{
	return	driver.getTitle();
	}
		
//Method to verify the Products label Text
	public String verifyProductsText()
	{
		return  products.getText();
		
	}
	

	//Methods
	public boolean verifySmallLogo()
	{
	return smallLogo1.isDisplayed();
	}
	
	
	public boolean verifyBigLogo()
	{
	return largeLogo1.isDisplayed();
	}
	
	
	public String add6Product() throws Exception
	{
	UtilityMethod.selectClass(dropDown,ReadData.readExcelFile(4,0));
	product1.click();
	product2.click();
	product3.click();
	product4.click();
	product5.click();
	product6.click();
	String count = cartBadge.getText();
	return count;
	}
	
	public String remove2products() throws Exception
	{
		add6Product();
		cart.click();
   removeProduct1.click();
   removeProduct2.click();
  // return driver.getCurrentUrl();
   return cartBadge.getText();
	}

	public boolean verifyTwitterlogo() {
	return	twitter.isDisplayed();
		//twitter.click();
		//Set<String> s = driver.getWindowHandles();
		//	String w[]=new String[2];
		//WebDriver a = driver.switchTo().window(w[1]);
		//	String b = driver.getCurrentUrl();
		//return b;
		
	}

















































}
