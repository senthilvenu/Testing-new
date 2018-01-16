package Testing;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


//@Listeners(SeleniumListener.SeleniumTestListener.class)
public class TestingSample {
	
   
WebDriver driver;
	@Test
	public void Testlogin() {
		
		System.out.println("Third Test need to be executed");
				
	}
	@Test
	public void STestDeposit()
	{
		System.out.println("Fourth Test need to be executed");
	}
	
	@Test
	
	public void BTestCreditcard()
	{
		System.out.println("Second Test need to be executed");
			}
	
	@Test
	public void ATestConsuerloan()
	{
		System.out.println("First Test need to be executed");
	}

}
