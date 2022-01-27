package Assignments;

import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowTitleInAlphabeticalOrder {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");

		TreeSet title=new TreeSet();
		Set<String> allWindowIds = driver.getWindowHandles();

		for(String windowId : allWindowIds) {
			driver.switchTo().window(windowId);
			title.add(driver.getTitle());
		}


	}
}
