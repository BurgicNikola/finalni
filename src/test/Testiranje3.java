package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import home.Adrese;
import home.Adrese2;
import home.Adrese3;
import home.Kredencijali;

public class Testiranje3 {

	WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\poi\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test (priority = 1)
	public void testLng() {
		driver.get(Adrese.URL);
		driver.manage().window().maximize();
		driver.findElement(By.xpath(Adrese.EXIT1_XPATH)).click();
		driver.findElement(By.xpath(Adrese2.LOGIN_XPATH)).click();
		driver.findElement(By.xpath(Adrese2.LOGINEMAIL_XPATH)).sendKeys(Kredencijali.LOGINEMAIL);
		driver.findElement(By.xpath(Adrese2.LOGINPASS_XPATH)).sendKeys(Kredencijali.PASS);
		driver.findElement(By.xpath(Adrese2.LOGINBTN_XPATH)).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(Adrese3.SETTINGS_XPATH)).click();
		
		WebElement lng = driver.findElement(By.xpath(Adrese3.LNG_XPATH));
		lng.click();
		lng.sendKeys(Keys.ARROW_DOWN);
		lng.sendKeys(Keys.ARROW_DOWN);
		lng.sendKeys(Keys.ARROW_DOWN);
		lng.sendKeys(Keys.ARROW_DOWN);
		lng.sendKeys(Keys.ARROW_DOWN);
		lng.sendKeys(Keys.ARROW_DOWN);
		lng.sendKeys(Keys.ARROW_DOWN);
		
		/*for(int i = 1; i < 8; i++) {
			lng.sendKeys(Keys.ARROW_DOWN);
			i++;
			//driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		}*/
		lng.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(Adrese3.SAVE_XPATH)).click();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//OVDE IDE TEST
		String actual = driver.findElement(By.xpath(Adrese3.LEAVE_XPATH)).getText();
		String expected = "Odmor";
		Assert.assertEquals(actual, expected);
		System.out.println("Vrednost a1 = " + actual);

		
		driver.findElement(By.xpath("//*[@id=\"_fbody\"]")).sendKeys(Keys.PAGE_UP);
		driver.findElement(By.xpath("//*[@id=\"_fbody\"]")).sendKeys(Keys.PAGE_UP);
		
		WebElement lng2 = driver.findElement(By.xpath(Adrese3.LNG2_XPATH));
		lng2.click();
		lng2.sendKeys(Keys.ARROW_UP);
		lng2.sendKeys(Keys.ARROW_UP);
		lng2.sendKeys(Keys.ARROW_UP);
		lng2.sendKeys(Keys.ARROW_UP);
		lng2.sendKeys(Keys.ARROW_UP);
		lng2.sendKeys(Keys.ARROW_UP);
		lng2.sendKeys(Keys.ARROW_UP);
		lng2.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(Adrese3.SAVE_XPATH)).click();
		driver.navigate().refresh();
			
	}
	
	@Test (priority = 2)
	public void testDisableNotifications() {
		
		driver.findElement(By.xpath(Adrese3.EMAILNOTIF_XPATH)).click();
		driver.findElement(By.xpath(Adrese3.SMSNOTIF_XPATH)).click();
		driver.findElement(By.xpath(Adrese3.MOBILE_XPATH)).click();
		driver.findElement(By.xpath(Adrese3.SAVE_XPATH)).click();
		driver.navigate().refresh();
		//TEST OVDE
		WebElement checkbox = driver.findElement(By.id("pref_pref_email"));
		boolean actual = checkbox.isSelected();
		//System.out.println("The checkbox is selection state is - " + checkbox.isSelected());
		Assert.assertEquals(actual, true);
		WebElement checkbox1 = driver.findElement(By.id("pref_pref_sms"));
		boolean actual1 = checkbox1.isSelected();
		//System.out.println("The checkbox is selection state is - " + checkbox.isSelected());
		Assert.assertEquals(actual1, true);
		WebElement checkbox2 = driver.findElement(By.id("pref_pref_mobile_push"));
		boolean actual2 = checkbox2.isSelected();
		//System.out.println("The checkbox is selection state is - " + checkbox.isSelected());
		Assert.assertEquals(actual2, true);
		
		driver.findElement(By.xpath(Adrese3.EMAILNOTIF_XPATH)).click();
		driver.findElement(By.xpath(Adrese3.SMSNOTIF_XPATH)).click();
		driver.findElement(By.xpath(Adrese3.MOBILE_XPATH)).click();
		driver.findElement(By.xpath("//*[@id=\"_fbody\"]")).sendKeys(Keys.PAGE_DOWN);
		driver.findElement(By.xpath(Adrese3.SAVE_XPATH)).click();
		driver.navigate().refresh();
		
	}
	
	
}
