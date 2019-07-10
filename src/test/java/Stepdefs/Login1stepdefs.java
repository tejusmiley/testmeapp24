package Stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Cucumber_demo.Cucumber_June.Drivers;
import Cucumber_demo.Cucumber_June.pageobject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import testmePages.TpLogin;

public class Login1stepdefs {
	
	WebDriver driver;
	
	
	@Given("^user launched the tricentis browser$")
	public void user_launched_the_tricentis_browser() throws Throwable {
	
		//driver= Drivers.getDriver("chrome");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_H2A.05.18\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
		
		
		
	}

	@Given("^is on the tosca demo web shop page$")
	public void is_on_the_tosca_demo_web_shop_page() throws Throwable {
		
		System.out.println("hello on page");
	 
		
	}

	@When("^user clicks on tricentis login link$")
	public void user_clicks_on_tricentis_login_link() throws Throwable {
		
		System.out.println("hii..last line");
		
		Thread.sleep(5000);
		
		//pageobject.signin.click();
		
	
	    
	}

	@When("^user provides valid tricentis credentials$")
	public void user_provides_valid_tricentis_credentials() throws Throwable {
		
		pageobject poj =PageFactory.initElements(driver,pageobject.class);
	    poj.username.sendKeys("tejusmiley@gmail.com");
	    poj.password.sendKeys("teja24");
	    poj.login.click();
	
		
		
		
		
	   
	}
}
