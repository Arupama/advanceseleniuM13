package food;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchSwigy_Test 
{
@Test
	public void Swiggy()
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		driver.quit();
	}
}
