package week4.week4_day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Contacts")).click();
		
		driver.findElement(By.linkText("Merge Contacts")).click();
		
		String currWindowHandle = driver.getWindowHandle();
		
		System.out.println(currWindowHandle);
		
		driver.findElement(By.xpath("//input[@id='partyIdFrom']/following-sibling::a")).click();
				
		Set<String> windowHandles = driver.getWindowHandles();
		
		System.out.println(windowHandles);
		
		List<String> windowList = new ArrayList<>(windowHandles);
		
		String childwindow = windowList.get(1);
		
		driver.switchTo().window(childwindow);
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		
		driver.switchTo().window(currWindowHandle);
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[@id='partyIdTo']/following-sibling::a")).click();
		
		Set<String> windowHandles2 = driver.getWindowHandles();
		
		System.out.println(windowHandles2);
		
		List<String> windowList2 = new ArrayList<>(windowHandles2);
		
		String childwindow2 = windowList2.get(1);
		
		driver.switchTo().window(childwindow2);
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
		
		driver.switchTo().window(currWindowHandle);
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("Merge")).click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		String pageTitle = driver.getTitle();
		
		System.out.println(pageTitle);
	}
}
