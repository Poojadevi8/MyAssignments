package week4.homeass;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutomatingAlertInteractions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/"); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='s-suggestion-container'])[1]")).click();
		               
                List<WebElement> links= driver.findElements(By.xpath("//span[@class='a-price-whole']"));
                int value=links.size();
                System.out.println(value);
                Thread.sleep(2000);
                List<Integer> numbers=new ArrayList<Integer> ();
        		
        		for(WebElement data: links) 
        		{
        			String price = (data.getText());
        			
        		String	priceText = price.replaceAll("[^0-9]", "");   
        		
        		int mobileprice = Integer.parseInt(priceText);
        			numbers.add(mobileprice);
        			
        	  // System.out.println(mobileprice);

        			}
        		Collections.sort(numbers);
        		System.out.println(numbers);
        		System.out.println("Lowest price mobilephone is " +numbers.get(0));}}
               /* List<Integer> name=new ArrayList<Integer>();
                for (WebElement string : links) {
					String pic=(string.getText());
					  
					String	priceText = pic.replaceAll("[^0-9]", ""); 
					int mobileprice = Integer.parseInt(priceText);
						name.add(mobileprice);}
						Collections.sort(name);
						Integer first=name.get(0);
						System.out.println(first);
				}*/
            	
	
		
		




