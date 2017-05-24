package Kermis;

public class Kraampjes {
	protected static double totaalOmzet;
	protected static int totaalAantalConsumpties;
	protected static String laatsteKraam;
	protected static double omzetKraampje;
	protected static int aantalConsumptiesKraampje;
	double prijs;
	double omzet;
	int aantalKaartjes;
	
	
	static void geefTotaalOmzet(){
		System.out.println("De totale omzet van alle kraampjes is: " + totaalOmzet + ".");
	}
	
	static void geefTotaalAantalConsumpties(){
		System.out.println("Het totaal aantal consumpties van de kraampjes is: " + totaalAantalConsumpties + ".");
	}
	static void setLaatsteKraamOmzet(double omzet){
		omzetKraampje = omzet;
	}
	static void setLaatsteKraamConsumpties(int aantalKaartjes){
		aantalConsumptiesKraampje = aantalKaartjes;
	}
	static void getAantalConsumptiesKraampje(){
		System.out.println("Het aantal consumpties van " + laatsteKraam + " is: " + aantalConsumptiesKraampje);
	}
	static void getLaatsteKraamOmzet(){
		System.out.println("De omzet van " + laatsteKraam + " is: " + omzetKraampje);
	}
}
