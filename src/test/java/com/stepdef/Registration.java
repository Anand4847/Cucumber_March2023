package com.stepdef;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registration {

	WebDriver driver;

	
@Given("User needs to be on registration page")
public void user_needs_to_be_on_registration_page() {
    
   
}
@When("User enter details")
public void user_enter_details(io.cucumber.datatable.DataTable dataTable) {
    
	Map<String, String> myDetails = dataTable.asMap(String.class, String.class);
	System.out.println(myDetails.get("username"));
	System.out.println(myDetails.get("password"));
	System.out.println(myDetails.get("cpassword"));
	System.out.println(myDetails.get("mobno"));
	System.out.println(myDetails.get("company"));
	System.out.println(myDetails.get("location"));
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
   
}
@When("User clicks on submit button")
public void user_clicks_on_submit_button() {
    
   
}
@Then("User details should be successfully submitted")
public void user_details_should_be_successfully_submitted() {
    
   
}


	

}
