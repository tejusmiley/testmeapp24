package Cucumber_demo.Cucumber_June;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageobject {
	
	
	WebDriver driver;
	
	public pageobject(WebDriver driver) {
		
		this.driver = driver;
				
	}
	
 
 @FindBy(xpath = "//input[@id='Email']")
 public static WebElement username;	
 
 

 
 @FindBy(xpath= "//input[@id='Password']")
 public static WebElement password;
 
 @FindBy(xpath="//input[@value='Log in']")
 public static WebElement login;
 

}
