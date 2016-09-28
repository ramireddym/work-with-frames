import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestNGbasics1 {
	WebDriver driver;

	@BeforeClass

	public void basic()
	{
		driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test(priority=0)
	public void gmaillogin()
	{
		driver.findElement(By.id("Email")).sendKeys("ramireddy591");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("9666860641");
		driver.findElement(By.id("signIn")).click();
	}

	@Test(priority=1)
	public void compose()
	{
		driver.findElement(By.linkText("COMPOSE")).click();

	}
	@Test(priority=2)
	public void gmaillogout()
	{
		driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
		driver.findElement(By.linkText("Sign out")).click();
	}


}
