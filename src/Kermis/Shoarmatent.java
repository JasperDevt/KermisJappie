package Kermis;

public class Shoarmatent extends Kraampjes{
	double prijs = 5.15;

	void bezoek(){
		System.out.println("Iemand eet shoarma bij de shoarmatent.");
		omzet =+ prijs;
		aantalKaartjes++;
		Kraampjes.totaalOmzet += this.prijs;
		Kraampjes.totaalAantalConsumpties++;
		Kraampjes.laatsteKraam = "Shoarmatent";
		Kraampjes.setLaatsteKraamConsumpties(aantalKaartjes);
		Kraampjes.setLaatsteKraamOmzet(omzet);
	}
}
