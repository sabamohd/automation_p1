package project_1_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchProduct_testcase_09 {
	
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
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();
		System.out.println(driver.getTitle());
		System.out.println("Products Page is Visible Succesfully");
		driver.findElement(By.xpath("//*[@id=\"search_product\"]")).sendKeys("Blue Top");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"submit_search\"]")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/h2")).getText());
		System.out.println(driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div")).getText());
		
		System.out.println(" All the products related to search are visible");
		Thread.sleep(2000);
		driver.quit();
		
		
		
		

}
}
