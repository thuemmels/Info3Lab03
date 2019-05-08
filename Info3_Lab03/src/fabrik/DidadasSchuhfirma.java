package fabrik;

public class DidadasSchuhfirma implements Schuhfirma {
	
	public Schuh createSchuh(Typ type) {
		Schuh schuh;
		switch(type) {
		case SPORT: schuh = new DidadasSportschuh();
		break;
		case WANDER: schuh = new DidadasWanderschuh();
		break;
		case STIEFEL: schuh = new DidadasStiefel();
		break;
		default: return null;
		}
		return schuh;
	}
}
