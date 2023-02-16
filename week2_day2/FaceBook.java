package week2.week2_day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.linkText("Create new account")).click();

		driver.findElement(By.name("firstname")).sendKeys("Auto");
		
		driver.findElement(By.name("lastname")).sendKeys("Test");
		
		driver.findElement(By.name("reg_email__")).sendKeys("a@g.com");
		
		driver.findElement(By.id("password_step_input")).sendKeys("123456");
		
		WebElement dobdd = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select dd = new Select(dobdd);
	
		dd.selectByVisibleText("25");
		
		WebElement dobmm = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select mm = new Select(dobmm);
	
		mm.selectByVisibleText("Mar");
		
		WebElement dobyyyy = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select yy = new Select(dobyyyy);
	
		yy.selectByVisibleText("1995");
	
		driver.findElement(By.xpath("//label[text()='Female']/parent::span/input[@name='sex']")).click();
	
			
	}
}
