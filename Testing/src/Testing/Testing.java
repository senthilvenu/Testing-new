package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
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
	@Parameters({"Googlesearch"})
	public void Creditcard(String Googlesearch) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\eclipse-committers-oxygen-1a-win32-x86_64\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		//driver = new RemoteWebDriver(DesiredCapabilities.chrome());
		driver.get("https://www.google.com/");
		//WebElement text =driver.findElement(By.xpath("//input[@name='q']"));
		//JavascriptExecutor Js = (JavascriptExecutor)driver;
		//Js.executeScript("document.getElementById('lst-ib').value='test'");
		//Js.executeScript("document.getElementsByName('q')[0].value=Googlesearch");
		//driver.findElement(By.name("q")).sendKeys(Googlesearch);		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		//Js.executeScript("document.getElementsByName('btnK')[0].click()");
		//driver.findElement(By.name("btnK")).click();			
		System.out.print("Credit Card");
	}
	
	@Test(priority=3,dependsOnMethods= {"Creditcard"},alwaysRun=true)
	public void Consuerloan()
	{
		System.out.println("Consumer loan appiled");
	}

}
