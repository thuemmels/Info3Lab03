package fabrik;

public class UmapSchuhfirma implements Schuhfirma {
	
	public Schuh createSchuh(Typ type) {
		Schuh schuh;
		switch(type) {
		case SPORT: schuh = new UmapSportschuh();
		break;
		case WANDER: schuh = new UmapWanderschuh();
		break;
		case STIEFEL: schuh = new UmapStiefel();
		break;
		default: return null;
		}
		return schuh;
	}
}
