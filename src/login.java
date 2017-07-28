import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	
	
	
	public void start() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\soleszczuk\\OneDrive\\chromedriver.exe");
		WebDriver wdDriver = new ChromeDriver();
		wdDriver.get("https://sports.bwin.com/pl/sports");
		WebElement login = wdDriver.findElement(By.id("username"));
		wdDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		login.sendKeys("Grykaotw");
		WebElement pass = wdDriver.findElement(By.id("password"));
		pass.sendKeys("polska0");
	    WebElement button =wdDriver.findElement(By.name("submit"));
	    button.submit();
		
		

}
}
