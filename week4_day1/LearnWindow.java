package week4.week4_day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindow {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/dashboard.xhtml");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//ul[@class='layout-menu']/li[2]")).click();
		
		driver.findElement(By.xpath("//span[text()='Window']/..")).click();
		
		String currentwindowHandle = driver.getWindowHandle();
		
		System.out.println(currentwindowHandle);
		
		driver.findElement(By.xpath("//span[text()='Open']/..")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
		System.out.println(windows);
		
		List<String> windowslist = new ArrayList<>(windows);
		
		String childwindow = windowslist.get(1);
		
		driver.switchTo().window(childwindow);
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(currentwindowHandle);
		
		System.out.println(driver.getCurrentUrl());

		System.out.println(driver.getTitle());
	}

}
