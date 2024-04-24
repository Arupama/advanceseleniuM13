package food;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchZamato_Test 
{
	
@Test
public void Zamato()
{
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.zomato.com/bangalore");
	driver.quit();
}
	
	

}
