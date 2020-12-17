package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC001LoginTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse-workspace-201906\\AutomationQA\\src\\test\\resources\\driverexecutables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement	signinbtn=driver.findElement(By.id("signin_button"));
		signinbtn.click();
		WebElement	loginTextbox=driver.findElement(By.name("user_login"));
		loginTextbox.sendKeys("username");
		WebElement	passwordTextbox=driver.findElement(By.id("user_password"));
		passwordTextbox.sendKeys("password");
		
		WebElement	submitBtn=driver.findElement(By.name("submit"));
		submitBtn.click();
		
		
		driver.quit();	
		
		
		
		
	}

}
