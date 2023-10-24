package comlearning.TestNG;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ValidateTittle {
	WebDriver driver;
	
	@BeforeTest
	public void launchBrowse()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\anjali\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
		options.setBinary("C:\\anjali\\chrome-win64\\chrome-win64\\chrome.exe");
	    driver= new ChromeDriver(options);
	    driver.get("https://tuliphitech.com/");
	}
	
	@Test(priority=1)
	public void verifyTittle()
	{
		WebElement contactlenses = driver.findElement(By.xpath("//a[contains(text(),'Contact Lenses')]"));
	    contactlenses.click();
	    WebElement product = driver.findElement(By.xpath("//*[@class='col-md-4 col-xs-6 plr-8']"));
	    product.click();
	    WebElement DRM = driver.findElement(By.xpath("//li[contains(text(),'Deposit Resistant Material')]"));
	    String a = DRM.getText();
	    System.out.println(a);    
	    String b ="Deposit Resistant Material";
	    Assert.assertEquals(a, b);
	}
	
	@Test(priority=2)
	public void verifyLink()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
        boolean flag = driver.findElement(By.xpath("//a[contains(text(),'Home')][1]")).isDisplayed();
        Assert.assertTrue(flag);
	}
	
	
	@AfterTest
	public void CloseBrowse()
	{
		driver.close();
	}
	
	

}
