package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage {
	
	@FindBy(id="name")
	WebElement txt_username;
	
	@FindBy(id="password")
	WebElement txt_password;
	
	@FindBy(id="Login")
	WebElement btn_login;
	
	@FindBy(id="logout")
	WebElement btn_logout;
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		AjaxElementLocatorFactory ajax=new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(ajax,this);
	}
	
	public void login(String username, String password)
	{
		txt_username.sendKeys(username);
		txt_password.sendKeys(password);
		btn_login.click();
	}
	
	public boolean validatelogin()
	{
		return btn_logout.isDisplayed();
	}

}
