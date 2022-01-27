package Assignments;

import java.time.LocalDateTime;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleCalenderPopUp {

	public static void main(String[] args) throws InterruptedException {

		LocalDateTime ldt = LocalDateTime.now();
		String month = ldt.getMonth().name();
		month = month.substring(0,1).toUpperCase()+month.substring(1,month.length()).toLowerCase();
		int date = ldt.getDayOfMonth();
		int year = ldt.getYear();

		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver,10);

		driver.get("https://www.trivago.in/");
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.click().perform();
		driver.findElement(By.xpath("//button[@data-testid='calendar-checkin']")).click();

		for(;;)
			try {
				driver.findElement(By.xpath("//button[text()='"+month+" "+year+"']/..//span[text()='"+date+"']")).click();
				break;
			}
		catch(NoSuchElementException D) {
			driver.findElement(By.xpath("//button[@aria-label='next']")).click();
		}

	}

}
