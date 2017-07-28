import org.apache.bcel.generic.NEW;

public class wydarzenie {
	private static int id;
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		wydarzenie.id = id;
	}
	public static String getNazwa() {
		return nazwa;
	}
	public static void setNazwa(String nazwa) {
		wydarzenie.nazwa = nazwa;
	}
	private static String nazwa,strona1,strona2;
	boolean nowe=true;
	
	
	public wydarzenie() {}
	private float[][] oddsy = new float[10][4];
	
	public void dodajWpis(int _id, String _nazwa,float bookiee, float pierwszy,float remis, float drugi ){
		if(nowe){id=_id;nazwa=_nazwa;nowe=false;}
		for(int i=0;i<10;i++)
		{
			if(oddsy[i][0]==0.0){ //wyszukuje pierwszego niewypelnionego
				oddsy[i][0]= bookiee;
				oddsy[i][1]=pierwszy;
				oddsy[i][2]=remis;
				oddsy[i][3]=drugi;
			
				i=11; //wychodzi z petli po uzupelnieniu wolnego
			
			}
		}
	}
	
	public void print(String a){
		
	}
}
