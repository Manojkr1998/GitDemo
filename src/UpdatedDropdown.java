import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Manoj\\chromedriver-win64//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://spicejet.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		System.out.println(driver.findElement(By.id("input[id*='friendsandfamily']")).isSelected());
		driver.findElement(By.id("input[id*='friendsandfamily']")).click();
		System.out.println(driver.findElement(By.id("input[id*='SeniorCitizenDiscount']")).isSelected());
		//Thread.sleep(3000);
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
		
		
		
		/* driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[5]/div[1]/div[1]/div[1]/div[2]")).click();
		int i=1;
		while(i<5)
		{
			driver.findElement(By.className("css-76zvg2 r-1862ga2")).click();
			i++;
		}
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[2]/div")).click();
		System.out.println(driver.findElement(By.className("css-76zvg2 r-1862ga2")).getText());*/
	}

}
