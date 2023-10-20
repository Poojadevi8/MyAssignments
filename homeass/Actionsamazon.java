package week4.homeass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsamazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro");
		driver.findElement(By.xpath("(//div[text()='oneplus 9 pro'])[1]")).click();
		String name=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println(name);
		Thread.sleep(2000);
		WebElement star=driver.findElement(By.xpath("//span[contains(text(),'5 stars')]"));
		Actions rate=new Actions(driver);
		rate.moveToElement(star).perform();
				//System.out.println(star.getText());
		WebElement value=driver.findElement(By.xpath("//span[contains(text(),'5 stars')]"));
		System.out.println(value.getText());
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		Set<String> pic=driver.getWindowHandles(); 
		List<String> names=new ArrayList<String>(pic);
		driver.switchTo().window(names.get(1));
		File source=driver.getScreenshotAs(OutputType.FILE);
		File target=new File("./snap/table/png");
		FileUtils.copyFile(source, target);
		
	}

}

		