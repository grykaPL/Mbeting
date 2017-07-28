import java.util.List;
import java.util.ArrayList;

import org.apache.bcel.generic.RETURN;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SBObet {
private static String sbobet= "https://www.sbobet.com/euro/football";



public String run(){
	System.setProperty("webdriver.chrome.driver","C:\\Users\\soleszczuk\\OneDrive\\chromedriver.exe");
	WebDriver wdDriver = new ChromeDriver();
	String data="";
	
	wdDriver.get(sbobet);
	//WebElement element = wdDriver.findElement(By.className("MarketBd"));
	List<WebElement> elements = new ArrayList<WebElement>();
	elements= wdDriver.findElements(By.className("Onex2"));
	for(WebElement wb :elements){
		System.out.println("element------");
		System.out.println("data:");
	    data =wb.findElement(By.className("DateTimeTxt")).getText();
		System.out.println(data);
		WebElement Lewa = wb.findElement(By.className("OddsTabL"));
		System.out.println("druzyna 1: ");
		System.out.println(Lewa.findElement(By.className("OddsL")).getText());
		System.out.println(" odds:");
		System.out.println(Lewa.findElement(By.className("OddsR")).getText());
		
	}
	return(data);
};


}