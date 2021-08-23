import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElements_Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.com");
		driver.findElement(By.name("field-keywords")).sendKeys("Iphone 11 pro");
		
		driver.findElement(By.className("nav-input")).click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.partialLinkText("Apple iPhone 11 Pro, 64GB, Midnight Green - Fully Unlocked (Renewed)")).click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String name = driver.findElement(By.id("productTitle")).getText();
		//String price = driver.findElement(By.className("a-size-base a-color-price")).getText();
		
		System.out.println(name);
	}

}
