package project_1_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterUser_With__ExistingEmail_testcase_05 {
	
	@Test
	
	
	void RegisterUser() throws InterruptedException {
		try {
			String url ="https://automationexercise.com/";
			WebDriver driver;
			
			driver= new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")).sendKeys("Hamza");
			driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("sabakausar3@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
			Thread.sleep(3000);
			//System.out.println("'Email Address already exist!");
			driver.quit();
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		

}
}
