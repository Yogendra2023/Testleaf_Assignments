package week2.week2_day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();

		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();

		driver.findElement(By.xpath("//a[text()='Leads']")).click();

		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Automation");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Testing");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Auto");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Testing");
		
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("We are doing automation");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("auto@testleaf.com");
	
		WebElement stElement = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
	
		Select state = new Select(stElement);
	
		state.selectByVisibleText("New York");
	
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	
		String titleCreateLead = driver.getTitle();
		
		System.out.println(titleCreateLead);
	
	
	
	
	}
}
