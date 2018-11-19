package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	ChromeDriver dr;
	@Given("^open Browser$")
	public void open_Browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/anick/Downloads/chromedriver");
		dr = new ChromeDriver();

	    
	}

	@Given("^nevigate to facebook url$")
	public void nevigate_to_facebook_url() throws Throwable {
		dr.get("https://www.facebook.com/");
	   
	}

	@When("^user type userid on user id box$")
	public void user_type_userid_on_user_id_box() throws Throwable {
		
		dr.findElement(By.id("email")).sendKeys("userid");
	    
	}
	@When("^user type password on password box$")
	public void user_type_password_on_password_box() throws Throwable {
		
		dr.findElement(By.id("Password")).sendKeys("password");
	    
	}

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
		dr.findElement(By.id("kooo")).click();
		
	   
	}

	@Then("^user should be in profile page$")
	public void user_should_be_in_profile_page() throws Throwable {
	   
	}

@When("^user type invalid userid on user id box$")
public void user_type_invalid_userid_on_user_id_box() throws Throwable {
    
}

@When("^user type invalid password on password box$")
public void user_type_invalid_password_on_password_box() throws Throwable {
    
}

@Then("^user should not be in profile page$")
public void user_should_not_be_in_profile_page() throws Throwable {
    
}

@When("^user type \"([^\"]*)\" on user id box$")
public void user_type_on_user_id_box(String arg1) throws Throwable {
	dr.findElement(By.id("email")).sendKeys(arg1);
    
    
}

@When("^user type \"([^\"]*)\" on password box$")
public void user_type_on_password_box(String arg1) throws Throwable {
	
	
	dr.findElement(By.id("Password")).sendKeys(arg1);
    
   
}




	
	
	

}
