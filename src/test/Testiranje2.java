package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import home.Adrese;
import home.Adrese2;
import home.Kredencijali;
import home.MenuElements;

public class Testiranje2 {

	WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\poi\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test (priority = 1)
	public void testDashboard() {
		
		driver.get(Adrese.URL);
		driver.manage().window().maximize();
		driver.findElement(By.xpath(Adrese.EXIT1_XPATH)).click();
		driver.findElement(By.xpath(Adrese2.LOGIN_XPATH)).click();
		driver.findElement(By.xpath(Adrese2.LOGINEMAIL_XPATH)).sendKeys(Kredencijali.LOGINEMAIL);
		driver.findElement(By.xpath(Adrese2.LOGINPASS_XPATH)).sendKeys(Kredencijali.PASS);
		driver.findElement(By.xpath(Adrese2.LOGINBTN_XPATH)).click();
		driver.findElement(By.xpath(MenuElements.DASHBOARD_XPATH)).click();
		
		String actual = driver.getTitle();
		String expected = MenuElements.DASHBOARD_TITLE;
		Assert.assertEquals(actual, expected);
	}
	
	@Test (priority = 2)
	public void testPlanning() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(MenuElements.PLANNING_XPATH)).click();
		
		String actual = driver.getTitle();
		String expected = MenuElements.PLANNING_TITLE;
		Assert.assertEquals(actual, expected);
		
		
	}
	
	@Test (priority = 3)
	public void testClock() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(MenuElements.CLOCK_XPATH)).click();
		
		String actual = driver.getTitle();
		String expected = MenuElements.CLOCK_TITLE;
		Assert.assertEquals(actual, expected);
		
		
		
	}
	
	@Test (priority = 4)
	public void testLeave() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(MenuElements.LEAVE_XPATH)).click();
		
		String actual = driver.getTitle();
		String expected = MenuElements.LEAVE_TITLE;
		Assert.assertEquals(actual, expected);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test (priority = 5)
	public void testTraining() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(MenuElements.TRAINING_XPATH)).click();
		
		String actual = driver.getTitle();
		String expected = MenuElements.TRAINING_TITLE;
		Assert.assertEquals(actual, expected);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test (priority = 6)
	public void testStaff() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(MenuElements.STAFF_XPATH)).click();
		
		String actual = driver.getTitle();
		String expected = MenuElements.STAFF_TITLE;
		Assert.assertEquals(actual, expected);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test (priority = 7)
	public void testAvailability() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(MenuElements.AVAILABILITY_XPATH)).click();
		
		String actual = driver.getTitle();
		String expected = MenuElements.AVAILABILITY_TITLE;
		Assert.assertEquals(actual, expected);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	@Test (priority = 8)
	public void testPayroll() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(MenuElements.PAYROLL_XPATH)).click();
		
		String actual = driver.getTitle();
		String expected = MenuElements.PAYROLL_TITLE;
		Assert.assertEquals(actual, expected);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test (priority = 9)
	public void testReports() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(MenuElements.REPORTS_XPATH)).click();
		
		String actual = driver.getTitle();
		String expected = MenuElements.REPORTS_TITLE;
		Assert.assertEquals(actual, expected);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}
