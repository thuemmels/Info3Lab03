package fabrik;

public class Main {

	public static void main(String[] args) {
		Schuhfirma firma = new DidadasSchuhfirma();
		
		Schuh sportschuhD = firma.createSchuh(Typ.SPORT);
		Schuh wanderschuhD = firma.createSchuh(Typ.WANDER);
		Schuh stiefelD = firma.createSchuh(Typ.STIEFEL);
		
		firma = new UmapSchuhfirma();
		Schuh sportschuhU = firma.createSchuh(Typ.SPORT);
		Schuh wanderschuhU = firma.createSchuh(Typ.WANDER);
		Schuh stiefelU = firma.createSchuh(Typ.STIEFEL);
		
		firma = new EnkiSchuhfirma();
		Schuh sportschuhE = firma.createSchuh(Typ.SPORT);
		Schuh wanderschuhE = firma.createSchuh(Typ.WANDER);
		Schuh stiefelE = firma.createSchuh(Typ.STIEFEL);
		
		System.out.println(sportschuhD);
		System.out.println(wanderschuhD);
		System.out.println(stiefelD);
		System.out.println();
		
		System.out.println(sportschuhU);
		System.out.println(wanderschuhU);
		System.out.println(stiefelU);
		System.out.println();
		
		System.out.println(sportschuhE);
		System.out.println(wanderschuhE);
		System.out.println(stiefelE);
		System.out.println();
	}

}
