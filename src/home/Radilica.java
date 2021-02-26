package home;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Radilica {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\poi\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(Adrese.URL);
		driver.manage().window().maximize();
		/*
		 * try { Thread.sleep(1500); } catch (InterruptedException e) {
		 * e.printStackTrace(); }
		 */
		driver.findElement(By.xpath(Adrese.EXIT1_XPATH)).click();

		driver.findElement(By.xpath(Adrese.START1_XPATH)).click();
		driver.findElement(By.xpath(Adrese.NAME1_XPATH)).sendKeys("Pjer Zhon");
		driver.findElement(By.xpath(Adrese.EMAIL1_XPATH)).sendKeys("pjer06@pjer.com");
		driver.findElement(By.xpath(Adrese.START2_XPATH)).click();
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}


		WebElement role = driver.findElement(By.xpath(Adrese.FUNCTIONALROLE_XPATH));
		role.click();
		role.sendKeys(Keys.ARROW_DOWN);
		role.sendKeys(Keys.ARROW_DOWN);
		role.sendKeys(Keys.ARROW_DOWN);
		role.sendKeys(Keys.ARROW_DOWN);
		role.sendKeys(Keys.ARROW_DOWN);
		role.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath(Adrese.PHONENUMBER_XPATH)).sendKeys("555555");
		driver.findElement(By.xpath(Adrese.PASSWORD_XPATH)).sendKeys("sifrabrate");
		driver.findElement(By.xpath(Adrese.REPEAT_XPATH)).sendKeys("sifrabrate");
		driver.findElement(By.xpath(Adrese.STARTSCHEDULING_XPATH)).click();
		

	}

}
