package SampleTests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class homePage {
	
	WebDriver driver;
	
@BeforeTest
	public void testcase0()
	{
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\InterviewQ\\chromedriver_win32\\chromedriver.exe");
		driver  = new ChromeDriver();		
		driver.manage().window().maximize();
	}
	
	@Test
	public void testcase1()
	{
		driver.get("https://www.google.com/"); 
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		String title = driver.getTitle();
		Assert.assertEquals(title, "Google", "Title verified");
	}

	@Test
	public void testcase2()
	{
		driver.close();
	}
}
