package project_1_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Verify_Subscription_In_CartPage_testcase_11 {
	

	@Test
	void homepage() throws InterruptedException {
		String url ="https://automationexercise.com/";
		WebDriver driver;
		
		driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		System.out.println("Home Page is Visible Succesfully");
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a/i")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/div[1]/div[2]/div/h2")).getText());
		driver.findElement(By.xpath("//*[@id=\"susbscribe_email\"]")).sendKeys("sabakausar2@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"subscribe\"]")).click();
		
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			System.out.println("subscribed successfully");
			
			
		
		driver.quit();
		

}
}
