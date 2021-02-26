package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import home.Adrese;
import home.Adrese2;
import home.Adrese4;
import home.Kredencijali;

public class Testiranje4 {

	WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\poi\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testLng() {
		driver.get(Adrese.URL);
		driver.manage().window().maximize();
		driver.findElement(By.xpath(Adrese.EXIT1_XPATH)).click();
		driver.findElement(By.xpath(Adrese2.LOGIN_XPATH)).click();
		driver.findElement(By.xpath(Adrese2.LOGINEMAIL_XPATH)).sendKeys(Kredencijali.LOGINEMAIL);
		driver.findElement(By.xpath(Adrese2.LOGINPASS_XPATH)).sendKeys(Kredencijali.PASS);
		driver.findElement(By.xpath(Adrese2.LOGINBTN_XPATH)).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(Adrese4.DOWNAROW_XPATH)).click();
		driver.findElement(By.xpath(Adrese4.PROFILE_XPATH)).click();
		driver.findElement(By.xpath(Adrese4.EDITDETAILS_XPATH)).click();
		
		WebElement adresa = driver.findElement(By.xpath(Adrese4.ADDRESS_XPATH));
		adresa.sendKeys(Adrese4.ADDRESS_STRING);
		WebElement zip = driver.findElement(By.xpath(Adrese4.ZIP_XPATH));
		zip.sendKeys(Adrese4.ZIP_STRING);
		
		driver.findElement(By.xpath(Adrese4.SAVE_XPATH)).click();
		driver.navigate().refresh();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//test ovde
		//String expected = " ";
		//String actual1 = adresa.getText();
		//System.out.println("printanje"+actual1);
		
		
		
		driver.findElement(By.xpath(Adrese4.ADDRESS_XPATH)).clear();
		driver.findElement(By.xpath(Adrese4.ZIP_XPATH)).clear();
		driver.findElement(By.xpath(Adrese4.SAVE_XPATH)).click();
		driver.navigate().refresh();
	}
	
}
