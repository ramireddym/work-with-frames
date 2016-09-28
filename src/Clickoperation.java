import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;


public class Clickoperation {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		//WebDriver driver=new FirefoxDriver();
				System.setProperty("webdriver.ie.driver", "D:\\Venkata Rami Reddy\\testing softwares\\IEDriverServer.exe");
				WebDriver driver = new InternetExplorerDriver();
				System.setProperty("WebDriver.ie.driver.Logfile","D:\\Venkata Rami Reddy\\testing softwares.Log");
				System.setProperty("WebDriver.ie.driver.Loglevel","INFO");

		//		System.setProperty("webdriver.chrome.driver", 
		//				"D:\\Venkata Rami Reddy\\softwares\\chrome\\chromedriver.exe");
		//		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.get("https://www.google.co.in");
		WebElement Mail=driver.findElement(By.linkText("Gmail"));
		Actions action=new Actions(driver);
		action.contextClick(Mail).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

		/*Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_ALT);*/
		Robot rb = new Robot();
		

        // Perform [Ctrl+A] Operation - it works
        rb.keyPress(KeyEvent.VK_ALT);    
        rb.keyPress(KeyEvent.VK_S);
        rb.keyRelease(KeyEvent.VK_ALT);
        rb.keyRelease(KeyEvent.VK_S);
      
	}

}
