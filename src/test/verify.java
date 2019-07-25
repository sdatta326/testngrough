package test;



import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verify {
	
	@BeforeTest()
	public void first()
	{
		System.out.println("hello world first");
	}


	@Test
	public void verifyHomepageTitle() throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","c:\\work\\chromedriver.exe");


		WebDriver driver= new ChromeDriver();

		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		System.out.println(driver.getCurrentUrl());

	
		driver.close();

		
	}
	
	@AfterTest()
	public void last()
	{
		System.out.println("hello world last");
	}
}