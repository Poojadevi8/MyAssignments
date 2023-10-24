package week6.homeass;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class RedHat2 {
	public ChromeDriver driver;
	public String filename;
	@BeforeMethod
	public void firstCondition() {
		driver = new ChromeDriver();
	//driver.manage().window().maximize();
		driver.get("https://sso.redhat.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
			driver.findElement(By.xpath("//button[@id='rh-registration-link']")).click();
			WebElement register=driver.findElement(By.xpath("//h1[@class='pf-c-title pf-m-3xl']"));
			String name=register.getText();
			String s="Register for a Red Hat account";
			if(s.equalsIgnoreCase(name)) {
				System.out.println("It's registration");
			}else {
					System.out.println("not registration");
				}
}

@AfterMethod
public void lastCondition() {
	driver.close();
}
@DataProvider(name="passing")
public String[][] sendData() throws IOException{
	return ExcelRed.Redexcel(filename);
	}}