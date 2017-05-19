package Kermis;

public class Botsauto extends Attractie {
	double omzet;
	int aantalKaartjes;
	double prijs = 2.5;
	String naam = "Botsauto";
	public int nummer = 1;
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
