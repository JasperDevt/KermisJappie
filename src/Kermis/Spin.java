package Kermis;

public class Spin extends Attractie{
	double omzet;
	int aantalKaartjes;
	double prijs = 2.25;
	String naam = "Spin";
	public int nummer = 2;
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
