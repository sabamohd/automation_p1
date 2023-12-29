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

import junit.framework.Assert;

public class PlaceOrder_ProceedWhile_Checkout_testcase_14 {
 
	@Test
	void AddProductsInCart() throws InterruptedException {
		String username ="saba";
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
		//click on products and add products to cart
		driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[2]/a")).click(); //clicked on products
		driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[5]/div/div[1]/div[1]/a")).click();//add product
		//click cart buttton
		Wait<WebDriver> wait1 = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofMillis(500))
				.ignoring(NoSuchElementException.class);
		WebElement viewCartbutton = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[1]/div/div/div[2]/p[2]/a")));
		viewCartbutton.click();
		//proceed to check out
		driver.findElement(By.xpath("/html/body/section/div/section/div[1]/div/div/a")).click();
		// Click 'Register / Login' button
		driver.findElement(By.xpath("/html/body/section/div/section/div[2]/div/div/div[2]/p[2]/a")).click();
		//Fill all details in Signup and create account
		driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[2]")).sendKeys("saba");// name field
		driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[3]")).sendKeys("mohdsaba@gmail.com"); //email field
		driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button")).click();// clicked signup
		//fill all details 
		driver.findElement(By.xpath("//*[@id=\"id_gender2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("12345667");
		driver.findElement(By.xpath("//*[@id=\"days\"]")).sendKeys("6");
		driver.findElement(By.xpath("//*[@id=\"months\"]")).sendKeys("November");
		driver.findElement(By.xpath("//*[@id=\"years\"]")).sendKeys("1993");
		driver.findElement(By.xpath("//*[@id=\"newsletter\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"optin\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("saba");
		driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("kausar");
		driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("abcdef");
		driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("colony,123,abcdef");
		driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("Hyd,India");
		driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("Telangana");
		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Hyd");
		driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys("2345667");
		driver.findElement(By.xpath("//*[@id=\"mobile_number\"]")).sendKeys("987654321");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println("Logged in as:"+username);
		//click on cart button 
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")).click();
		//proceed to checkout
		driver.findElement(By.xpath("//*[@id=\"do_action\"]/div[1]/div/div/a")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println("Address Details are visible");
		//write describe
		driver.findElement(By.xpath("//*[@id=\"ordermsg\"]/textarea")).sendKeys("good products");
		//click placd order
		driver.findElement(By.xpath("//*[@id=\"cart_items\"]/div/div[7]/a")).click();
		//payment details
		driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[1]/div/input")).sendKeys("saba"); // name on card
		driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[2]/div/input")).sendKeys("12345678654"); //card number
		driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[3]/div[1]/input")).sendKeys("311");
		driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[3]/div[2]/input")).sendKeys("12");
		driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[3]/div[2]/input")).sendKeys("2035");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		//delete account
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		
		
		
		
	}
}
