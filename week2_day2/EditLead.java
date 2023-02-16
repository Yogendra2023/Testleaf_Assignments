package week2.week2_day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("//label[contains(text(),'First name')]/parent::div[@class='x-form-item x-tab-item']/div[@class='x-form-element']/input[@name='firstName']")).sendKeys("Jackson");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		
		String titleViewLead = driver.getTitle();
		
		System.out.println(titleViewLead);
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TestLeaf");
		
		driver.findElement(By.name("submitButton")).click();
		
		String CompanyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		
		if(CompanyName.contains("TestLeaf")){
			System.out.println("Company Name Updated Successfully");
		} else {
			System.out.println("Company Name not updated properly");	
		}

		driver.close();
	
	
	}
}
