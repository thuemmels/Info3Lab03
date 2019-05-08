package fabrik;

public class Schuhfirma extends Erzeuger{
	
	private String marke;
	
	public Schuhfirma(String marke) {
		this.marke = marke;
	}
	
	public String getMarke() {
		return marke;
	}

	@Override
	public Produkt fabrikMethode(Typ type) {
		Produkt schuh;
		switch(type) {
		case SPORT: schuh = new Sportschuh(marke);
		break;
		case WANDER: schuh = new Wanderschuh(marke);
		break;
		case STIEFEL: schuh = new Stiefel(marke);
		break;
		default: return null;
		
		}
		return schuh;
	}
	
	

}
