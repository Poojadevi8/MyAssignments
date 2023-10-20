package week5.marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tripozoflight {
	public static void main(String[] args) throws IOException, InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.tripozo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("(//div[@class='ant-tabs-tab-btn'])[1]")).click();
		driver.findElement(By.xpath("(//input[@id='search-form_origin'])[1]")).sendKeys("MAA");
		driver.findElement(By.xpath("//div[@class='rc-virtual-list']")).click();
		driver.findElement(By.xpath("(//input[@id='search-form_destination'])[1]")).sendKeys("GOX");
		driver.findElement(By.xpath("//div[@class='ant-select-item ant-select-item-option ant-select-item-option-active']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='calBtn'])[1]")).click();
		driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-default search-inputs tg-primary-btn f-hvcenter']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='ant-checkbox'])[3]")).click();
		driver.findElement(By.xpath("(//div[@class='f-hvcenter flexCol'])[2]")).click();
		driver.findElement(By.xpath("(//span[@class='ant-checkbox'])[4]")).click();
		String title1=driver.findElement(By.xpath("//span[text()='Refundable']")).getText();
	    		
		String refund="Air India";
		
		String title2=driver.findElement(By.xpath("(//span[text()='Air India'])[1]")).getText();
		
		if(refund.equals(title2)) {
			System.out.println("matched");
		}else {
			System.out.println("not matched");
			
		}
		driver.findElement(By.xpath("//button[@class='choose-button tpz-btn nowrap']")).click();
String s="Refundable";
		
		System.out.println(title1);
		if(s.equals(title1)) {
			System.out.println("matched");
		}else {
			System.out.println("not matched");
			
		}
		driver.findElement(By.xpath("//span[@class='blocklink blnk-small blnkB pdlr5 fs13 rnd5 pointer']")).click();
		File source1=driver.getScreenshotAs(OutputType.FILE);
		File target1=new File("./snapshot/flight1.png");
		FileUtils.copyFile(source1, target1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='ant-modal-close-x']")).click();
		driver.findElement(By.xpath("//span[text()='Fare Info']")).click();
		File source2=driver.getScreenshotAs(OutputType.FILE);
		File target2=new File("./snapshot/flight2.png");
		FileUtils.copyFile(source2, target2);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='ant-modal-close-x']")).click();
		
		
	}
	
}
