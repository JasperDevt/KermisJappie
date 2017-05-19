package Kermis;

public class Attractie {
	static double omzet;
	static int aantalKaartjes;
	static double attomzet;
	static String naam;
	double prijs;	
	int nummer;
	int geefNummer(){
		return nummer;
	}
	String geefNaam(){
		return naam;
	}
	double geefOmzet(){
		System.out.print("De totale omzet bedraagt: ");
		return omzet;
	}
	int geefAantalKaartjes(){
		System.out.print("Het totaal aantal verkochte kaartjes: ");
		return aantalKaartjes;
	}
	
	double geefKOmzet(){
		System.out.print("De lokale omzet van de attractie " + geefNaam() + " is: ");
		return attomzet;
	}
	//////////
	void noemAttractie(){
		System.out.println("U bent bij de attractie: " + geefNaam() + " met nummer " + geefNummer());
	}
	void noemNietAttractie(){
		System.out.println("U bent niet bij de attractie: " + geefNaam() + " met nummer " + geefNummer());
	}
	void katchingKassa(){
		omzet += prijs;
		aantalKaartjes++;
	}
	void attOmzet(Attractie att){
		this.attomzet = att.geefOmzet();
	}
	void attNaam (Attractie att){
		this.naam = att.geefNaam();
	}
}
