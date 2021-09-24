package week3.assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSort {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println("Title : " + title);

		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
		fromStation.clear();
		fromStation.sendKeys("MS", Keys.ENTER);

		WebElement toStation = driver.findElement(By.id("txtStationTo"));
		toStation.clear();
		toStation.sendKeys("MDU", Keys.ENTER);

		List<WebElement> trainNumbers = driver
				.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[1]"));
		int size = trainNumbers.size();
		System.out.println(" number of trains:" + size);
		for (WebElement webElement : trainNumbers) {
			System.out.println(" Train num:" + webElement.getText());
		}

	}

}
