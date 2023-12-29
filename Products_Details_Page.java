package project_1_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Products_Details_Page {
	
	@Test
	void productspage() throws InterruptedException {
		String url ="https://automationexercise.com/";
		WebDriver driver;
		
		driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();
		Thread.sleep(4000);
		System.out.println("user is navigated to ALL PRODUCTS page successfully");
		driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/ul/li/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div")).getTagName();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div")).getText();
		Thread.sleep(1000);
		driver.quit();
		

}
}
