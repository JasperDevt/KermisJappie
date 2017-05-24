package Kermis;

public class Oliebollenkraam extends Kraampjes{
	double prijs = 4;

	void bezoek(){
		System.out.println("Iemand eet een oliebol bij de oliebollenkraam");
		omzet =+ prijs;
		aantalKaartjes++;
		Kraampjes.totaalOmzet += this.prijs;
		Kraampjes.totaalAantalConsumpties++;
		Kraampjes.laatsteKraam = "Oliebollenkraam";
		Kraampjes.setLaatsteKraamConsumpties(aantalKaartjes);
		Kraampjes.setLaatsteKraamOmzet(omzet);
	}
}
