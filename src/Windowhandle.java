import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Windowhandle {
	WebDriver driver;

	@BeforeClass
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.andhrabank.in/English/home.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	}
	@Test
	public void click()
	{

		String parentwindowid=driver.getWindowHandle();
		System.out.println("parentwindowid:"+parentwindowid);
		WebElement ApplyOnlineelement = driver.findElement(By.linkText("Apply Online"));
		ApplyOnlineelement.click(); 
		System.out.println("Current window id: "+driver.getWindowHandle()); 
		Set<String> setwindowids = driver.getWindowHandles();
		for(String window: setwindowids){
			if(window.equals(parentwindowid))
				continue;
			else
				driver.switchTo().window(window);

		}
		System.out.println("Current window title: " +driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Andhra Bank Online Loan Tracking System");
		driver.close(); 
		driver.switchTo().window(parentwindowid);
		System.out.println("Current window:"+ driver.getTitle());
	}

}
