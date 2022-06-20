package Home_Pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Home_Page_Class {
	
	WebDriver driver;
	//this line has been added
	@BeforeTest
	public void OpenBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saife\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://www.express.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]"));

		//Creating object of an Actions class
		Actions action = new Actions(driver);

		//Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		
		
	}
	
	@AfterTest
	public void CloseBrowser() throws InterruptedException
	{
		//Thread.sleep(3000, 111);
		//driver.close();
	}
	
	

}
