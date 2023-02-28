package week4.week4_day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnTable {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://erail.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtStationFrom")).clear();
		
		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS", Keys.TAB);
		
		driver.findElement(By.id("txtStationTo")).clear();
		
		driver.findElement(By.id("txtStationTo")).sendKeys("SBC", Keys.TAB);
		
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		WebElement tableElement = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']"));
	
		List<WebElement> rows = tableElement.findElements(By.tagName("tr"));
		
		System.out.println(rows.size());
		
		List<String> trainNames = new ArrayList<String>();
		
		for(int i = 1; i<rows.size();i++) {
			
			List<WebElement> columnElements = rows.get(i).findElements(By.tagName("td"));
			
			if(!columnElements.get(1).getText().isEmpty()) {
				trainNames.add(columnElements.get(1).getText());
			}
		}
		
		driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr[1]/th[2]/a[text()='Train Name']")).click();
		
		WebElement tableElement2 = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']"));
		
		List<WebElement> rows2 = tableElement2.findElements(By.tagName("tr"));
		
		List<String> latestTrainNames = new ArrayList<String>();
		
		for(int j = 1; j<rows2.size();j++) {
			
			List<WebElement> columnElements2 = rows2.get(j).findElements(By.tagName("td"));
			
			if(!columnElements2.get(1).getText().isEmpty()) {
				latestTrainNames.add(columnElements2.get(1).getText());
			}
		}		
				
		Collections.sort(trainNames);
		
		for(int k = 0; k<latestTrainNames.size();k++) {

			if(latestTrainNames.get(k).equalsIgnoreCase(trainNames.get(k))) {
				System.out.println("Train Names matched as expected");
			} else {
				System.out.println("Train Names not matching.");
			}
		}
	}
}
