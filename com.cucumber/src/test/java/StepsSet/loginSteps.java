package StepsSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class loginSteps {
	
	WebDriver driver=null;
	LoginPage loginPage;
	
	@Before(value="@smoke", order=1)
	public void test() {
	System.out.println("This will be used only in smoke & shoudl come second");	
	}
	
	@Before(order=0)
	public void setup() {
		System.out.println("this should come first");
		String home_dir=System.getProperty("user.dir");
		//System.setProperty("webdriver.chrome.driver", home_dir+"/src/test/resources/Drivers/chromedriver.exe");
		//driver=new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", home_dir+"/src/test/resources/Drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		
		
	}
	
	@After
	public void teardown() {
		driver.quit();
	}
	
	@Given("Open the browser")
	public void open_the_browser() {
		driver.manage().window().maximize();

	}

	@When("Navigate to the url")
	public void navigate_to_the_url() {
		driver.navigate().to("https://example.testproject.io/web/");
	}

	@When("^login using (.*) and (.*)$")
	public void login_using_and(String username, String password) throws InterruptedException {
		//Thread.sleep(5000);
		loginPage=new LoginPage(driver);
		loginPage.login(username, password);
		
		Thread.sleep(5000);
		
		if(loginPage.validatelogin())
			System.out.println("Login is successfull");
		else
			System.out.println("Login is not successfull");
		
	}

}
