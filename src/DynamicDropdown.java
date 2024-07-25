import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Manoj\\chromedriver-win64//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://spicejet.com");
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div[1]/div[2]/input")).click();
		driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-1xedbs3 r-ubezar'])[10]")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-1xedbs3 r-ubezar'])[12]")).click();
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-19yat4t r-1rt2jqs'] //div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-tju18j r-5njf8e r-1otgn73']")).click();
	
	
	
	}
}
	