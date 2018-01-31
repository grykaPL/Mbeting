import org.apache.bcel.generic.NEW;

public class wydarzenie {
	
	private int id;
	private  String nazwa,strona1,strona2;
	boolean nowe=true;
	private float[][] oddsy = new float[10][4];
	
	
	
	public  int getId() {
		return id;
	}
	public  void setId(int id) {
		this.id = id;
	}
	public  String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	
	public wydarzenie(String _nazwa) {
		this.nazwa=_nazwa;
		
	}
	
	
	
	
	public void dodajWpis(float bookie,float pierwszy,float remis, float drugi ){
		
		for(int i=0;i<10;i++)
		{
			if(oddsy[i][0]==0.0){ //wyszukuje pierwszego niewypelnionego
				oddsy[i][0]= bookie;     //1=bwin
				oddsy[i][1]=pierwszy;
				oddsy[i][2]=remis;
				oddsy[i][3]=drugi;
			
				i=11; //wychodzi z petli po uzupelnieniu wolnego
			
			}
		}
	}
	
	
}
