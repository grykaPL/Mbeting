import java.util.ArrayList;
import java.util.List;

public class arrayManager {
	
	private List<objectList> listaLigPN;

	public arrayManager() {
		
		List<objectList> listaLigPN = new ArrayList<objectList>();  //trzyma cala pilke nozna
	}
	
	public void dodajPN(float bookie,String _kraj,String _data,String A,String X,String B) {
		
		listaLigPN.add(new objectList("PN",_kraj,_data));
		
		
	}
	
	private int krajToInt(String _kraj)
	{switch (_kraj) {
	case "w³ochy": return(1);
		break;
	case "niemcy": return(2);
		break;
	case "francja": return(3);
		break;
	case "hiszpania": return(4);
		break;
	case "holandia": return(5);
		break;
	case "anglia": return(6);
		break;
	case "grecja": return(7);
	break;
	case "belgia": return(8);
	break;
	case "szkocja": return(9);
	break;
	
	default: retunr(0);
		break;
	}
		return
	}
	

}
