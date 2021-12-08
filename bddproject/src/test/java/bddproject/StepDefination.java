package bddproject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefination {
	WebDriver dr;
	@Given("^open browser$")
	public void open_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   dr= new ChromeDriver();
	}

	@Given("^go to homepage$")
	public void go_to_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    dr.get("htttp://www.facebook.com");
	}

	@When("^user type email in user Text box$")
	public void user_type_email_in_user_Text_box() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    dr.findElement(By.id("email")).sendKeys("my email");
	}

	@When("^user type pass in password text box$")
	public void user_type_pass_in_password_text_box() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    dr.findElement(By.id("pass")).sendKeys("my pass");
	}

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    dr.findElement(By.id("u_0_2")).click();
	}

	@Then("^user should be ain his profile page$")
	public void user_should_be_ain_his_profile_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertTrue(dr.findElement(By.xpath("logout")).isDisplayed());
	}

}
