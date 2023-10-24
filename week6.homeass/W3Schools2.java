package week6.homeass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class W3Schools2 {

			// TODO Auto-generated method stub
		public ChromeDriver driver;
		public String filename;
		@BeforeMethod
		public void first() {
			driver = new ChromeDriver();
		//driver.manage().window().maximize();
			driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_checkout_form");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			WebElement iframe = driver.findElement(By.id("iframeResult"));

			//Switch to the frame
			driver.switchTo().frame(iframe);
				

	}
		@AfterMethod
		public void Last() {
			driver.close();
			}
		
		@DataProvider(name="data")
		public String[][] w3School() throws IOException {
		return IntegrationExcelW3Schools.w3School(filename);
		}
		

}
