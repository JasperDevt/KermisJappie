package Kermis;

public class Mueslikraam extends Kraampjes{
	double prijs = 9;

	void bezoek(){
		System.out.println("Iemand eet muesli bij de mueslikraam.");
		omzet =+ prijs;
		aantalKaartjes++;
		Kraampjes.totaalOmzet += this.prijs;
		Kraampjes.totaalAantalConsumpties++;
		Kraampjes.laatsteKraam = "Mueslikraam";
		Kraampjes.setLaatsteKraamConsumpties(aantalKaartjes);
		Kraampjes.setLaatsteKraamOmzet(omzet);
	}
}
