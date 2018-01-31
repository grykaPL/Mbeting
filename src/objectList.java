import java.util.ArrayList;
import java.util.List;

public class objectList {

	private String sport,kraj,liga;
	List<wydarzenie> lista = new ArrayList<wydarzenie>();
	
	//konstruktor
	public objectList(String _sport,String _kraj,String _liga){
		this.sport=_sport;
		this.kraj =_kraj;
		this.liga = _liga;
	}
	
	public void addEvent(wydarzenie _wydarzenie)
	{
		lista.add(_wydarzenie);
		
	}
	
	

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public String getKraj() {
		return kraj;
	}

	public void setKraj(String kraj) {
		this.kraj = kraj;
	}

	public String getLiga() {
		return liga;
	}

	public void setLiga(String liga) {
		this.liga = liga;
	}
	
	
}
