package week3.assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println("Title : " + title);

		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags", Keys.ENTER);
		driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		Thread.sleep(20000);
		List<WebElement> brand = driver
				.findElements(By.xpath("//div[@class='item rilrtl-products-list__item item']//div[@class='brand']"));
		Thread.sleep(20000);
		int size = brand.size();
		System.out.println("The number of items present in the list is :" + size);
		for (WebElement listbrand : brand) {
			System.out.println("Brand Name: " + listbrand.getText());

		}

	}

}
