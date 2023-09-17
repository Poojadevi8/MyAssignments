package week2.homeass;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreatingSelectclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Pooja");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("devi");
		Select objSelect = new Select(driver.findElement(By.id("createLeadForm_dataSourceId")));
		objSelect.selectByIndex(3);
		Select objSelect1 = new Select(driver.findElement(By.id("createLeadForm_marketingCampaignId")));
		objSelect1.selectByVisibleText("Automobile");
		Select objSelect2= new Select(driver.findElement(By.id("createLeadForm_ownershipEnumId")));
		objSelect2.selectByValue("OWN_CCORP");
		driver.close();

	}

}
