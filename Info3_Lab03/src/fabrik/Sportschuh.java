package fabrik;

public class Sportschuh extends Schuh {
	private String marke;
	
	public Sportschuh(String marke) {
		this.marke = marke;
	}
	
	public String toString() {
		return "Bezeichnung: Sportschuh, Marke: " + marke;
	};
}
