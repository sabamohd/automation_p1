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

public class PlaceOrder_LoginBeforeCheckout_testcase_16 {
	
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
		
		//click on signup/login
		driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a")).click();
		
		//Fill email, password and click 'Login' button
		driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/input[2]")).sendKeys("sabahamza@gmail.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/input[3]")).sendKeys("9876543210");
		driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/button")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println("Logged in as:"+username);
		//add products to cart
		driver.findElement(By.xpath("/html/body/section[2]/div[1]/div[1]/div[2]/div[1]/div[10]/div/div[1]/div[1]/a")).click();
		
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
				
		//proceed to checkout
		driver.findElement(By.xpath("/html/body/section/div/section/div[1]/div/div/a")).click();
		
		//Verify Address Details and Review Your Order
		System.out.println(driver.findElement(By.xpath("/html/body/section/div/div[3]/div/div[1]/ul")).getText());
		System.out.println(driver.findElement(By.xpath("/html/body/section/div/div[5]")).getText());
		
		// Enter description in comment text area and click 'Place Order'
		driver.findElement(By.xpath("/html/body/section/div/div[6]/textarea")).sendKeys("Good Product");
		driver.findElement(By.xpath("/html/body/section/div/div[7]/a")).click();
		
		//Enter payment details: Name on Card, Card Number, CVC, Expiration date
		driver.findElement(By.xpath("/html/body/section/div/div[3]/div/div[2]/form/div[1]/div/input")).sendKeys("saba");
		driver.findElement(By.xpath("/html/body/section/div/div[3]/div/div[2]/form/div[2]/div/input")).sendKeys("37647464857");
		driver.findElement(By.xpath("/html/body/section/div/div[3]/div/div[2]/form/div[3]/div[1]/input")).sendKeys("521");
		driver.findElement(By.xpath("/html/body/section/div/div[3]/div/div[2]/form/div[3]/div[2]/input")).sendKeys("03");
		driver.findElement(By.xpath("/html/body/section/div/div[3]/div/div[2]/form/div[3]/div[3]/input")).sendKeys("2045");
		
		//pay and confirm 
		driver.findElement(By.xpath("/html/body/section/div/div[3]/div/div[2]/form/div[5]/div/button")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/p")).getText());
		
		//delete account
		driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[5]/a")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.xpath("/html/body/section/div/div/div")).getText());
		
		driver.quit();
		
		
		
		
		
		
				

}
}
