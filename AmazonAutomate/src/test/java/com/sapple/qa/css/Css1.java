package com.sapple.qa.css;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css1 {

	public static void main(String[] args) throws Exception  {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		driver.findElement(By.cssSelector("i.hm-icon")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.findElement(By.partialLinkText("Fire TV")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.findElement(By.partialLinkText("Fire TV Stick 4K")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		String tt = driver.findElement(By.cssSelector("span#productTitle")).getText();
		System.out.println(tt);
		
		System.out.println("This test has -: ");
		
		if(tt.contains("Fire TV Stick 4K"))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}
		
		driver.close();
	}

}
