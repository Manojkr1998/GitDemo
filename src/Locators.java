import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Manoj\\chromedriver-win64//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Implicit wait for 4 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Manoj");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Manoj");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("manoj@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("manu@123");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("1234569874");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		System.out.println(driver.findElement(By.className("infoMsg")).getText());
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Rahul");
		driver.findElement(By.xpath("//input[contains(@type,'pass')]")).sendKeys("rahulshettyacademy");
		Thread.sleep(1000);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@Class,'submit')]")).click();
		System.out.println(driver.findElement(By.xpath("//div[contains(@class,'login')]/p")).getText());
		driver.findElement(By.cssSelector("button[class*='btn']")).click();
		
		
		
	}

}
