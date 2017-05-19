package Kermis;

public class Attractie {
	static double omzet;
	static int aantalKaartjes;
	double prijs;
	String naam;
	int nummer;
	int geefNummer(){
		return nummer;
	}
	String geefNaam(){
		return naam;
	}
	double geefOmzet(){
		return omzet;
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
}
