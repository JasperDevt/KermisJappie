package Kermis;

public class Frietkraam extends Kraampjes{
	double prijs = 3.45;

	void bezoek(){
		System.out.println("Iemand eet een frietje bij de frietkraam");
		omzet =+ prijs;
		aantalKaartjes++;
		Kraampjes.totaalOmzet += this.prijs;
		Kraampjes.totaalAantalConsumpties++;
		Kraampjes.laatsteKraam = "Frietkraam";
		Kraampjes.setLaatsteKraamConsumpties(aantalKaartjes);
		Kraampjes.setLaatsteKraamOmzet(omzet);
	}

}
