package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelAssignment1 {
	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
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
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("kiruthika");
		driver.findElement(By.id("lastNameField")).sendKeys("Hari");
		driver.findElement(By.xpath("//form[@id='createContactForm']/div/div/table/tbody/tr[20]/td/input")).click();
		System.out.println("First name is"+ driver.findElement(By.xpath("//span[@id='viewContact_firstName_sp']")).getText());
		System.out.println("Title of this page"+ driver.getTitle());		
		Thread.sleep(3000);		
		driver.close();
		}
	
	
	/*
	 * Official Website of Selenium: https://www.selenium.dev/ Dependency
	 * downloading source: Repository from which we can find the dependencies:
	 * https://mvnrepository.com/ Repository in which the package is stored:
	 * https://repo1.maven.org/maven2/ Where it is stored into my system? .m2 folder
	 * -> C:\Users\<Username>\.m2 Program to test URL:
	 * http://leaftaps.com/opentaps/control/main Username: Demosalesmanager
	 * Password: crmsfa 
	 * https://chromedriver.chromium.org/
	 */
}
