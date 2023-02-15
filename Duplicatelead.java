package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Duplicatelead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Companydemo");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jothi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Jo");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Anantha Jothi");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("ECE");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("description test");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test@gmail.com");
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	    Select dd = new Select(state);
	    dd.selectByVisibleText("Alabama");
	    driver.findElement(By.className("smallSubmit")).click();
	   String title =  driver.getTitle();
	   System.out.println(title);
       driver.findElement(By.linkText("Duplicate Lead")).click();
       driver.findElement(By.id("createLeadForm_companyName")).clear();
       driver.findElement(By.id("createLeadForm_companyName")).sendKeys("updated company name");
       driver.findElement(By.id("createLeadForm_firstName")).clear();
       driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jothiupdated");
       driver.findElement(By.linkText("Create Lead")).click();
       String title2 = driver.getTitle();
       System.out.println(title2);
	}
	

}
