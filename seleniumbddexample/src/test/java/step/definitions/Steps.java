package step.definitions;

import utilities.BrowserUtil;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import seleniumbddexample.FbLoginPage;

public class Steps {
	RemoteWebDriver driver;

	@Given("User opened the browser")
	public void user_opened_the_browser() {
		driver = BrowserUtil.getDriver();
	}

	@When("User navigated to the Facebook login page")
	public void user_navigated_to_the_facebook_login_page() throws IOException {
		driver.get("https://www.facebook.com");
		File screenshot=driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("screenshots/fbLoginPage.jpg"));
		
	}

	@When("Enter email id as {string} and password as {string}")
	public void enter_email_id_as_and_password_as(String email, String password) {
		FbLoginPage loginPage = new FbLoginPage(driver); 
		loginPage.login(email, password);
		
	}
	
	@When("User clicked on the Login function")
	public void user_clicked_on_the_login_function() {
		FbLoginPage loginPage = new FbLoginPage(driver); 
		loginPage.clickLoginButton();
	}



}
