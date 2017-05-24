package Kermis;

public class Attractie {
	static double omzet;
	static int aantalKaartjes;
	static double attomzet;
	static int attaantalkaartjes;
	static String naam;
	double prijs;	
	int nummer;
	int geefNummer(){
		return nummer;
	}
	String geefNaam(){
		return naam;
	}
	public double geefOmzet(){
		System.out.print("De totale omzet bedraagt: ");
		return omzet;
	}
	public int geefAantalKaartjes(){
		System.out.print("Het totaal aantal verkochte kaartjes: ");
		return aantalKaartjes;
	}
	
	double geefSubOmzet(){
		System.out.print("De omzet van de attractie " + geefNaam() + " is: ");
		return attomzet;
	}
	int geefSubAantalKaartjes(){
		System.out.print("Het aantal verkochte kaartjes van de attractie " + geefNaam() + " is: ");
		return attaantalkaartjes;
	}
	//////////
	void noemAttractie(){
		System.out.println("U bent nu bij de attractie: " + geefNaam() + " met nummer " + geefNummer());
	}
	void noemNietAttractie(){
		System.out.println("U bent niet bij de attractie: " + geefNaam() + " met nummer " + geefNummer());
	}
	void katchingKassa(){
		omzet += prijs;
		aantalKaartjes++;
	}
	void setOmzet(Attractie sub){
		this.attomzet = sub.geefOmzet();
	}
	void setNaam (Attractie sub){
		this.naam = sub.geefNaam();
	}
	void setAantalKaartjes(Attractie sub){
		this.attaantalkaartjes = sub.geefAantalKaartjes();
	}
}
