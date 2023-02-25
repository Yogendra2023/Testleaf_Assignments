package week4.week4_day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt1");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		WebElement frameWebelement = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		
		driver.switchTo().frame(frameWebelement);
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		String alertText = alert.getText();
		
		System.out.println(alertText);
		
		alert.sendKeys("Pepsi");
		
		alert.accept();
		
		String alertMessage = driver.findElement(By.id("demo")).getText();
		
		System.out.println(alertMessage);
		
		driver.switchTo().defaultContent();
	}

}
