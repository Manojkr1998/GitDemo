import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheck_Miscellaneous {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);    // handling error pages with privacy issues 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Manoj\\chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();     // to maximize the window
		driver.manage().deleteAllCookies();      //to delete all the cookies
		driver.manage().deleteCookieNamed("abcde");    //to delete the particular cookie
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		
	
	}

}
