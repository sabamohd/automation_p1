package project_1_selenium;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class Add_Products_InCart_testcase_12 {
	
	//private static final String await = null;

	@Test
	void AddProductsInCart() throws InterruptedException {
		String url ="https://automationexercise.com/";
		WebDriver driver;
		
		driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		System.out.println("Home Page is Visible Succesfully");
	
	
		String expectedHomePageTitle="Automation Exercise";
		String ActualHomePageTitle= driver.getTitle();
		if(ActualHomePageTitle.equals(expectedHomePageTitle)) {
			System.out.println("Successfully landed to Home Page");
		}
		else {
			System.out.println("Failed to Land on Home Page");
		};
		//click on products button
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();
		
		//Hover over first product and click 'Add to cart'
		driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]/a")).click();
		
		//Click 'Continue Shopping' button
		Wait<WebDriver> wait = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(500))
				.ignoring(NoSuchElementException.class);
	
	WebElement continueShoppingButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[1]/div/div/div[3]/button")));
    continueShoppingButton.click();
    
		//Hover over second product and click 'Add to cart'
		driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[4]/div/div[1]/div[1]/a")).click();
		
		
		//click on "view button"
		Wait<WebDriver> wait1 = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(500))
				.ignoring(NoSuchElementException.class);
		WebElement viewCartbutton = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[1]/div/div/div[2]/p[2]/a/u")));
		viewCartbutton.click();
		
		Thread.sleep(3000);


		//Verify both products are added to Cart
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(" both products are added to Cart");
		//Verify their prices, quantity and total price
		System.out.println("The price of 1st product:"+driver.findElement(By.xpath("/html/body/section/div/div[2]/table/tbody/tr[1]/td[3]")).getText());
		System.out.println("The quantity of 1st product:"+driver.findElement(By.xpath("//*[@id=\"product-1\"]/td[4]")).getText());
		System.out.println("The total of 1st product:"+driver.findElement(By.xpath("/html/body/section/div/div[2]/table/tbody/tr[1]/td[5]")).getText());
		System.out.println("The price of 2nd product:"+driver.findElement(By.xpath("/html/body/section/div/div[2]/table/tbody/tr[2]/td[3]")).getText());
		System.out.println("The quantity of 2nd product:"+driver.findElement(By.xpath("/html/body/section/div/div[2]/table/tbody/tr[2]/td[4]")).getText());
		System.out.println("The total of 2nd product:"+driver.findElement(By.xpath("/html/body/section/div/div[2]/table/tbody/tr[2]/td[5]/p")).getText());
		driver.quit();
		
		

}
}
