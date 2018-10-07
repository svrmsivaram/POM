package testcases;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class RoadRunnerSports {
	WebDriver driver;

	@BeforeSuite
	public void launchingBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testScripts() {
		driver.get("https://www.roadrunnersports.com/");
		try {

			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions
					.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='monetate_lightbox_content']/img")));
			driver.findElement(By.xpath("//div[@id='monetate_lightbox_content']/img")).isDisplayed();
			System.out.println("Popup displayed");
			driver.findElement(By.xpath("//div[@id='monetate_lightbox_content']/img")).click();
		} catch (NoSuchElementException e) {
			if (driver.getTitle().contains("Road Runner Sports: Top Running Shoes for Every Sport & Athlete")) {
				System.out.println(e.getMessage());
				System.out.println("Landing to the First Page");
			} else {
				System.out.println("Landing on wrong page");
				System.out.println(driver.getTitle());
			}

		}
		if (driver.getTitle().contains("Road Runner Sports: Top Running Shoes for Every Sport & Athlete")) {
			System.out.println("Landing to the First Page");
		} else {
			System.out.println("Landing on wrong page");
			System.out.println(driver.getTitle());
		}

	}
}
