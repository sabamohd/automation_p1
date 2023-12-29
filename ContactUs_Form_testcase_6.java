package project_1_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ContactUs_Form_testcase_6 {
	
	@Test
	void AddProductsInCart() throws InterruptedException {
		String username= "saba";
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
		 // 4. Click on 'Contact Us' button
        WebElement contactUsButton = driver.findElement(By.linkText("Contact Us"));
        contactUsButton.click();

        // 5. Verify 'GET IN TOUCH' is visible
        WebElement getInTouch = driver.findElement(By.xpath("//h2[text()='GET IN TOUCH']"));
        if (getInTouch.isDisplayed()) {
            System.out.println("'GET IN TOUCH' is visible");
        } else {
            System.out.println("'GET IN TOUCH' is not visible");
        }
		
		driver.findElement(By.xpath("//*[@id=\"contact-us-form\"]/div[1]/input")).sendKeys("saba");
		driver.findElement(By.xpath("//*[@id=\"contact-us-form\"]/div[2]/input")).sendKeys("sabakausar1@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"contact-us-form\"]/div[3]/input")).sendKeys("welcome to contact us");
		driver.findElement(By.xpath("//*[@id=\"message\"]")).sendKeys("Hi, how can we help you!");
		
		 // 7. Upload file (Replace 'path/to/file.txt' with the actual file path)
        WebElement fileInput = driver.findElement(By.name("file"));
        fileInput.sendKeys("\"C:\\Users\\hp\\OneDrive\\Desktop\\click_on_cart.docx\"");

        // 8. Click 'Submit' button
        WebElement submitButton = driver.findElement(By.xpath("//button[text()='Submit']"));
        submitButton.click();

        // 9. Click OK button (Assuming an alert is displayed)
        driver.switchTo().alert().accept();

        // 10. Verify success message
        WebElement successMessage = driver.findElement(By.xpath("//div[contains(@class, 'success-message')]"));
        if (successMessage.isDisplayed()) {
            System.out.println("Success! Your details have been submitted successfully.");
        } else {
            System.out.println("Submission was not successful.");
        }

        // 11. Click 'Home' button and verify that landed on the home page successfully
        WebElement homeButton = driver.findElement(By.linkText("Home"));
        homeButton.click();

        // Verify landing on the home page

		String expectedHomePageTitle1="Automation Exercise";
		String ActualHomePageTitle1= driver.getTitle();
		if(ActualHomePageTitle1.equals(expectedHomePageTitle)) {
			System.out.println("Successfully landed on Home Page");
		}
		else {
			System.out.println("Failed to Land on Home Page");
		};
       

        // Close the browser
        driver.quit();
		
	
}
}
