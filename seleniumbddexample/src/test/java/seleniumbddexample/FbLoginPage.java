package seleniumbddexample;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FbLoginPage {
	//Define and initialize the driver
	RemoteWebDriver driver;
	
	public FbLoginPage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	//Locators
	By inputEmailId=By.id("email");
	By inputPassword=By.id("pass");
	By buttonLogin=By.xpath("//button");
	By linkForgotPassword=By.xpath("//a[text()='Forgotten password?']");
	//By errorMessageFindAccountLink = By.className("//a[text()='Find your account and log in.']");
	
	
	//Methods which performs operation on the Login Page
	public void setEmailId(String email) {
		driver.findElement(inputEmailId).sendKeys(email);
	}
	
	public void setPassword(String password) {
		driver.findElement(inputPassword).sendKeys(password);
	}
	
	public void clickLoginButton() {
		driver.findElement(buttonLogin).click();
	}
	
	public void login(String email,String password) {
		setEmailId(email);
		setPassword(password);
		clickLoginButton();
	}
	
	public void clickForgotPasswordLink() {
		driver.findElement(linkForgotPassword).click();
	}
	
	public void errorMessageDisplayed() {
		System.out.println("Error message is displayed here!");
	}

}
