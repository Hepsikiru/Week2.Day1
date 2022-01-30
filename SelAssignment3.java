package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelAssignment3 {
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver_win32/chromedriver.exe");
		//to setup the driver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		//to maximize the browser
		driver.manage().window().maximize();
		WebElement elementUsername=driver.findElement((By.id("username")));
		elementUsername.sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosys");

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kiru");

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Hari");

		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("12/20/1969");

		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("566");

		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9890994589");

		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("43");

		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("kiru");

		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kiru@gmail.com");

		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.infycompany.com");

		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("ANC");

		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("XYZ");

		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("XYZ ABC");

		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("TRY");

		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("LONDON");

		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("LONDON");

		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("123456");

		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("3211");

		driver.findElement(By.className("smallSubmit")).click();
		
		driver.close();

	}
				
		
	}


