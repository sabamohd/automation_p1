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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Verify_ProductQuantity_INCart_Testcase_13 {

	

	@Test
	public void productPage() throws InterruptedException {
		String url ="https://automationexercise.com/";
		WebDriver driver;
		
		driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		System.out.println("Home Page is Visible Succesfully");

		// Click 'View Product' for any product on home page
		driver.findElement(By.xpath("//a[@href='/product_details/3']")).click();
		
		// Verify user is landed to product detail page
		 Wait<WebDriver> wait = new FluentWait<>(driver)
					.withTimeout(Duration.ofSeconds(10))
					.pollingEvery(Duration.ofMillis(500))
					.ignoring(NoSuchElementException.class);
		 
		WebElement productdetails = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='product-information']")));
		if (productdetails.isDisplayed()) {
			System.out.println("Landed to product detail page");
		} else {
			System.out.println("Not landed to product detail page");
		}
		
		// Verify product details are visible: product name, category, price, availability, condition, brand
		WebElement quantity = driver.findElement(By.xpath("//*[@type='number']"));
		quantity.clear();
		quantity.sendKeys("4");
		
		
		WebElement AddToCart = driver.findElement(By.xpath("//button[@type='button']"));
		AddToCart.click();
		
		
		WebElement viewCartbutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div/div[2]/p[2]/a/u")));
		viewCartbutton.click();
		
		Thread.sleep(3000);
		
		// Verify that product is displayed in the cart page with exact quantity
        WebElement productInCart = driver.findElement(By.xpath("/html/body/section/div/div[2]/table/tbody/tr/td[2]"));
        WebElement quantityInCart = productInCart.findElement(By.xpath("//*[@id=\"product-3\"]/td[4]/button"));

        // Get the text of the quantity displayed in the cart
        String quantityTextInCart = quantityInCart.getText();

        // Verify the quantity in the cart is '4'
        if (quantityTextInCart.equals("4")) {
            System.out.println("Product is displayed in cart page with the exact quantity (4)");
        } else {
            System.out.println("Product is not displayed in cart page with the exact quantity");
        }
		
        driver.quit();

	}

	
		

	}


