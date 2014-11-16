package main;

import java.util.*;

import features.Kalender;
import features.Notizen;

public class Main{
	
	private static Konfigurationen Konfig = new Konfigurationen();
	private static Kalender kalender = new Kalender();
	private static Notizen notizen = new Notizen();
	static String arg;	

	public static void main(String[] args) throws Exception {
	
		System.out.println("------- Zeitplaner Version 1.0 -------");
		System.out.println();
		System.out.println("-- Optionen auswaehlen--");
		ArrayList<String> optionen = new ArrayList<String>();
		int i = 0;
		
		if (args == null || args.length == 0) {
			System.out.println("Bitte geben Sie der folgenden Argumente ein: ");
			System.out.println("Kalender, Notizen ... ");
			System.exit(0);
		} 
		else {
			
		konfigAnalyse(args);
		if(Konfig.getKalender()){
			optionen.add("Kalender");
			kalender.setKID(i);
			i++;
		}
		if(Konfig.getNotizen()){
			optionen.add("Notizen");
			notizen.setNID(i);
			i++;
		}
		runFeature(createOptionen(optionen));	
		}		
	}
	
	private static int createOptionen(ArrayList<String> optionen){
		
		for (int i= 0; i < optionen.size();i++){
			System.out.println("'" + i + "'" + " für " + optionen.get(i));
		}		
		System.out.println();
		System.out.println("Auswahl des Optionen:");
		
		
		if(kalender.selKalender() == true){
			kalender.kalenderOption(eingabeO());
		}
		else if(notizen.selNotizen() == true){
			notizen.notizenOption(eingabeO());
		}
		
		return eingabeO();
	}
	
	public static int eingabeO(){
		Scanner sEingabe = new Scanner(System.in);
		int iEingabe = sEingabe.nextInt();
		sEingabe.reset();
		return iEingabe;
	}
	
	private static void runFeature(int eingabe){
		
		if(eingabe == kalender.getKID()){
			createOptionen(kalender.createKOptionen());
		}
		else if(eingabe == notizen.getNID()){
			createOptionen(notizen.createNOptionen());
		}
	    else{
			System.err.println("Falsche Eingabe !!!");
			System.exit(0);
		}
	}
	
	private static void konfigAnalyse(String[] args) {
		
		if (args.length != 0) {			
			for (int i = 0; i < args.length; i++) {
			 arg = args[i];
				if (arg.equalsIgnoreCase("Kalender"))
					Konfig.setKalender(true);
				else if (arg.equalsIgnoreCase("Notizen"))
					Konfig.setNotizen(true);
				
				else{
					System.err.print("==== Falsche Argumente ====");
					System.err.print("==== Argumente: Kalender Notizen ... ====");
				    System.exit(0);
				}
			}
		}
	}	
}