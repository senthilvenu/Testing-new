package Testing;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(SeleniumListener.SeleniumTestListener.class)
public class Testing {
 
WebDriver driver;
	@Test(groups= {"login"},priority=0,enabled=true)
	public void login() {
		
		System.out.println("Successfully logined");
				
	}
	@Test(priority=1,dependsOnMethods= {"login"})
	public void Deposit()
	{
		System.out.println("Depsosit");
	}
	
	@Test(groups = {"Creditcard"},priority=2)
	//@Parameters({"Googlesearch"})
	public void Creditcard() throws InterruptedException 
	{
		ChromeOptions chromeOptions= new ChromeOptions();
		chromeOptions.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		System.setProperty("webdriver.chrome.driver","C:\\eclipse-committers-oxygen-1a-win32-x86_64\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(chromeOptions);	
		driver.get("https://www.google.com/");		
		driver.findElement(By.name("q")).sendKeys("Testing");
		Thread.sleep(5000);
		driver.close();							
		System.out.print("Credit Card");
	}
	
	@Test(priority=3,dependsOnMethods= {"Creditcard"},alwaysRun=true)
	public void Consumerloan()
	{
		System.out.println("Consumer loan appiled");
	}
}