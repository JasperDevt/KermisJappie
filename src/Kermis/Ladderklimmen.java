package Kermis;

public class Ladderklimmen extends Attractie{
	double omzet;
	int aantalKaartjes;
	double prijs = 5;
	String naam = "Ladderklimmen";
	public int nummer = 6;
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
		super.aantalKaartjes++;
		super.attOmzet(this);
		super.attNaam(this);
	}
	
}
