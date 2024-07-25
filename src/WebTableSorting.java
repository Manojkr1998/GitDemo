import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Manoj\\chromedriver-win64//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/greenkart/#/offers/");
		//click on webElements into List
		driver.findElement(By.xpath("//tr/th[1]")).click();
		//capture all webElements into list
		List<WebElement> elementsList= driver.findElements(By.xpath("//tr/td[1]"));
		//capture text of all webElements into new original list
		List<String> originalList=elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
		//sort on the original list of step-3 --->sortedList
		List <String> sortedList=originalList.stream().sorted().collect(Collectors.toList());
		//compare original list v/s sorted list
		Assert.assertTrue(originalList.equals(sortedList));

	}

}
