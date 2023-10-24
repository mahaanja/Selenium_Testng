package comlearing.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;




public class loginPage {
	WebDriver driver;
	String user="//*[@id='email']";
	String pass="//*[@id='pass']";
	String login="//* [starts-with (@id, 'u_0_5')]";
	String logInWithPassword="//a[contains(text(),'Log in with password')]";
	
	
	
	public void InitialiseChrome()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\anjali\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
		options.setBinary("C:\\anjali\\chrome-win64\\chrome-win64\\chrome.exe");
	    driver= new ChromeDriver(options);
	   
	}
	public void launchBrowser()
	{
		 driver.get("https://www.facebook.com/");
	}
	
	
	public void invalidlogin()
	{
		WebElement userName = driver.findElement(By.xpath(user));
		userName.sendKeys("03anjali.nift@gmail.com");
	    WebElement passWord = driver.findElement(By.xpath(pass));
	    passWord.sendKeys("pass123454");
	    WebElement logIn = driver.findElement(By.xpath(login));
	    logIn.click();;
	    
	    
	    
	}
	
	public boolean verifyPasswordFailure()
	{
		boolean flag = driver.findElement(By.xpath(logInWithPassword)).isDisplayed();
        return flag;
	}
	
	public void closeChrome()
	{
		driver.close();
	   
	}

}
