package week2.workout;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BusMarathon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.abhibus.com/"); 
		driver.findElement(By.id("bus-link")).click();
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
	 Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
				driver.findElement(By.xpath("//a[text()='Today']")).click();
				 Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='22 Fri']")).click();
		WebElement b=driver.findElement(By.xpath("//h5[text()='Yolo Bus']"));
		String Bus=b.getText();
		System.out.println(Bus);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
		WebElement s=driver.findElement(By.xpath("//div[@class='text-grey']/small"));
		String Seat=s.getText();
		System.out.println("Seats are" + Seat);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Show Seats']")).click();
		driver.findElement(By.xpath("//span[text()='DU6']")).click();
		driver.findElement(By.xpath("//p[text()='Sirsuri']")).click();
		driver.findElement(By.xpath("//p[text()='Attibele Toll Gate']")).click();
		WebElement select=driver.findElement(By.xpath("//div[@id='seating-selected-seat-details']/span"));
		String selected=select.getText();
		System.out.println(selected);
		Thread.sleep(2000);
		WebElement fare=driver.findElement(By.xpath("//span[text()='Base Fare :']"));
		String busfare=fare.getText();
		System.out.println(busfare);
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
				driver.close();
	}
}

