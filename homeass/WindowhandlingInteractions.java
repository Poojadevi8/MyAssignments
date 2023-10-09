package week4.homeass;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowhandlingInteractions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[1]")).click();
		driver.findElement(By.xpath("(//a[@class='linktext'])[2]"));
		Set<String> pic=driver.getWindowHandles(); 
		List<String> names=new ArrayList<String>(pic);
		driver.switchTo().window(names.get(1));
		WebElement text = driver.findElement(By.xpath("(//a[@class='linktext'])[1]"));
		String value=text.getText();
		driver.switchTo().window(names.get(0));

		driver.findElement(By.xpath("(//input[@class='XdijitInputField dijitInputFieldValidationNormal'])[1]")).sendKeys(value);
				
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();	
		Set<String> pics=driver.getWindowHandles(); 
		List<String> mee=new ArrayList<String>(pics);
		driver.switchTo().window(mee.get(1));
				
		WebElement pi = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]"));	
		String tours=pi.getText();
		driver.switchTo().window(names.get(0));
		driver.findElement(By.xpath("(//input[@class='XdijitInputField dijitInputFieldValidationNormal'])[2]")).sendKeys(tours);
		driver.findElement(By.className("buttonDangerous")).click();
		Alert response = driver.switchTo().alert();
		response.accept();
		System.out.println(driver.getTitle());
	}

}
