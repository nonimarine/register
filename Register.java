package org.seleniumhq.selenium.selenium_java;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Register {
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nonimarine\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://jimshoneyofficial.com/");
		WebElement register = driver.findElement(By.xpath("//*[@id=\"masthead\"]/div[1]/div[5]/ul/li[2]/a/i"));
		register.click();
		WebElement noKTP = driver.findElement(By.xpath("//input[@id='idnumber']"));
		noKTP.sendKeys("1234567890");
		Select oSelect = new Select(driver.findElement(By.id("birthday")));
		oSelect.selectByVisibleText("27011993");
		Select aSelect = new Select(driver.findElement(By.id("gender")));
		aSelect.selectByIndex(2);
		WebElement username = driver.findElement(By.xpath("//input[@id='reg_username']"));
		username.sendKeys("nonimarine");
		WebElement email = driver.findElement(By.xpath("//input[@id='reg_email']"));
		email.sendKeys("nonimarine@mailinator.com");
		WebElement password = driver.findElement(By.xpath("//input[@id='reg_password']"));
		password.sendKeys("test123456");
		WebElement btnRegister = driver.findElement(By.xpath("//button[contains(text(),'Register')]"));
		btnRegister.click();
	}
}
