package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class UIT {
	@Test
	public void serchGoogle() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://google.com");
	WebElement ele=driver.findElement(By.xpath("//input[@name='q']"));
	ele.click();ele.sendKeys("Selenium");
	driver.findElement(By.xpath("//input[@value='Google Search']"));
	
	Actions act=new Actions(driver);
	WebElement searchele=driver.findElement(By.xpath("//*[@id=\"sbse0\"]/div[2]"));
	act.moveToElement(searchele).build().perform();
	act.click(searchele).build().perform();
	Thread.sleep(4000);
	driver.quit();
	}

}
