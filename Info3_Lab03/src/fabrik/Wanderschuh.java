package fabrik;

public class Wanderschuh extends Schuh {

	private String marke;
	
	public Wanderschuh(String marke) {
		this.marke = marke;
	}
	
	public String toString() {
		return "Bezeichnung: Wanderschuh, Marke: " + marke;
	};
}
