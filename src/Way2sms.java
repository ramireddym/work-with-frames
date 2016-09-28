import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Way2sms {
	WebDriver driver;

	@BeforeClass
	public void basic()
	{
		driver=new FirefoxDriver();
		driver.get("http://site21.way2sms.com/content/index.html?");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	}

	@Test
	public void way2smslogin()
	{
		driver.findElement(By.id("username")).sendKeys("9989593467");
		driver.findElement(By.id("password")).sendKeys("ramireddy");
		driver.findElement(By.id("loginBTN")).click();
	}
	@Test
	public void clicksms()
	{
		driver.findElement(By.xpath(".//*[@id='ebFrm']/div[1]/div[1]/div[2]/div[1]/input")).click();
		driver.findElement(By.xpath(".//a[text()='Send SMS']")).click();
		driver.switchTo().frame("frame");
	}

	@Test
	public void send()
	{
		driver.findElement(By.id("mobile")).sendKeys("9989560641");
		driver.findElement(By.id("message")).sendKeys(" Rightshopping @@ Shopbychoice @@ Bigadda @@@ those three are project names pick any one");
		driver.findElement(By.id("Send")).click();
		driver.switchTo().defaultContent();
	}

	@Test
	public void logout()
	{
		driver.findElement(By.xpath(".//li[@class='lout']/i")).click();
	}
}

