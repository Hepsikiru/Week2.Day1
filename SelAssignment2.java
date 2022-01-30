package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelAssignment2 {
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
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Find Contacts']")).click();
		driver.findElement(By.xpath("//span[@class='x-tab-strip-inner']/span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@id='ext-gen160']")).sendKeys("babu@testleaf.com");
		driver.findElement(By.xpath("//em/button[text()='Find Contacts']")).click();
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
