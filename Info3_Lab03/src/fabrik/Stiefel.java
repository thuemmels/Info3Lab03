package fabrik;

public class Stiefel extends Schuh {
	private String marke;
	
	public Stiefel(String marke) {
		this.marke = marke;
	}
	
	public String toString() {
		return "Bezeichnung: Stiefel, Marke: " + marke;
	};
}
