package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdef extends BaseClass{
//	public ChromeDriver driver;
	
	@Given("Open the chrome browser")
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	@And("Load the application")
	public void loadapp() {
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@And("Enter the Username as {string}")
	public void enterUsername(String string)
	{
		driver.findElement(By.id("username")).sendKeys(string);
	}
	
	@And("Enter the Password as {string}")
	public void enterPassword(String string)
	{
		driver.findElement(By.id("password")).sendKeys(string);	
	}
	@When("Click on the Login button")
	public void login()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
	}
//	@Then("HomePage should be displayed")
//	public void verify()
//	{
////		driver.findElement(By.linkText("CRM/SFA")).click();
//
//	}
}
