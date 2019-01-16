package driverTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleProject {
	WebDriver driver;
	
	@Test
	public void  setup() {	
	//WebDriverManager.chromedriver().setup();
		//driver=new ChromeDriver();
		WebDriverManager.firefoxdriver().setup();
	driver =new FirefoxDriver();
	driver.get("http://www.google.com");
	}
}
