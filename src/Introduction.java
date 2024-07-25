import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://careers.anz.com/go/ANZ-Jobs-List/4739210/");
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/ul/li[1]/a")).click();
		driver.findElement(By.tagName("input#username")).sendKeys("manojmanu3289@gmail.com");   
		driver.findElement(By.className("form-control")).sendKeys("Manojkr@1998");
		driver.findElement(By.xpath("//*[@id=\"page_content\"]/div[2]/div/div/div[2]/div/div/table/tbody/tr[3]/td[2]/span[1]/span/button")).click();
		
		
		
		
	}

}
