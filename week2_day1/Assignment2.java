package week2.week2_day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Automation");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Testing");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Auto");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("We are doing automation");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("auto@testleaf.com");
	
		WebElement stElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	
		Select state = new Select(stElement);
	
		state.selectByVisibleText("New York");
	
		driver.findElement(By.name("submitButton")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
		driver.findElement(By.id("updateLeadForm_description")).sendKeys("We are learning automation");
		
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Testing");
		
		driver.findElement(By.name("submitButton")).click();
		
		String titleEditLead = driver.getTitle();
		
		System.out.println(titleEditLead);
	
	
	
	
	}
}
