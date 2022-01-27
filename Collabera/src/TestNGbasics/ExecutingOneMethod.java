package TestNGbasics;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExecutingOneMethod {

	@Test

	public void TestGoogle() throws Exception {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		//	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("olive garden",Keys.ENTER);
		System.out.println(driver.getTitle());
		driver.quit();
	}

	@Test

	public void TestCarlsjr() throws Exception {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.carlsjr.com/");
		Thread.sleep(10000);
		driver.findElement(By.linkText("Order Online")).click();
		System.out.println(driver.getTitle());
		driver.quit();
	}
}


