package Mystepdefs;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class demowebloginstepdef {
	
	
	private WebDriver driver;
	

	
	@Given("^user launched the browser$")
	public void user_launched_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\s.srinadhuni\\Documents\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		
		
		
		
	}

	@Given("^is on the tricentis demo web shop page$")
	public void is_on_the_tricentis_demo_web_shop_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		
		String actualTitle = driver.getTitle();
		
		//String expectedTitle = "Demo Web Shop";
		
		Assert.assertEquals("Demo Web Shop", actualTitle);
		
		System.out.println("title of page is " +actualTitle);
		
	
		
		
		
	}

	@When("^user clicks on login link$")
	public void user_clicks_on_login_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		driver.findElement(By.linkText("Log in")).click();
	}

	@When("^user provides valid credentials$")
	public void user_provides_valid_credentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.manage().window().maximize();
		
		driver.findElement(By.id("Email")).sendKeys("srinadhuni.srilakshmi@acn.test");
		driver.findElement(By.id("Password")).sendKeys("Tosca456$");
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		
	}



	

}
	
	
	


