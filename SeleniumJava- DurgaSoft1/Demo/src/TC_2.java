import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_2 {
static WebDriver driver;

	
	public static void getBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAYALI\\Downloads\\chromedriver.exe");
		 driver = new ChromeDriver();	
	}
	
	
	public static void openURL() {
		driver.get("https://www.amazon.com");
		//Thread.sleep(3000);
		System.out.println(driver.getTitle());		
	}

}
