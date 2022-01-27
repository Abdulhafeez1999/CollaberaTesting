package Assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTitleUrlPageSourceOfFlipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://flipkart.com/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());


	}

}
