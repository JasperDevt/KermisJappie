package Kermis;

public class Hawaii extends Attractie{
	double omzet;
	int aantalKaartjes;
	double prijs = 2.9;
	String naam = "Hawaii";
	public int nummer = 5;
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