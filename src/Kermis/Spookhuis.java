package Kermis;

public class Spookhuis extends Attractie {
	double omzet;
	int aantalKaartjes;
	double prijs = 3.2;
	String naam = "Spookhuis";
	public int nummer = 4;
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