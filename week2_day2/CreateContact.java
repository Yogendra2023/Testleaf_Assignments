package week2.week2_day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Contacts")).click();

		driver.findElement(By.linkText("Create Contact")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("Testleaf");
		
		driver.findElement(By.id("lastNameField")).sendKeys("Automation");
		
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Auto");
		
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Auto");
		
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing");
		
		driver.findElement(By.id("createContactForm_description")).sendKeys("We are doing automation");
		
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("auto@testleaf.com");
	
		WebElement stElement = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
	
		Select state = new Select(stElement);
	
		state.selectByVisibleText("New York");
	
		driver.findElement(By.name("submitButton")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("updateContactForm_description")).clear();
		
		driver.findElement(By.id("updateContactForm_description")).sendKeys("We are learning automation");
		
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Testing");
		
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		String titleCreateLead = driver.getTitle();
		
		System.out.println(titleCreateLead);
	
	
	
	
	}
}
