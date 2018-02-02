import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.google.common.collect.Table;


public class main {
//test
	private static String google="http://www.google.com";

	public static void main(String[] args) {
		
		String url="https://sports.bwin.com/pl/sports#sportId=4";
		String classSerie="mg-group-header-link",tabelaSeria="";
		int count=0,exceptions=0;
		boolean isNew=false;

		
		
		
		try {
			Document page = Jsoup.connect(url).get();
			System.out.println("Strona: ''"+page.title()+"'' za�adowana");
			Elements mgTables =page.getElementsByClass("mg-table");
			Element mgTable = mgTables.get(0);                                     //pobiera pierwsza tabele z wynikami
			System.out.println("mgTable:  "+ mgTable.text());
			Element seria = page.getElementsByClass(classSerie).first();
			Element tBody =mgTable.getElementsByAttribute("tbody").first();
			//System.out.println("tBody: "+tBody.empty());
			System.out.println(seria.text()+" "+seria.className()+"/n");
			
			Elements trs;
			try {
				trs = mgTable.children().select("tr");
				System.out.println(trs.size());
			
	
		
			start(trs);
		
		
		
		
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				System.out.println("trs not popoulated");
			}
			
			
			
			System.out.println("counter: "+Integer.valueOf(count));
			System.out.println("wyjatki: "+exceptions);
			
			//klasa=page.getElementsByClass("mg-option-button__option-odds ").first();
			//String wynik = klasa.toString();
			//System.out.println(klasa.text());
			
			
		} catch (IOException e) {
			System.out.println("stron anei zaladowana");
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	/*	Hashtable<Integer, wydarzenie> tablica = new Hashtable<>();
		String data="";
	
		bwin bwin = new bwin();
		SBObet sbo = new SBObet();
		data =sbo.run();
		System.out.println(data);
		//bwin.run();
		System.out.println("nazwa:");
		System.out.println(nazwa(data));*/
		/*
	
		login login = new login();
		login.start();
		*/
		
		
		}
	public static void start(Elements trs){
			
			int count=0,exceptions=0;
			String tabelaSeria="",czas,mecz,A="",X="",B="";
			boolean isNew=false;
		
		for (Element element1 : trs) 
		{
			
		
				String readClass =element1.attr("class");
				Element mgGroupHeader,tempClass;
				
				
				
				
				
				try { 
					isNew=false;
				    mgGroupHeader = element1.getElementsByClass("mg-group-header").first();
					String ssss =(mgGroupHeader.tagName());
					tabelaSeria = mgGroupHeader.getElementsByClass("mg-group-header-link").text();
					isNew=true; //jesli wystapi wyjatek nie przelaczy sie
					
					}
						
					
			    catch (Exception e) 
					{
						exceptions++;
					}
				if(isNew){System.out.println(tabelaSeria);}
				
				
				if( readClass.equals("mg-event-row"))
				{	
					try {
						tempClass = element1.getElementsByClass("mg-column mg-datetime-column").first();
						czas= tempClass.text();
						tempClass = element1.getElementsByClass("mg-column mg-event-name-column").first();
						mecz = tempClass.text();
						tempClass = element1.getElementsByClass("mg-result-column3").first();
						 
						try {
							
							Elements tds = tempClass.children().select("td"); // 3 td z wynikami AxB
							A=tds.get(0).text();
							X=tds.get(1).text();
							B=tds.get(2).text();
						} catch (Exception e) {
							System.out.println("tds error");
						}
						
						
						System.out.println(czas+" "+mecz+" "+A+" "+X+" "+B);
					
					} catch (Exception e) {
						System.out.println("clas not found");
					}
					
					//System.out.println(element.tagName());
					count++;
					//System.out.println(element.text());
				}
		}
	}
	
	
	
	
	
	
	public int wyswietlWyniki()
	{
		
		return 0;
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

