package stepDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CreateLeadStep extends BaseClass{
	

	@Given("Click CRMSFA link")
	public void crmsfa_link()
	{
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@And("Click Leads button")
	public void leads()
	{
		driver.findElement(By.linkText("Leads")).click();
	}
	@And("Click CreateLead button")
	public void createLead()
	{
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@When("Enter the Company name as (.*)$")
	public void companyName(String cn)
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cn);
	}
	@And("Enter the First name as (.*)$")
	public void firstName(String fn)
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fn);
	}
	@And("Enter the Last name as (.*)$")
	public void lastName(String ln)
	{
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(ln);
	}
	@And("Click on the CreateLead  button")
	public void createLeadButton()
	{
		driver.findElement(By.name("submitButton")).click();	
	}
	

}
