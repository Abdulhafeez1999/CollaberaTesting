package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSpecificTitledWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.panerabread.com/");
		driver.findElement(By.xpath("//span[text()='Search Our Menu']")).click();
	}

}
