package week4.week4_day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30, 1));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 10 Pro");
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		String initialPrice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		
		String replaceString = initialPrice.replaceAll(",","");
		
		System.out.println(replaceString);
		
		int initialAmount = Integer.parseInt(replaceString);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='a-icon-alt'])[1]/..")));
		
		driver.findElement(By.xpath("(//span[@class='a-icon-alt'])[1]/..")).click();
		
		String totalRatingsText = driver.findElement(By.xpath("//span[@class='a-size-base a-color-secondary totalRatingCount']")).getText();
	
		String totalRatings = totalRatingsText.split(" ")[0];
		
		String replacetotalRatings = totalRatings.replaceAll(",","");
		
		System.out.println(replacetotalRatings);
		
		int ratingsCount = Integer.parseInt(replacetotalRatings);
		
		System.out.println("Total ratings : "+ ratingsCount);
		
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal']/..)[1]")).click();
		
		String windowHandle = driver.getWindowHandle();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		System.out.println(windowHandles.size());
		
		for(String winhandle : windowHandles) {
		
			if(!windowHandle.equalsIgnoreCase(winhandle)) {
				driver.switchTo().window(winhandle);
			} 
		}
		
		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		
        //Move image file to new destination

        File DestFile=new File("C://Users//SM7//Desktop//Screenshot.jpeg");

        //Copy file at destination

        FileUtils.copyFile(SrcFile, DestFile);
        
        WebElement elementToClick = driver.findElement(By.xpath("//span[@id='submit.add-to-cart-announce']/.."));
        
        Actions builder = new Actions(driver);
        
        builder.moveToElement(elementToClick).perform();
        
        elementToClick.click();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='attach-accessory-cart-subtotal']")));
        
        String subTotal = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
        
        System.out.println("subTotal :"+ subTotal);
        
        String replaceSubTotal = subTotal.split("\\.")[0];
        
        System.out.println("replaceSubTotal :"+ replaceSubTotal);
        
        String replaceString2 = replaceSubTotal.replaceAll("[^0-9]+","");
		
		System.out.println(replaceString2);
		
		int subTotalAmount = Integer.parseInt(replaceString2);
		
		if(initialAmount == subTotalAmount) {
			System.out.println("Initial Amount and Final Amount matching.");
		} else {
			System.out.println("Initial Amount and Final Amount not matching.");
		}
		
		driver.quit();
	}
}
