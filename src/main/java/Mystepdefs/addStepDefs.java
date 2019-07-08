package Mystepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


//@test
public class addStepDefs {
	
	int a , b , c,prd,m,n;
	
	
	@Given("^I have two numbers$")
	public void i_have_two_numbers() throws Throwable {
	   a = 10;
	   b = 30;
			 
		
		
	}
	
	@Given("^I want to add both numbers$")
	public void i_want_to_add_both_numbers() throws Throwable {
	  c = a + b;
	  
	
	}

	@Then("^sum shall be saved in (\\d+)rd number$")
	public void sum_shall_be_saved_in_rd_number(int arg1) throws Throwable {
	   System.out.println("the value of addition is " +c);

	}
	

	@Given("^I have other two numbers (\\d+) (\\d+)$")
	public void i_have_other_two_numbers(int m, int n) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		prd = m * n;		
		System.out.println("m is :" +m);
		System.out.println("the productof and b is :" +prd);
		
	}


	@Given("^i want to multiply both the numbers$")
	public void i_want_to_multiply_both_the_numbers() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^product shall be saved in third number$")
	public void product_shall_be_saved_in_third_number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	

	
		
		
		
	}


	
	

}
