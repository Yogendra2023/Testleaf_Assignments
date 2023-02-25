package week3.week3_day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		
		List<WebElement> priceelem = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		List<Integer> allPricesInt = new ArrayList<>();
		
		for(WebElement each : priceelem) {
			String text = each.getText().replaceAll(",", "");
			if(!text.isEmpty()) {
			int text2 = Integer.parseInt(text);
			allPricesInt.add(text2);
			}

		}
		
		Collections.sort(allPricesInt);
		
		System.out.println(allPricesInt.get(0));

	}

}
