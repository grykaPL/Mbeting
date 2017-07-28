import java.util.List;
import java.util.ArrayList;
import java.util.Hashtable;

import org.apache.bcel.generic.NEW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class main {

	private static String google="http://www.google.com";

	public static void main(String[] args) {
		
	/*	Hashtable<Integer, wydarzenie> tablica = new Hashtable<>();
		String data="";
	
		bwin bwin = new bwin();
		SBObet sbo = new SBObet();
		data =sbo.run();
		System.out.println(data);
		//bwin.run();
		System.out.println("nazwa:");
		System.out.println(nazwa(data));*/
		
	
		login login = new login();
		login.start();
		
		
		
		}
	public static String nazwa(String s) {
		String[] tab = s.split("( )|(\\n)");
		System.out.println("podzielone"+ String.valueOf(tab.length));
		
		System.out.println(tab[0]+ "2: "+tab[1]+ "3: ");
		String miesiac=tab[0];
		switch (miesiac) {
		case "Jan":
			miesiac="1";
			break;
		case "Feb":
			miesiac="2";
			break;
		case "Mar":
			miesiac="3";
			break;
		case "Apr":
			miesiac="4";
			break;
		case "May":
			miesiac="5";
			break;
		case "Jun":
			miesiac="6";
			break;
		case "Jul":
			miesiac="7";
			break;
		case "Aug":
			miesiac="8";
			break;
		case "Sep":
			miesiac="9";
			break;
		case "Oct":
			miesiac="10";
			break;
		case "Nov":
			miesiac="11";
			break;
		case "Dec":
			miesiac="12";
			break;
		default:
			miesiac="0";
			break;
		}
		
		System.out.println("return miesiac:");
		System.out.println(miesiac);
		System.out.println(tab[1]);
		return(miesiac+"."+tab[1]+"."+tab[2]);
	}
	
}

