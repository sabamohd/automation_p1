package project_1_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginWith__IncorrectUserEmail_Password_testcase_03 {
		
		@Test
		void incorrectlogin() throws InterruptedException {
			String url ="https://automationexercise.com/";
			WebDriver driver;
			
			driver= new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")).sendKeys("!@#$%");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")).sendKeys("!");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
			Thread.sleep(2000);
			System.out.println("The password you ave entered is Incorrect");
			driver.quit();

}
}
