package fabrik;

public class EnkiSchuhfirma implements Schuhfirma {

	public Schuh createSchuh(Typ type) {
		Schuh schuh;
		switch(type) {
		case SPORT: schuh = new EnkiSportschuh();
		break;
		case WANDER: schuh = new EnkiWanderschuh();
		break;
		case STIEFEL: schuh = new EnkiStiefel();
		break;
		default: return null;
		}
		return schuh;
	}
}
