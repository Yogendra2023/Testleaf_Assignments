package week2.week2_day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {
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
		
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("jack.son@gmail.com");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(3000);
		
		String capturedLeadName = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")).getText();
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		String titleDuplicateLead = driver.getTitle();
		
		System.out.println(titleDuplicateLead);
		
		driver.findElement(By.name("submitButton")).click();
		
		Thread.sleep(3000);
		
		String capturedActualLeadName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		
		if(capturedLeadName.equals(capturedActualLeadName)) {
		System.out.println("Names Matched.");
		} else {
			System.out.println("Names not Matched.");	
		}
		driver.close();
	
	
	}
}
