package project_1_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterUser_testcase_01 {
	@Test
	void homepage() throws InterruptedException {
		String url ="https://automationexercise.com/";
		WebDriver driver;
		
		driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")).sendKeys("Saba");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("sabakausar2@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"id_gender2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("12345667");
		driver.findElement(By.xpath("//*[@id=\"days\"]")).sendKeys("6");
		driver.findElement(By.xpath("//*[@id=\"months\"]")).sendKeys("November");
		driver.findElement(By.xpath("//*[@id=\"years\"]")).sendKeys("1993");
		driver.findElement(By.xpath("//*[@id=\"newsletter\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"optin\"]")).click();
		//Thread.sleep(2000);
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
		//// Locate the element that triggers the pop-up
       // WebElement popupTrigger = driver.findElement(By.id("popup-trigger"));

        // Click on the element to trigger the pop-up
        //popupTrigger.click();

        // Switch to the alert
       // Alert alert = driver.switchTo().alert();
		 // Accept the alert (click OK)
        //alert.accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();
		Thread.sleep(3000);
		driver.quit();
		
		


		}
	}


