package pages.using.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

public class FbForgotPasswordPage {
	RemoteWebDriver driver; 

	@FindBy (name="email")
	WebElement inputEmail;
	
//	By inputEmail = By.name("email");
//	By clickButton = By.name("");
//	
	public void setEmailId (String email) {
		inputEmail.sendKeys(email);
	}
	

}
