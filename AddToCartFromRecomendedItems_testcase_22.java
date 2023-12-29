package project_1_selenium;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class AddToCartFromRecomendedItems_testcase_22 {
	
	@Test
	void AddProductsInCart() throws InterruptedException {
		String username= "saba";
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
			System.out.println("Successfully landed on Home Page");
		}
		else {
			System.out.println("Failed to Land on Home Page");
		};
       
		  // 3. Scroll to the bottom of the page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(2, document.body.scrollHeight)");
        
        // 4. Verify 'RECOMMENDED ITEMS' are visible
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        WebElement recommendedItems = driver.findElement(By.id("recommended-items"));
        if (recommendedItems.isDisplayed()) {
            System.out.println("RECOMMENDED ITEMS are visible");
        } else {
            System.out.println("RECOMMENDED ITEMS are not visible");
        }
        
        //CLICK ON ADD TO CART FROM RECOMMENDED PRODUCTS
        driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[2]/div/div/div[1]/div[2]/div/div/div/a")).click();
        
        //CLICK ON VIEW CART
        Wait<WebDriver> wait1 = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(500))
				.ignoring(NoSuchElementException.class);
		WebElement viewCartbutton = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[1]/div/div/div[2]/p[2]/a")));
		viewCartbutton.click();

		
		//Verify both products are added to Cart
				System.out.println(driver.getCurrentUrl());
				System.out.println(driver.getTitle());
				System.out.println("Products Details are added to Cart");
				System.out.println("The product is displayed in cart page and details are below:");
				System.out.println(driver.findElement(By.xpath("/html/body/section/div/div[2]/table/tbody/tr")).getText());
}
}
