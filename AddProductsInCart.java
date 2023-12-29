package project_1_selenium;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AddProductsInCart {
	
	@Test
	void AddProductsInCart() throws InterruptedException {
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
			System.out.println("Successfully landed to Home Page");
		}
		else {
			System.out.println("Failed to Land on Home Page");
		};

    // 4. Click 'Products' button
    WebElement productsButton = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a"));
    productsButton.click();

    // 5. Hover over first product and click 'Add to cart'
   
    WebElement addToCartFirst = driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]/a"));
    addToCartFirst.click();

    // 6. Click 'Continue Shopping' button
    WebElement continueShoppingButton = driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button"));
    continueShoppingButton.click();

    // 7. Hover over second product and click 'Add to cart'
   
    WebElement addToCartSecond = driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[3]/div/div[1]/div[1]/a"));
    addToCartSecond.click();

    // 8. Click 'View Cart' button
    WebElement viewCartButton = driver.findElement(By.xpath("//a[text()='View Cart']"));
    viewCartButton.click();

    // 9. Verify both products are added to Cart
    WebElement productInCart1 = driver.findElement(By.xpath("//td[@class='product-name'][contains(text(),'Product 1')]"));
    WebElement productInCart2 = driver.findElement(By.xpath("//td[@class='product-name'][contains(text(),'Product 2')]"));
    assertEquals(productInCart1.isDisplayed() && productInCart2.isDisplayed(), true, "Products added to Cart");
    System.out.println(driver.findElement(By.xpath("//*[@id=\"product-1\"]")).getText());
    System.out.println(driver.findElement(By.xpath("//*[@id=\"product-2\"]")).getText());
    driver.quit();

}
}
