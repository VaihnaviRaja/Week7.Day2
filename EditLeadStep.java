package stepDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLeadStep extends BaseClass{
//	@Given("Click CRMSFA link")
//	public void crmsfa_link()
//	{
//		driver.findElement(By.linkText("CRM/SFA")).click();
//	}
//	@And("Click Leads button")
//	public void leads()
//	{
//		driver.findElement(By.linkText("Leads")).click();
//	}
	@Given("Click FindLead button")
	public void findLeads()
	{
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@And("Click Phone button")
	public void phone_button()
	{
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
	@And("Enter phonenumber as {string}")
	public void phoneNumber(String string)
	{
		driver.findElement(By.xpath("//input[@id='ext-gen270']")).sendKeys(string);

	}
	@And("Click Find Leads button")
	public void find()
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	@Then("Click the first result")
	public void first()
	{
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/viewLead?partyId=10087']")).click();
	}
	@And("Click Edit button")
	public void edit()
	{
		driver.findElement(By.linkText("Edit")).click();
	}
	@And("Enter the company name as {string}")
	public void companyName(String string)
	{
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(string);
	}
	@Then("Click Submit button")
	public void submit()
	{
		driver.findElement(By.name("submitButton")).click();
	}
}
