package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FbForgotPasswordPage {
	RemoteWebDriver driver; 

	By inputEmail = By.name("email");
	By clickButton = By.name("");
	
	public void setEmailId (String email) {
		driver.findElement(inputEmail).sendKeys(email);
	}
	

}
