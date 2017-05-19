package Kermis;

public class Spiegelpaleis extends Attractie{
	double omzet;
	int aantalKaartjes;
	double prijs = 2.75;
	String naam = "Spiegelpaleis";
	public int nummer = 3;
	int geefNummer(){
		return nummer;
	}
	String geefNaam(){
		return naam;
	}
	double geefOmzet(){
		return omzet;
	}
	void katchingKassa(){
		omzet += prijs;
		aantalKaartjes++;
		super.omzet += prijs;
		super.aantalKaartjes += aantalKaartjes;
	}
}
