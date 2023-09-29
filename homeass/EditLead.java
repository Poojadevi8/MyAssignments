package week2.homeass;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Pooja");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("devi");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("pooja");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("CS");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("This is my account");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("pooja@gmail.com");
		driver.findElement(By.xpath("//option[text()='New York']")).click();
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		driver.findElement(By.xpath("//a[@class='subMenuButton']")).click();
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).clear();
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_importantNote']")).sendKeys("This is my account");
		driver.findElement(By.xpath("//input[@class='smallSubmit']/parent::td")).click();
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
	}

}


