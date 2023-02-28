package week4.week4_day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Leafground {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30, 1));
		
		//1
		
		driver.findElement(By.xpath("//span[text()='Open']/..")).click();
		
		String windowHandle = driver.getWindowHandle();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		// System.out.println(windowHandles.size());
		
		List<String> windowList = new ArrayList<>(windowHandles);
		
		String childwindow = windowList.get(1);
		
		String windowHandle2 = driver.switchTo().window(childwindow).getWindowHandle();
		
		if(!windowHandle.equals(windowHandle2)) {
			//System.out.println("New Window Opened");
		} else {
			System.out.println("New Window not opened");
		}
		
		driver.close();
		
		driver.switchTo().window(windowHandle);
		
		
		//2
		
		driver.findElement(By.xpath("//span[text()='Open Multiple']/..")).click();
		
		String windowHandle_2 = driver.getWindowHandle();
		
		Set<String> windowHandles_2 = driver.getWindowHandles();
		
		System.out.println(windowHandles_2.size());
		
		for(String winhandle : windowHandles_2) {
			System.out.println(winhandle);
			driver.switchTo().window(winhandle);
			
			if(!windowHandle_2.equalsIgnoreCase(winhandle)) {
				System.out.println("New window opened with URL : "+ driver.getCurrentUrl());
				String title = driver.getTitle();
				System.out.println("New window opened with title : "+ title);
				driver.close();
				System.out.println("Closed the window with title : "+ title);
			} 
			
		}
		
		driver.switchTo().window(windowHandle_2);
		
		//3
		
		driver.findElement(By.xpath("//span[text()='Close Windows']/..")).click();
		
		String windowHandle_3 = driver.getWindowHandle();
		
		Set<String> windowHandles_3 = driver.getWindowHandles();
		
		System.out.println(windowHandles_3.size());
		
		for(String winhandle3 : windowHandles_3) {
			System.out.println(winhandle3);
			driver.switchTo().window(winhandle3);
			
			if(!windowHandle_3.equalsIgnoreCase(winhandle3)) {
				System.out.println("New window opened with URL : "+ driver.getCurrentUrl());
				String title = driver.getTitle();
				System.out.println("New window opened with title : "+ title);
				driver.close();
				System.out.println("Closed the window with title : "+ title);
			} 
			
		}
		
		driver.switchTo().window(windowHandle_3);
		
		//4
		
		driver.findElement(By.xpath("//span[text()='Open with delay']/..")).click();
		
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		
		String windowHandle_4 = driver.getWindowHandle();
		
		Set<String> windowHandles_4 = driver.getWindowHandles();
		
		System.out.println(windowHandles_4.size());
		
		for(String winhandle4 : windowHandles_4) {
			System.out.println(winhandle4);
			driver.switchTo().window(winhandle4);
			
			if(!windowHandle_4.equalsIgnoreCase(winhandle4)) {
				System.out.println("New window opened with URL : "+ driver.getCurrentUrl());
				String title = driver.getTitle();
				System.out.println("New window opened with title : "+ title);
				driver.close();
				System.out.println("Closed the window with title : "+ title);
			} 
			
		}
		
		driver.switchTo().window(windowHandle_4);
		
		driver.close();
	}
}
