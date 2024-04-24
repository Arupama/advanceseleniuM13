package beauty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchNykaa_Test 
{
@Test
public void Nykaa()
{
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.nykaa.com/");
	driver.quit();
}
	
	
	
	
}
