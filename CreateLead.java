package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Open Browser
		 WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		
		//Enter UserName and Password Using Id Locator
		
		
		 WebElement elementUsername = driver.findElement(By.id("username"));
		 elementUsername.sendKeys("Demosalesmanager");
		 WebElement elementPassword = driver.findElement(By.id("password"));
		 elementPassword.sendKeys("crmsfa");
		 
		 //Click on Login Button using Class Locator
		 WebElement elementLoginButton = driver.findElement(By.className("decorativeSubmit"));
		 elementLoginButton.click();
		 
		 //Click on CRM/SFA Link
		 WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		 elementCRMSFA.click();
		 
		 //Click on Leads Button
		 WebElement elementLeads = driver.findElement(By.linkText("Leads"));
		 elementLeads.click();
		 
		 //Click on Create Lead Tab
		 WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
		 elementCreateLead.click();
		 
		 //Enter CompanyName Field Using id Locator
		 WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		 elementCompanyName.sendKeys("ABU DHABI Petroleum");
		 
		 //Enter FirstName Field Using id Locator
		 WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		 elementFirstName.sendKeys("SABARI");
		 
		 //Enter LastName Field Using id Locator
		 WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
		 elementLastName.sendKeys("NATH");
		 
		 // Enter FirstName(Local) Field Using id Locator
		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("FIRSTNAMELOCAL");
		 
		 //Enter Department Field Using any Locator of Your Choice
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT DEPT");
		 
		 //Enter Description Field Using any Locator of Your Choice
		 driver.findElement(By.id("createLeadForm_description")).sendKeys("IT Engineer");
		 
		 //Enter your email in the E-mail address Field Using any Locator of Your Choice
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sabari@gmail.com");
		
		
		//Select State/Province as NewJerssey Using Visible Text
		
		 WebElement elementDropDown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		 Select dd = new Select(elementDropDown);
		 dd.selectByValue("NJ");
		
		//Click on Create Button
		
		WebElement elementCreateLeadButton = driver.findElement(By.className("smallSubmit"));
		 elementCreateLeadButton.click();
        
				
		//Get the Title of Resulting Page. refer the video  using driver.getTitle()
		
		//String Title=driver.getTitle();
		
		System.out.println(driver.getTitle());
		
		
	}

}
