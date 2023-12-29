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
import org.testng.annotations.Test;

public class VerifyAllProducts_AllDetailPage_testcase_08 {
	
	@Test
	void homepage() throws InterruptedException {
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
		}

		//Verify user is navigated to ALL PRODUCTS page successfully
		driver.findElement(By.xpath("//a[@href='/products']")).click();
		String expectedproductTitle= "Automation Exercise - All Products";
		String ActualproductTitle=driver.getTitle();

		if(ActualproductTitle.equals(expectedproductTitle)) {
			System.out.println("Navigated to all Products page successfully.");
		}
		else {
			System.out.println("Failed to Navigate to all Products page.");
		}

		//WebElement productl=driver.findElement(By.xpath("//*[@class='features_items']"));

		// The products list is visible
		Wait<WebDriver> wait = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(500))
				.ignoring(NoSuchElementException.class);
		WebElement ProductList=wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("features_items")));
		if (ProductList.isDisplayed()) {
			System.out.println("Products list is visible");
		} else {
			System.out.println("Products list is not visible");
		}

		//Click on 'View Product' of first product
		WebElement viewProductLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@href='/product_details/1']")));
		viewProductLink.click();

		//        // Verify user is landed to product detail page

		WebElement productdetails = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='product-information']")));
		if (productdetails.isDisplayed()) {
			System.out.println("Landed to product detail page");
		} else {
			System.out.println("Not landed to product detail page");
		}
		// Verify product details are visible: product name, category, price, availability, condition, brand
		WebElement productCategory = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[1]"));
		WebElement productPrice = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/span"));
		WebElement productAvailability = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[2]/b"));
		WebElement productCondition = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[3]/b"));
		WebElement productBrand = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[4]/b"));
		Thread.sleep(3000);
		if (productdetails.isDisplayed() && productCategory.isDisplayed() && productPrice.isDisplayed() &&
				productAvailability.isDisplayed() && productCondition.isDisplayed() && productBrand.isDisplayed()) {
			System.out.println("Product details are visible");
		} else {
			System.out.println("Product details are not visible");
			
			driver.quit();
		}


	}

	
		

	}


