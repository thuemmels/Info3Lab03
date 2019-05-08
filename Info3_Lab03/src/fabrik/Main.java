package fabrik;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Erzeuger erzeugerD = new Schuhfirma("Didadas");
		Erzeuger erzeugerU = new Schuhfirma("Umap");
		Erzeuger erzeugerE = new Schuhfirma("Enki"); 
		
		Produkt sportschuhD = erzeugerD.fabrikMethode("Sport");
		Produkt wanderschuhD = erzeugerD.fabrikMethode("Wander");
		Produkt stiefelD = erzeugerD.fabrikMethode("Stiefel");
		
		Produkt sportschuhU = erzeugerU.fabrikMethode("Sport");
		Produkt wanderschuhU = erzeugerU.fabrikMethode("Wander");
		Produkt stiefelU = erzeugerU.fabrikMethode("Stiefel");
		
		Produkt sportschuhE = erzeugerE.fabrikMethode("Sport");
		Produkt wanderschuhE = erzeugerE.fabrikMethode("Wander");
		Produkt stiefelE = erzeugerE.fabrikMethode("Stiefel");
		
		System.out.println(sportschuhD);
	}

}
