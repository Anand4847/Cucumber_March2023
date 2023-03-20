package com.stepdef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	WebDriver driver;

	@Given("User needs to be on login page")
	public void user_needs_to_be_on_login_page() {

		System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

	}

	@When("User Enter username and click on continue button")
	public void user_enter_username_and_click_on_continue_button() {

		driver.findElement(By.cssSelector("[id='ap_email']")).sendKeys("anandsoni2641@gmail.com");

		driver.findElement(By.cssSelector("[id='continue']")).click();
	}

	@When("enter password")
	public void enter_password() {

		driver.findElement(By.cssSelector("[id='ap_password']")).sendKeys("Harbhaj@26");

	}

	@When("click on signin button")
	public void click_on_signin_button() throws Exception {
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(3000);
	}

	@Then("User it should navigate to the home page")
	public void user_it_should_navigate_to_the_home_page() {

		String url = driver.getCurrentUrl();

		if (url.contains("home"))

		{

			Assert.assertTrue(true);

		} else

		{

			Assert.assertTrue(false);

		}

	}

	@When("User Enter {string} and click on continue button")
	public void user_enter_and_click_on_continue_button(String username) {

		driver.findElement(By.cssSelector("[id='ap_email']")).sendKeys(username);
		driver.findElement(By.cssSelector("[id='continue']")).click();

	}

	@When("enter {string}")
	public void enter(String password) {

		driver.findElement(By.cssSelector("[id='ap_password']")).sendKeys(password);
	}

	@Then("User it should throw validation error")
	public void user_it_should_throw_validation_error() {
		String error = driver.findElement(By.xpath("//span[contains(text(),'Your password is incorrect')]")).getText();

		if (error.equalsIgnoreCase("Your password is incorrect"))

		{

			Assert.assertTrue(true);

		} else {

			Assert.assertTrue(false);

		}

	}

	@After

	public void tearDown()

	{
		driver.quit();
	}

}
