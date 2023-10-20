package week5.marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tripozohotel {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.tripozo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("(//div[@class='ant-tabs-tab-btn'])[2]")).click();
		driver.findElement(By.xpath("//input[@id='CityData']")).sendKeys("Goa");
		driver.findElement(By.xpath("//span[text()='Goa']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='checkin_checkout']")).click();
		driver.findElement(By.xpath("//div[text()='19']/parent::td")).click();
		driver.findElement(By.xpath("//div[text()='20']/parent::td")).click();
		driver.findElement(By.xpath("(//button[@class='ant-btn ant-btn-default search-inputs tg-primary-btn f-hvcenter'])[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='ant-checkbox-input']")).click();
		driver.findElement(By.xpath("(//input[@class='ant-checkbox-input'])[7]")).click();
		driver.findElement(By.xpath("(//input[@class='ant-checkbox-input'])[10]")).click();
		driver.findElement(By.xpath("(//input[@class='ant-checkbox-input'])[11]")).click();
		driver.findElement(By.xpath("(//button[@class='ant-btn ant-btn-default ant-btn-block web-choose-btn btn-tpz'])")).click();
		String name=driver.findElement(By.xpath("//p[@class='pl-2']")).getText();
		System.out.println(name);
		String second = "19 Oct 2023";

	    //split the second string into words
	    List<String> words = Arrays.asList(name.split(" "));
	    List<String> wordsOfSecond = Arrays.asList(second.split(" "));

	    //split and compare each word of the first string           
	    for (String word : words) {
	        if(wordsOfSecond.contains(word))
	            System.out.print(word);
	    }
		driver.findElement(By.xpath("//button[@class='blocklink nowrap blnk-small blnkB fs12 pdl5 rnd5']")).click();
		driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-default']")).click();
		driver.findElement(By.xpath("(//span[@class='blocklink blnk-small blnkB rnd5 pdlr5 pointer'])[2]")).click();
		File source1=driver.getScreenshotAs(OutputType.FILE);
		File target1=new File("./snapshot/hotel.png");
		FileUtils.copyFile(source1, target1);
		 
}}
