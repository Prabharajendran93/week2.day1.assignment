package week2.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("IT");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("PRABHA");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("RAJENDRAN");
		driver.findElement(By .id("createLeadForm_firstNameLocal")).sendKeys("PRABHA");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("EEE");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("ASSISTANT");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("prabha@gmail.com");
		
		WebElement Element = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select st = new Select(Element);
		st.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		
		Thread.sleep(5000);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("MECH");
		
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("PRABHI");

		driver.findElement(By.name("submitButton")).click();
		String titlenew = driver.getTitle();
		System.out.println(titlenew);
		
		
		
		
	}

}
