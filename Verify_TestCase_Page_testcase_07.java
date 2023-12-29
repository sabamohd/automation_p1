package project_1_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Verify_TestCase_Page_testcase_07 {
	
	@Test
	void testcasepage() throws InterruptedException {
		String url ="https://automationexercise.com/";
		WebDriver driver;
		
		driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"slider-carousel\"]/div/div[3]/div[1]/a[1]/button")).click();
		System.out.println("user is navigated to test cases page successfully");
		driver.quit();

}
}
