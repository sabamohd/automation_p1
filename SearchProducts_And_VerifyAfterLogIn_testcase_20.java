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

public class SearchProducts_And_VerifyAfterLogIn_testcase_20 {
	
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
		//click on products
		driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[2]/a")).click();
		
		//Verify user is navigated to ALL PRODUCTS page successfully
		WebElement ConfirmText=driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/h2"));
		if(ConfirmText.getText().contains("ALL PRODUCTS")) {
			System.out.println("ALL PRODUCTS page is displayed");
		}
		else {
			System.out.println("ALL PRODUCTS page are not visible");
		}
	   //Enter product name in search input and click search button
		driver.findElement(By.xpath("/html/body/section[1]/div/input")).sendKeys("Men Tshirt");
		driver.findElement(By.xpath("/html/body/section[1]/div/button")).click();
		
		//Verify 'SEARCHED PRODUCTS' is visible
		WebElement ConfirmText1=driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/h2"));
		if(ConfirmText1.getText().contains("SEARCHED PRODUCTS")) {
			System.out.println("ALL SEARCHED PRODUCTS page is displayed");
		}
		else {
			System.out.println("ALL SEARCHED PRODUCTS page is not visible");
		}
		//Verify all the products related to search are visible
		WebElement ConfirmText2=driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]/p"));
		if(ConfirmText2.getText().contains("Men Tshirt")) {
			System.out.println("Men Tshirt related product is displayed");
		}
		else {
			System.out.println("Men Tshirt related page is not visible");
		}
         
		//Add those products to cart
		driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]/a")).click();
		
		// Click 'Cart' button and verify that products are visible in cart
				Wait<WebDriver> wait1 = new FluentWait<>(driver)
						.withTimeout(Duration.ofSeconds(10))
						.pollingEvery(Duration.ofMillis(500))
						.ignoring(NoSuchElementException.class);
				WebElement viewCartbutton = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[1]/div/div/div[2]/p[2]/a")));
				viewCartbutton.click();
				System.out.println(driver.getCurrentUrl());
				System.out.println(driver.getTitle());
				System.out.println(driver.findElement(By.xpath("/html/body/section/div/div[2]/table/tbody/tr")).getText());
				
				//Click 'Signup / Login' button and submit login details
			  driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a")).click();
			  driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/input[2]")).sendKeys("saba@gmail.com");
			  driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/input[3]")).sendKeys("saba123456");
			  driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/button")).click();
			  System.out.println("Logged in as:"+username);
			  
			//Again, go to Cart page
				driver.findElement(By.xpath("//a[@href='/view_cart']//parent::li")).click();
				System.out.println(driver.getCurrentUrl());
				System.out.println(driver.getTitle());
				
				WebElement confirmtext3= driver.findElement(By.xpath("/html/body/section/div/div[2]/table/tbody/tr"));
				if(confirmtext3.getText().contains("Men Tshirt")) {
					System.out.println("products are visible in cart after login as well");
				}
				else {
					System.out.println("products are not visible in cart after login as well");
				}
			  driver.quit();
				
}
}
