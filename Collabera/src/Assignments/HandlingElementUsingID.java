package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingElementUsingID {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://togo.crackerbarrel.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("ember65-input")).sendKeys("109 North Seventh Street Springfield, Illinois");


		
	}

}
