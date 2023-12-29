package project_1_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddReviewOnProduct_testcase_21 {
	
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
      
		//Click on 'View Product' button
		driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/ul/li/a")).click();
		
		//Verify 'Write Your Review' is visible
		WebElement ConfirmText2 = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[3]/div[1]/ul/li/a"));
		if(ConfirmText2.getText().contains("WRITE YOUR REVIEW")) {
			System.out.println("WRITE YOUR REVIEW page is displayed");
		}
		else {
			System.out.println("WRITE YOUR REVIEW page is not visible");
		}
		//FILL DETAILS
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[3]/div[2]/div/div/form/span/input[1]")).sendKeys("saba");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[3]/div[2]/div/div/form/span/input[2]")).sendKeys("saba@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[3]/div[2]/div/div/form/textarea")).sendKeys("GOOD");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[3]/div[2]/div/div/form/button")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement ConfirmText3 = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[3]/div[1]/ul/li/a"));
		if(ConfirmText3.getText().contains("Thank you for your review.")) {
			System.out.println("Thank you for your review page is displayed");
		}
		else {
			System.out.println("Thank you for your review page is not visible");
		}
		driver.quit();
		
}
}
