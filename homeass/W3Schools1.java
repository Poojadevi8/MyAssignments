package week6.homeass;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class W3Schools1 extends W3Schools2{

	
		// TODO Auto-generated method stub
		@BeforeTest
public void fromData() {
	filename="W3Schools";
}
		@Test(dataProvider="data")
		public void mid(String FullName,String Email,String Address,String city,String zip,String state,String cvv,String ccnum,String cname) {
			driver.findElement(By.id("fname")).sendKeys(FullName);
			driver.findElement(By.id("email")).sendKeys(Email);
			driver.findElement(By.id("adr")).sendKeys(Address);
			driver.findElement(By.id("city")).sendKeys(city);
			driver.findElement(By.id("zip")).sendKeys(zip);
			driver.findElement(By.id("state")).sendKeys(state);
			driver.findElement(By.id("expyear")).sendKeys("2018");
			driver.findElement(By.id("cvv")).sendKeys(cvv);
			driver.findElement(By.id("expmonth")).sendKeys("Oct");
			
			driver.findElement(By.id("ccnum")).sendKeys(ccnum);
			driver.findElement(By.id("cname")).sendKeys(cname);
		
		
			
	}}


