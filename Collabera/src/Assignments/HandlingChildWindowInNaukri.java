package Assignments;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingChildWindowInNaukri {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");

		String parentWindowId = driver.getWindowHandle();
		Set<String> allWindowsIds = driver.getWindowHandles();
		allWindowsIds.remove(parentWindowId);

		for(String windowId :  allWindowsIds) {
			driver.switchTo().window(windowId);
			driver.close();

		}

	}
}

