package week3.Homeass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioImplementingList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/"); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("bags");
		driver.findElement(By.xpath("//input[@value='bags']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
		
		List<WebElement> Name = driver.findElements(By.xpath("//div[@class='brand']"));
		int total=Name.size();
		System.out.println(total);
		
		for (int i = 0; i < total; i++) {
			System.out.println(Name.get(i).getText());
			
		}
		List<WebElement> Newname = driver.findElements(By.xpath("//div[@class='nameCls']"));
		for (int i = 0; i < total; i++) {
			System.out.println(Newname.get(i).getText());
			
		}
		
			}

}
