package week4.week4_day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActions {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		WebElement draggableElement = driver.findElement(By.id("form:conpnl"));
		
		Point location = draggableElement.getLocation();
		
		int x = location.getX();
		
		int y = location.getY();
		
		System.out.println(x +","+ y);
		
		Actions builder = new Actions(driver);
		
		builder.dragAndDropBy(draggableElement, x+100, y+100).perform();
		
		Point location2 = draggableElement.getLocation();
		
		int x1 = location2.getX();
		int y1 = location2.getY();
		
		System.out.println(x1 +","+ y1);
		
		WebElement dropElement = driver.findElement(By.id("form:drop"));
		
		WebElement dragElement = driver.findElement(By.id("form:drag"));
		
		Actions builder2 = new Actions(driver);
		
		builder2.dragAndDrop(dragElement, dropElement).perform();
		
		WebElement column1 = driver.findElement(By.xpath("//span[text()='Quantity']"));
		
		WebElement column2 = driver.findElement(By.xpath("//span[text()='Name']"));
		
		Actions builder3 = new Actions(driver);
		
		builder3.dragAndDrop(column1, column2).perform();
		
		String information = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		
		System.out.println(information);
		
		WebElement sliderbar1 = driver.findElement(By.xpath("//div[@class='ui-slider-range ui-corner-all ui-widget-header']/following-sibling::span[1]"));
		
		Point location4 = sliderbar1.getLocation();
		
		int x4 = location4.getX();
		int y4 = location4.getY();
		
		System.out.println("X coordinate : "+ x4 +" Y coordinate : "+y4);
		
		Actions builder4 = new Actions(driver);
		
		builder4.dragAndDropBy(sliderbar1, -30, 0).perform();
		
		Point location5 = sliderbar1.getLocation();
		
		int x5 = location5.getX();
		int y5 = location5.getY();
		
		System.out.println("X coordinate : "+ x5 +" Y coordinate : "+y5);
		
		driver.close();
	}
}
