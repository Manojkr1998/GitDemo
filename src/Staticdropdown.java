import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Staticdropdown {

	public static void main(String[] args) throws InterruptedException {
		 // TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Manoj\\chromedriver-win64//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement Staticdropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown= new Select(Staticdropdown);
		dropdown.selectByIndex(1);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText()); 
		/* driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.cssSelector("body > app-root > form-comp > div > form > div:nth-child(1) > input")).sendKeys("Manoj");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("manojkr@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Manojkr@1998");
		driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();
		driver.findElement(By.cssSelector("select[id='exampleFormControlSelect1']")).click();
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("21-02-1998");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText()); */
		
		
	}

}
