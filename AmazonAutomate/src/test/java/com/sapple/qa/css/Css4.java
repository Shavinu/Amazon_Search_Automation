package com.sapple.qa.css;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css4 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:/Test/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.walmart.com");
		driver.findElement(By.id("global-search-input")).sendKeys("Kennth Cole men's watches");		
		driver.findElement(By.id("global-search-submit")).click();
		Thread.sleep(1000);
		
		//search-result-gridview-item-wrapper is the entire cell of an each product!!
		List<WebElement> items = driver.findElements(By.cssSelector("div.search-result-gridview-item-wrapper"));
		
		for(WebElement item : items) {
			String itmPz = item.findElement(By.cssSelector("span.price-main:first-child")).getText().trim();
			String itmPz2 = itmPz.replace("$", "").replace(" ", "");
			double itmPz3 = Double.parseDouble(itmPz2);
			if (itmPz3 < 20.0 || itmPz3 > 50.00) {
				WebElement productTitle = item.findElement(By.cssSelector("a.product-title-link"));
				System.out.println(productTitle.getText());
				System.out.println(productTitle.getAttribute("href"));
				System.out.println(itmPz);
				System.out.println("-------------------------");
			}
		}		
	}
}
