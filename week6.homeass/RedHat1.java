package week6.homeass;



import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RedHat1 extends RedHat2 {
	//public ChromeDriver driver;
	
		@BeforeTest
		public void setData() {
			filename="RedHat";
		}
	
	@Test(dataProvider="passing")
	
	public void work(String username, String password, String fname, String lname, String email,String phone, String jobtitle,  String country,String Address,String code,String city,String state) {
		driver.findElement(By.xpath("//input[@id='username']")).click();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("firstName")).sendKeys(fname);
		driver.findElement(By.id("lastName")).sendKeys(lname);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("user.attributes.phoneNumber")).sendKeys(phone);
		driver.findElement(By.id("user.attributes.jobTitle")).sendKeys(jobtitle);
		
		driver.findElement(By.id("personal")).click();
		driver.findElement(By.id("user.attributes.country")).sendKeys(country);
		driver.findElement(By.id("user.attributes.addressLine1")).sendKeys(Address);
		driver.findElement(By.id("user.attributes.addressPostalCode")).sendKeys(code);
		driver.findElement(By.id("user.attributes.addressCityText")).sendKeys(city);
		driver.findElement(By.id("user.attributes.addressState")).sendKeys(state);
		
	}

}
