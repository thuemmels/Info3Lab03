package fabrik;

public enum Typ {
	SPORT("Sport"),
	WANDER("Wander"),
	STIEFEL("Stiefel");
	
	String type;
	Typ(String type) {
		this.type = type;
	}
	
	public String toString() {
		return type;
	}
}