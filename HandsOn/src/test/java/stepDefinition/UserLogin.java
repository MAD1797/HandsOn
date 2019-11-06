package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class UserLogin {
	
	public static WebDriver driver;
	
	
	@Given("navigate to home page")
	public void navigate_to_home_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Mark\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm#");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("SignIn")).click();
		
	}
	
	@When("user enters {string} and {string}")
	public void user_enters_username_and_password(String string, String string2) {
		
		driver.findElement(By.id("userName")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
		driver.findElement(By.name("Login")).click();
		//String check = driver.getTitle();
		//String home = "Home";
		//System.out.println(check);
		/*if(check.contains(home))
		{
			System.out.println("Login Successful!");
		}
		else
		{
			System.out.println("Login Failed!");
		}*/
	}
	
	@Then("Message login successfully")
	public void message_login_successfully() {
		
		//String check = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']")).getText();
		//System.out.println(check);
		//Assert.assertEquals(check, "Hi, Lalitha SignOut");
		String check = driver.getTitle();
		String home = "Home";
		if(check.contains(home))
		{
			Assert.assertEquals(driver.getTitle(), "Home");
			System.out.println("Login Successful!");
			driver.close();
		}
		else
		{
			Assert.assertEquals(driver.getTitle(), "Login");
			System.out.println("Login Failed!");
			driver.close();
		}
	}

}
