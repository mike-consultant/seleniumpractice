package pages.using.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPage {

	public FbLoginPage(RemoteWebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Locators
	@FindBy (id="email")
	WebElement inputEmailId; 
	
	@FindBy (id="pass")
	WebElement inputPassword;
	
	@FindBy (xpath="//button")
	WebElement buttonLogin;
	
	@FindBy (xpath="//a[text()='Forgotten password?']")
	WebElement linkForgotPassword;
	
//	By inputEmailId=By.id("email");
//	By inputPassword=By.id("pass");
//	By buttonLogin=By.xpath("//button");
//	By linkForgotPassword=By.xpath("//a[text()='Forgotten password?']");
//	
	//Methods which performs operation on the Login Page
	public void setEmailId(String email) {
		inputEmailId.sendKeys(email);
	}
	
	public void setPassword(String password) {
		inputPassword.sendKeys(password);
	}
	
	public void clickLoginButton() {
		buttonLogin.click();
	}
	
	public void login(String email,String password) {
		setEmailId(email);
		setPassword(password);
		clickLoginButton();
	}
	
	public void clickForgotPasswordLink() {
		linkForgotPassword.click();
	}

}
