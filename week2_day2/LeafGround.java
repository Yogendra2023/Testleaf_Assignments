package week2.week2_day2;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//h5[text()='Type your name']/following::div[1]//input")).sendKeys("Automation");
		
		String retrievedName = driver.findElement(By.xpath("//h5[text()='Type your name']/following::div[1]//input")).getAttribute("value");
		
		System.out.println(retrievedName);
		
		driver.findElement(By.xpath("//h5[text()='Append Country to this City.']/following::div[1]//input")).sendKeys("INDIA");
		
		String retrievedPlace = driver.findElement(By.xpath("//h5[text()='Append Country to this City.']/following::div[1]//input")).getAttribute("value");
		
		System.out.println(retrievedPlace);
		
		boolean textboxenabled = driver.findElement(By.xpath("//h5[text()='Verify if text box is disabled']/following::div[1]//input")).isEnabled();
		
		System.out.println(textboxenabled);
		
		driver.findElement(By.xpath("//h5[text()='Clear the typed text.']/following::div[1]//input")).clear();
		
		String retrievedClearText = driver.findElement(By.xpath("//h5[text()='Clear the typed text.']/following::div[1]//input")).getAttribute("value");
		
		System.out.println(retrievedClearText);
		
		String retrievedValue = driver.findElement(By.xpath("//h5[text()='Retrieve the typed text.']/following::div[1]//input")).getAttribute("value");
		
		System.out.println(retrievedValue);
		
		driver.findElement(By.xpath("//h5[contains(text(),'Type email and Tab')]/following::div[1]//input")).sendKeys("a@gmail.com");
		
		driver.findElement(By.xpath("//h5[contains(text(),'Type email and Tab')]/following::div[1]//input")).sendKeys(Keys.TAB);
		
		driver.findElement(By.xpath("//h5[text()='Type about yourself']/following::div[1]//textarea")).sendKeys("Welcome to Testleaf");
		
		String retrievedAbout = driver.findElement(By.xpath("//h5[text()='Type about yourself']/following::div[1]//textarea")).getAttribute("value");
		
		System.out.println(retrievedAbout);
		
		driver.findElement(By.xpath("//h5[text()='Text Editor']/following::div[1]//div[@class='ql-editor ql-blank']")).sendKeys("Automation");
		
		String retrievedEditor = driver.findElement(By.xpath("//h5[text()='Text Editor']/following::div[1]//div[@class='ql-editor']/p")).getText();
		
		System.out.println(retrievedEditor);
		
		driver.findElement(By.xpath("//h5[text()='Just Press Enter and confirm error message*']/following::div[1]//input")).sendKeys(Keys.ENTER);
		
		String retrievedErrorMessage = driver.findElement(By.xpath("//span[@class='ui-message-error-detail']")).getText();
		
		System.out.println(retrievedErrorMessage);
		
		Point location = driver.findElement(By.xpath("//h5[text()='Click and Confirm Label Position Changes']/following::span[1]//label")).getLocation();
		
		System.out.println("X : " + location.getX());
        System.out.println("Y : " + location.getY());
        
		driver.findElement(By.xpath("//h5[text()='Click and Confirm Label Position Changes']/following::span[1]//input")).click();
		
		Point location2 = driver.findElement(By.xpath("//h5[text()='Click and Confirm Label Position Changes']/following::span[1]//label")).getLocation();
		
		System.out.println("X : " + location2.getX());
        System.out.println("Y : " + location2.getY());
        
		if((location.getX() != location2.getX()) || (location.getY() != location2.getY())){
			System.out.println("Position of the label got Changed");
		} else {
			System.out.println("Position of the label not Changed");
		}
		
		driver.findElement(By.xpath("//h5[text()='Type your name and choose the third option']/following::div[1]//input")).sendKeys("10");
		
		Thread.sleep(3000);
		
			
		List <WebElement> op = driver.findElements(By.xpath("//span[@role='listbox']/ul/li"));
		
		op.get(2).click();
		
		String selectedValue = driver.findElement(By.xpath("//span[@role='listbox']/ul/li[@class='ui-autocomplete-item ui-autocomplete-list-item ui-corner-all ui-state-highlight']")).getText();
		
		System.out.println(selectedValue);
		
		driver.findElement(By.xpath("//h5[text()='Click and Confirm Keyboard appears']/following::input[1]")).click();
		
		Thread.sleep(3000);
		
		boolean keypadDisplayed = driver.findElement(By.xpath("//div[@class='ui-widget ui-widget-content ui-corner-all ui-shadow keypad-popup ui-input-overlay']")).isDisplayed();
	
		System.out.println(keypadDisplayed);
	
		driver.findElement(By.xpath("//button[@type='button'][text()='Close']")).click();
		
		driver.findElement(By.xpath("//h5[text()='Custom Toolbar']/following::div[@class='ql-editor ql-blank']")).sendKeys("Completed Successfully");
		
		String retrievedToolMessage = driver.findElement(By.xpath("//h5[text()='Custom Toolbar']/following::div[@class='ql-editor']/p")).getText();
		
		System.out.println(retrievedToolMessage);
		
	}
}
