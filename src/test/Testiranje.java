package test;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import home.Adrese;
import home.Adrese2;
import home.Kredencijali;
import home.MenuElements;

public class Testiranje {

	WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\poi\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test (priority = 1)
	public void testLogin1() {
		driver.get(Adrese.URL);
		driver.manage().window().maximize();
		driver.findElement(By.xpath(Adrese.EXIT1_XPATH)).click();
		driver.findElement(By.xpath(Adrese.START1_XPATH)).click();
		driver.findElement(By.xpath(Adrese.NAME1_XPATH)).sendKeys(Kredencijali.NAME1);
		driver.findElement(By.xpath(Adrese.EMAIL1_XPATH)).sendKeys(Kredencijali.EMAIL1);
		driver.findElement(By.xpath(Adrese.START2_XPATH)).click();

		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		String expected = "https://www.humanity.com/wizard-setup2/";
		String actual = driver.getCurrentUrl();
		Assert.assertEquals(actual, expected);
	}
	
	@Test (priority = 2)
	public void testLogin2() {
		driver.get(Adrese.URL);
		//driver.manage().window().maximize();
		
		driver.findElement(By.xpath(Adrese2.FULLNAME_XPATH)).sendKeys(Kredencijali.NAME2);
		driver.findElement(By.xpath(Adrese2.EMAIL_XPATH)).sendKeys(Kredencijali.EMAIL2);
		driver.findElement(By.xpath(Adrese2.START_XPATH)).click();
		
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		String expected = "https://www.humanity.com/wizard-setup2/";
		String actual = driver.getCurrentUrl();
		Assert.assertEquals(actual, expected);
	}
	
	@Test (priority = 3)
	public void testAboutUs() throws Exception {
		driver.get(Adrese.URL);
		//driver.manage().window().maximize();
		//driver.findElement(By.xpath(Adrese.EXIT1_XPATH)).click();
		driver.findElement(By.xpath(Adrese2.ABOUTUS_XPATH)).click();
		driver.findElement(By.xpath(Adrese2.ABOUTUS2_XPATH)).click();
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(".\\Screenshot.png"));
		
		String actual = driver.getCurrentUrl();
		String expected = Adrese2.ABOUTUS_URL;
		Assert.assertEquals(actual, expected);
	}
	
	@Test (priority = 4)
	public void testLogin() {
		driver.get(Adrese.URL);
		//driver.manage().window().maximize();
		//driver.findElement(By.xpath(Adrese.EXIT1_XPATH)).click();
		driver.findElement(By.xpath(Adrese2.LOGIN_XPATH)).click();
		driver.findElement(By.xpath(Adrese2.LOGINEMAIL_XPATH)).sendKeys(Kredencijali.LOGINEMAIL);
		driver.findElement(By.xpath(Adrese2.LOGINPASS_XPATH)).sendKeys(Kredencijali.PASS);
		driver.findElement(By.xpath(Adrese2.LOGINBTN_XPATH)).click();
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		String actual = driver.getCurrentUrl();
		String expected = Adrese2.LOGIN_URL;
		Assert.assertEquals(actual, expected);
	}
	
	
}

