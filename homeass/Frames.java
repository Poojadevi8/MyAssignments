package week4.homeass;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://buythevalue.in/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//a[@class='product-title']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='wk_zipcode']")).sendKeys("636002");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='btn']")).click();
		//add item to the cart
	   driver.findElement(By.xpath("//button[@id='product-add-to-cart']")).click();
	   driver.findElement(By.xpath("//span[text()='View Cart']")).click();
		driver.findElement(By.xpath("//input[@id='checkout']")).click();
		Alert text=driver.switchTo().alert();
		text.accept();
	}
	
}
