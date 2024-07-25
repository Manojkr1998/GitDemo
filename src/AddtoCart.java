import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class AddtoCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Manoj\\chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String[] names= {"Brocolli","Cucumber"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		List <WebElement> products= driver.findElements(By.cssSelector("h4.product-name"));
		for (int i=0;i<products.size();i++)
		{
			String name=products.get(i).getText();
			if (products.contains("Cucumber"))
			{
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}
		}
	}

}
