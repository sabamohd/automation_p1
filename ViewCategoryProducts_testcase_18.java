package project_1_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ViewCategoryProducts_testcase_18 {
	
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
			System.out.println("Successfully landed on Home Page");
		}
		else {
			System.out.println("Failed to Land on Home Page");
		};
		
		//Verify that categories are visible on left side bar
		System.out.println(driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[1]/div/h2")).getText());
	   
		//Click on any category link under 'Women' category, for example: Dress
				driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[1]/div/div[1]/div[1]/div[1]/h4/a")).click();
				driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[1]/div/div[1]/div[1]/div[2]/div/ul/li[1]/a")).click();

				//Verify that category page is displayed and confirm text 'WOMEN - Dress PRODUCTS'
				WebElement ConfirmText=driver.findElement(By.xpath("//h2[@class='title text-center']"));
				if(ConfirmText.getText().contains("WOMEN - DRESS PRODUCTS")) {
					System.out.println("Right product is displayed");
				}
				else {
					System.out.println("Products are not visible");
				}
				// On left side bar, click on any sub-category link of 'Men' category
				driver.findElement(By.xpath("//*[@id=\"accordian\"]/div[2]/div[1]/h4/a/span/i")).click();
				driver.findElement(By.xpath("//a[@href='/category_products/3']")).click();

				//Verify that user is navigated to that category page
				WebElement ConfirmText1=driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/h2"));
				if(ConfirmText1.isDisplayed()) {
					System.out.println("Right products related to Men's TShirts is displayed");
				}
				else {
					System.out.println("Products are not related to Men's TShirts displayed");
				}
				driver.quit();
	}
}

	
		

	



