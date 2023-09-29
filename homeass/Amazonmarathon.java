package week2.workout;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonmarathon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/"); 
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for b");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='bags for boys']")).click();
		WebElement res=driver.findElement(By.xpath("//span[text()='1-48 of over 50,000 results for']"));
		String result=res.getText();
		System.out.println(result);
		Thread.sleep(2000);
		driver.findElement(By.linkText("Skybags")).click();
		System.out.println("skybags");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		WebElement name=driver.findElement(By.xpath("//span[text()='Unisex Printed School Backpack For Kids, Black (Ironman Marvel)']"));
		String ti=name.getText();
		System.out.println(ti);
		WebElement me=driver.findElement(By.xpath("//span[text()='1,699']/preceding-sibling::span"));
		String price=me.getText();
		System.out.println(price);
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
	}}








