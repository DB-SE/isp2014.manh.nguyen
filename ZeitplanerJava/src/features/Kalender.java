package features;

import java.util.ArrayList;

public class Kalender {

	private static int kID, tID, wID, mID;
	private static boolean selKalender = false;
	
	public Kalender(){
		//System.out.println("--- Kalenderansichten ---");
	}
	
	public void setKID(int id){
		this.kID = id;
	}
	
	public int getKID(){
		return kID ;
	}
	
	public boolean selKalender(){
		return selKalender;
	}
	
	public static ArrayList<String> createKOptionen(){
		System.out.println("Kalender hat gewaehlt.");
		System.out.println("--- Auswahl des Kalenderansichten ---");
		ArrayList<String> listOptionen = new ArrayList<String>();
		selKalender = true;
		int i = 0;
		listOptionen.add("Tagesansicht");
		tID = i; i++;
		listOptionen.add("Wochenansicht");
		wID = i; i++;
		listOptionen.add("Monatenansicht");
		mID = i; i++;
		
		return listOptionen;
	}
	
	public static void kalenderOption(int eingabe){
		 
		 if(eingabe == tID){
			 System.out.println("Tagesansicht hat gewaehlt.");
		 }
		 else if(eingabe == wID){
			 System.out.println("Wochenansicht hat gewaehlt.");
		 }
		 else if(eingabe == mID){
			 System.out.println("Monatenansicht hat gewaehlt.");
		 }
		 else{
				System.err.println("Falsche Eingabe !!!");
				System.exit(0);
			}
		 System.out.println();
		 System.out.println("-- Zeiplaner Version 1.0 beendet --");
		 System.exit(0);
	 }
}
