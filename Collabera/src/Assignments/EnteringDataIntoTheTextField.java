package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnteringDataIntoTheTextField {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver  driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.marksandspencer.in/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("T shirt");	
	
	}

}
