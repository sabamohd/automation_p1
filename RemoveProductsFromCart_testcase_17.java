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

public class RemoveProductsFromCart_testcase_17 {
	
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
	   //ADD PRODUCTS TO CART
		driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[1]/div[3]/div/div[1]/div[1]/a")).click();
		//click on cart
				//click cart buttton
						Wait<WebDriver> wait1 = new FluentWait<>(driver)
								.withTimeout(Duration.ofSeconds(10))
								.pollingEvery(Duration.ofMillis(500))
								.ignoring(NoSuchElementException.class);
						WebElement viewCartbutton = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[1]/div/div/div[2]/p[2]/a")));
						viewCartbutton.click();
						System.out.println(driver.getCurrentUrl());
						System.out.println(driver.getTitle());
						System.out.print("details of the product Amount,Quantity,Total prize::"+driver.findElement(By.xpath("/html/body/section/div/div[2]/table/tbody/tr")).getText());
						// click on X button
						driver.findElement(By.xpath("/html/body/section/div/div[2]/table/tbody/tr/td[6]/a")).click();
						System.out.println(driver.getCurrentUrl());
						System.out.println(driver.getTitle());
						System.out.println(driver.findElement(By.xpath("/html/body/section/div/div[2]/span/p")).getText());
						
						driver.quit();
	}
}
