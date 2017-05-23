package Kermis;

public class Botsauto extends Attractie {
	double omzet = 10;
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
	int geefAantalKaartjes(){
		return aantalKaartjes;
	}
	void katchingKassa(){
		omzet += prijs;	
		aantalKaartjes++;
		super.omzet += prijs;
		super.aantalKaartjes++;
		super.setOmzet(this);
		super.setNaam(this);
		super.setAantalKaartjes(this);
	}
	
}
