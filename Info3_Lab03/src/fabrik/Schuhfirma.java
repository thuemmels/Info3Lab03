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
	public Produkt fabrikMethode(String type) {
		Produkt schuh;
		if(type.equals("Sport")) {
			schuh = new Sportschuh(marke);
		}
		else if(type.equals("Wander")) {
			schuh = new Wanderschuh(marke);
		}
		else if(type.equals("Stiefel")) {
			schuh = new Stiefel(marke);
		}
		else {
			return null;
		}
		return schuh;
	}
	
	

}
