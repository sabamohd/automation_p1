package project_1_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Verify_Subscription_In_HomePage_testcase_10 {
	
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
		scrollDownToFooter(driver);
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/div/div[2]/div/h2")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/div/div[2]/div/h2")));
		driver.findElement(By.xpath("//*[@id=\"susbscribe_email\"]")).sendKeys("sabakausar2@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"subscribe\"]")).click();
		Thread.sleep(2000);
		System.out.println("'You have been successfully subscribed!'");
		driver.quit();
		
		
		
		


}

	private void scrollDownToFooter(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
}
