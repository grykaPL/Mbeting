import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.event.Event;

public class bwin {
	private static String bwin ="https://sports.bwin.com/pl/sports#sportId=4";
	boolean flaga = true;
    public void run(){
	System.setProperty("webdriver.chrome.driver","C:\\Users\\soleszczuk\\OneDrive\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get(bwin);	
	List<WebElement> myList = new ArrayList<WebElement>();
	WebElement wb = driver.findElement(By.cssSelector("table.mg-table"));
	myList = wb.findElements(By.tagName("tr"));
	System.out.println(Integer.toString(myList.size()));
	int i=0;

	for(WebElement W:myList){
		try {//W.findElement(By.cssSelector("mg-option-button__option-odds"));
		W.findElements(By.cssSelector(".mg-option-button__option-odds"));
		//System.out.println(W.);
		System.out.println(W.getText());
		} catch (Exception e) {
			{System.out.println("bez: mg-event-row");i++;}
		
	}
		System.out.println("koniec elementu---------------");
	}
	System.out.println(Integer.toString(i));
	
	
	//wb.findElements(By.cssSelector(".mg-option-button__option-odds"));
	//System.out.println(wb.getText());

	/*
	System.out.println(myList.size());
	for (WebElement element:myList){
		element.findElements(By.cssSelector(".mg-option-button__option-odds"));
		System.out.println(element.getText());
		
	//System.out.println(a.toString());
	}*/
    }
}
