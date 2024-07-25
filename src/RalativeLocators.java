import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
public class RalativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Manoj\\chromedriver-win64//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement name = driver.findElement(By.cssSelector("[name='name']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(name)).getText());
		WebElement DoB = driver.findElement(By.cssSelector("[for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(DoB)).click();
		WebElement Icecream = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(Icecream)).click();
		WebElement Radio = driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(Radio)).getText());
		
	}

}
