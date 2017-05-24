package Kermis;

import java.util.Scanner;

public class Kermis1 {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		Attractie start = new Attractie();
		Botsauto botsauto = new Botsauto();
		Spin spin = new Spin();
		Spiegelpaleis spiegelpaleis = new Spiegelpaleis();
		Spookhuis spookhuis = new Spookhuis();
		Hawaii hawaii = new Hawaii();
		Ladderklimmen ladderklimmen = new Ladderklimmen();
		
		Oliebollenkraam oliebollenkraam = new Oliebollenkraam();
		Frietkraam frietkraam = new Frietkraam();
		Mueslikraam mueslikraam = new Mueslikraam();
		Shoarmatent shoarmatent = new Shoarmatent();

		boolean stoppen = false;
		System.out.println("Welkom bij de kermis! Geef een getal tussen de 1 en de 6 om een attractie te bezoeken. Kies o voor omzet en k voor het aantal kaartjes van de attracties. Kies respectievelijk ok en c voor de omzet van de kraampjes en het aantal consumpties. Om te stoppen typ stoppen.");
		while(!stoppen){
			String input = sc.next();
			switch(input){
			case "1": botsauto.noemAttractie();botsauto.katchingKassa(); break;
			case "2": spin.noemAttractie();spin.katchingKassa(); break;
			case "3": spiegelpaleis.noemAttractie();spiegelpaleis.katchingKassa(); break;
			case "4": spookhuis.noemAttractie();spookhuis.katchingKassa(); break;
			case "5": hawaii.noemAttractie();hawaii.katchingKassa(); break;
			case "6": ladderklimmen.noemAttractie();ladderklimmen.katchingKassa(); break;
			case "11": oliebollenkraam.bezoek();break;
			case "22": frietkraam.bezoek();break;
			case "33": mueslikraam.bezoek();break;
			case "44": shoarmatent.bezoek();break;
			case "stoppen": stoppen = true; break;
			case "o": System.out.println(start.geefOmzet()); System.out.println(start.geefSubOmzet()); break;
			case "k": System.out.println(start.geefAantalKaartjes()); System.out.println(start.geefSubAantalKaartjes()); break;
			case "ok": Kraampjes.geefTotaalOmzet();Kraampjes.getLaatsteKraamOmzet();break;
			case "c": Kraampjes.geefTotaalAantalConsumpties();Kraampjes.getAantalConsumptiesKraampje();break;
			default: System.out.println("Word niet herkent! Geef een getal tussen de 1 en de 6 om een attractie te bezoeken. Kies o voor omzet en k voor het aantal kaartjes van de attracties. Kies respectievelijk ok en c voor de omzet van de kraampjes en het aantal consumpties. Om te stoppen typ stoppen.");
			}
		}		
	}
}
///////// Weekopdracht
//Weekopdracht 2 - Kermis
//Je gaat een programma maken dat de omzet van een Kermis bijhoudt.
//De Kermis heeft een zestal attracties, die zijn allemaal subclasse van een klasse Attractie.
//Zodra het programma start kan er een getal worden ingegeven, 1 voor botsauto's, 2 voor spin, 3 voor spiegelpaleis, 4 voor spookhuis, 5 voor hawaii, 6 voor ladderklimmen.
//botsauto		- 1
//spin			- 2
//spiegelpaleis	- 3
//spookhuis		- 4
//hawaii		- 5
//ladderklimmen	- 6
//
//MAKKELIJK: Zorg dat het bovenstaande stabiel werkt en dat iedere keer dat het getal wordt ingegeven er getoond wordt welke attractie draait.
//
//MIDDEL: Botsauto's kosten 2.50, Spin 2.25, Spiegelpaleis 2.75, spookhuis 3.20, hawaii 2.90 en ladderklimmen 5.00. Houdt bij hoeveel omzet elke attractie draait, en hoeveel de omzet van de hele attractieafdeling is. 
//Ook willen we weten hoe vaak er kaartjes per attractie zijn gekocht, en natuurlijk voor de attracties in het totaal.
//Met de invoer van de letter "o" zien we de omzet. Met de invoer van de letter "k" zien we het aantal kaartjes.
//Denk na in welke class gegevens opgeslagen moeten worden en maak hiervoor onderscheid tussen het gebruik van instance variabelen en class variabelen. 
//
//MOEILIJK: Maak een Klasse erbij, te weten Voedselkraampjes, Met de getallen 11 voor oliebollenkraam a 4.00 per consumptie, 22 voor frietkraam a 3.45 per consumptie, 33 voor mueslikraam a 9.00 per consumptie en 44 voor shoarmatent a 5.15 per consumptie.
//11 voor oliebollenkraam 		a 4.00 per consumptie
//22 voor frietkraam 			a 3.45 per consumptie
//33 voor mueslikraam 			a 9.00 per consumptie
//44 voor shoarmatent 			a 5.15 per consumptie.
//
//Zorg dat je de omzet en het aantal aankopen overzichtelijk maakt.
//Gebruik encapsulation voor het aanpassen van de class variabelen.
//
//Belangrijk: 
//Het is belangrijker dat je een logisch werkend programma maakt, dan dat je een kermis oplevert hoe een kermis hoort te zijn.
//Mocht een uitdaging niet lukken om te realiseren, dan heb je 3 mislukte pogingen gemaild.
//
//De weekopdracht wordt ingeleverd voor Maandag 23 Januari om 9.30 uur bij de beide email-adressen:
//Cor.Faber@gmail.com
//JasperHolshuijsen@gmail.com
//
//LET WEL:
//Hetgeen dat je mailt is een link naar je repository !!!
//De code moet op je repository op GitHub staan.
//
//Je gaat een programma maken dat de omzet van een Kermis bijhoudt.
//De Kermis heeft een zestal attracties, die zijn allemaal subclasse van een klasse Attractie.
//Zodra het programma start kan er een getal worden ingegeven, 1 voor botsauto's, 2 voor spin, 3 voor spiegelpaleis, 4 voor spookhuis, 5 voor hawaii, 6 voor ladderklimmen.
//botsauto		- 1
//spin			- 2
//spiegelpaleis	- 3
//spookhuis		- 4
//hawaii		- 5
//ladderklimmen	- 6
//
//MAKKELIJK: Zorg dat het bovenstaande stabiel werkt en dat iedere keer dat het getal wordt ingegeven er getoond wordt welke attractie draait.
//Er moet overriding in staan!
//MIDDEL: Botsauto's kosten 2.50, Spin 2.25, Spiegelpaleis 2.75, spookhuis 3.20, hawaii 2.90 en ladderklimmen 5.00. Houdt bij hoeveel omzet elke attractie draait, en hoeveel de omzet van de hele attractieafdeling is. 
//Ook willen we weten hoe vaak er kaartjes per attractie zijn gekocht, en natuurlijk voor de attracties in het totaal.
//Met de invoer van de letter "o" zien we de omzet. Met de invoer van de letter "k" zien we het aantal kaartjes.
//Denk na in welke class gegevens opgeslagen moeten worden en maak hiervoor onderscheid tussen het gebruik van instance variabelen en class variabelen. 
//MOEILIJK: Maak een Klasse erbij, te weten Voedselkraampjes, Met de getallen 11 voor oliebollenkraam a 4.00 per consumptie, 22 voor frietkraam a 3.45 per consumptie, 33 voor mueslikraam a 9.00 per consumptie en 44 voor shoarmatent a 5.15 per consumptie.
//Zorg dat je de omzet en het aantal aankopen overzichtelijk maakt.
//Gebruik encapsulation voor het aanpassen van de class variabelen.
//
//&
//
//Verzin  een programma voor week 3
//Gebruikmakend van alle behandelde onderwerpen
//vb Levend stratego, tour de france (random voor etappe uitslagen, ploegen etc)