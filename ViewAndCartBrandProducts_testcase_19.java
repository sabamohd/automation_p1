package project_1_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ViewAndCartBrandProducts_testcase_19 {
	

	@Test
	void AddProductsInCart() throws InterruptedException {
		String username = "saba";
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
        
		// Click on 'Products' button
		driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[2]/a")).click();
		
		//Verify that Brands are visible on left side bar
		System.out.println(driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[1]/div[1]/div[3]")).getText());
		
		//Click on any brand name
		driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[1]/div/div[3]/div/ul/li[1]/a")).click();
		
		//Verify that user is navigated to brand page and brand products are displayed
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/h2")).getText());
		System.out.println(driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div")).getText());
		
		//click on any other brand name
		driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[2]/div/ul/li[2]/a")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/h2")).getText());
		System.out.println(driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div")).getText());
		
		driver.quit();
		
}
}
