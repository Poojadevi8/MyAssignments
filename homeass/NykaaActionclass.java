package week4.homeass;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NykaaActionclass {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement scroll = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions scr=new Actions(driver);
		scr.moveToElement(scroll).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='brandSearchBox']")).sendKeys("L'Oréal Paris");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='css-150nd8c']//a[1]")).click();
		String name=driver.findElement(By.xpath("//div[@class='css-xrzmfa'][1]")).getText();
		//System.out.println(name);
		String text=name;
		
		String s = "L'Oréal Paris";
		String[] s1=s.split(" ");
		String[] see2=text.split(" ");
			
		     //int i=0;
		for (int i = 0; i < see2.length-1; i++) {
			
		
					if(see2[0].equals(s1[0])) {
						String s2=see2[0].toString();
						
					System.out.println("The word is: "+see2[0]);
									
					}}
		
		driver.findElement(By.xpath("//span[text()='Sort By : popularity']")).click();
		driver.findElement(By.xpath("(//div[@class='control-indicator radio '])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
		driver.findElement(By.xpath("(//div[@class='control-indicator checkbox '])[1]")).click();
		
		
	driver.findElement(By.xpath("//span[text()='Concern']")).click();
	WebElement care=driver.findElement(By.xpath("//span[text()='Colour Protection']"));
	Actions color=new Actions(driver);
	color.scrollToElement(care).perform();
	driver.findElement(By.xpath("(//div[@class='control-indicator checkbox '])[11]")).click();
	
	String listed=driver.findElement(By.xpath("//span[@class='filter-value']")).getText();
	String so="Shampoo";
	if(so.equals(listed)) {
		System.out.println("correct");}
	else {
		System.out.println("not correct");
		}
			
	driver.findElement(By.xpath("//img[@class='css-11gn9r6']")).click();
	Set<String> pic=driver.getWindowHandles(); 
	List<String> names=new ArrayList<String>(pic);
	driver.switchTo().window(names.get(1));
	driver.findElement(By.xpath("//button[@class=' css-1r0ze8m']")).click();
	String q=driver.findElement(By.xpath("//span[@class='css-1jczs19']")).getText();
	System.out.println("MRP is:"+ q);
	
	driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
	driver.findElement(By.xpath("//button[@class='css-aesrxy']")).click();
	WebElement t=driver.findElement(By.xpath("//span[@class='css-1um1mkq e171rb9k3']"));
	Actions colors=new Actions(driver);
	colors.moveToElement(t).perform();
	String w=t.getText();
	System.out.println("Grand total:" +w);
	WebElement r=driver.findElement(By.xpath("//div[@class='css-ltzjhp e25lf6d8']"));
	Actions col=new Actions(driver);
	col.moveToElement(r).perform();
	driver.findElement(By.xpath("(//button[@class='css-1h4559r e8tshxd0'])[2]")).click();
	driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
	String e=driver.findElement(By.xpath("//p[@class='css-1e59vjt eka6zu20']")).getText();
	if(q.equals(e)) {
		System.out.println("correct");
	}
	else {
		System.out.println("not correct");
	}
	driver.quit();
	}}

 