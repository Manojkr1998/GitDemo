import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Manoj\\chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Actions a = new Actions(driver);
		WebElement move= driver.findElement(By.cssSelector("input.Pke_EE"));
		a.moveToElement(move).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		//a.moveToElement(driver.findElement(By.xpath("//*[text()='Electronics']"))).click();

	}

}
