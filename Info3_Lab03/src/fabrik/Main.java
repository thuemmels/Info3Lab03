package fabrik;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Erzeuger erzeugerD = new Schuhfirma("Didadas");
		Erzeuger erzeugerU = new Schuhfirma("Umap");
		Erzeuger erzeugerE = new Schuhfirma("Enki"); 
		
		Produkt sportschuhD = erzeugerD.fabrikMethode(Typ.SPORT);
		Produkt wanderschuhD = erzeugerD.fabrikMethode(Typ.WANDER);
		Produkt stiefelD = erzeugerD.fabrikMethode(Typ.STIEFEL);
		
		Produkt sportschuhU = erzeugerU.fabrikMethode(Typ.SPORT);
		Produkt wanderschuhU = erzeugerU.fabrikMethode(Typ.WANDER);
		Produkt stiefelU = erzeugerU.fabrikMethode(Typ.STIEFEL);
		
		Produkt sportschuhE = erzeugerE.fabrikMethode(Typ.SPORT);
		Produkt wanderschuhE = erzeugerE.fabrikMethode(Typ.WANDER);
		Produkt stiefelE = erzeugerE.fabrikMethode(Typ.STIEFEL);
		
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
