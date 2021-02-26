package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import home.Adrese;
import home.Adrese2;
import home.Kredencijali;

public class Test2dodatno {
	
	WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\poi\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void addEmployeeTest() throws InterruptedException {

		driver.get(Adrese.URL);
		driver.manage().window().maximize();
		driver.findElement(By.xpath(Adrese.EXIT1_XPATH)).click();
		driver.findElement(By.xpath(Adrese2.LOGIN_XPATH)).click();
		driver.findElement(By.xpath(Adrese2.LOGINEMAIL_XPATH)).sendKeys(Kredencijali.LOGINEMAIL);
		driver.findElement(By.xpath(Adrese2.LOGINPASS_XPATH)).sendKeys(Kredencijali.PASS);
		driver.findElement(By.xpath(Adrese2.LOGINBTN_XPATH)).click();
		driver.findElement(By.id("sn_staff")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("act_primary")).click();
		driver.findElement(By.id("_asf1")).sendKeys("Djole");
		driver.findElement(By.id("_asl1")).sendKeys("Djogani");
		driver.findElement(By.id("_ase1")).sendKeys(Kredencijali.EMAIL1);
		driver.findElement(By.id("_as_save_multiple")).click();
		Thread.sleep(500);
		  WebElement alert1 = driver.findElement(By.id("_status"));
		  Assert.assertTrue(alert1.isDisplayed());


	}
	
}
