package driverTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessBrowser {

	@Test
	public void setup() {
		FirefoxBinary firefoxBinary = new FirefoxBinary();
		firefoxBinary.addCommandLineOptions("--headless");
		WebDriverManager.firefoxdriver().setup();
		
		FirefoxOptions fo=new FirefoxOptions();
		fo.setBinary(firefoxBinary);
		
		WebDriver driver =new FirefoxDriver(fo);
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		
		
		
		
	}
}
