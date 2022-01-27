package Assignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSizeOfTheWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		Dimension dimension = new Dimension(100,200);
		driver.manage().window().setSize(dimension);
		
		
	}

}
