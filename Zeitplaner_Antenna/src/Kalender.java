

import java.util.ArrayList;

public class Kalender {

	private static int kID,tID,wID,mID,terminID;
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
		System.out.println("");
		System.out.println("Kalender hat gewaehlt.");
		
		
		ArrayList<String> listOptionen = new ArrayList<String>();
		selKalender = true;
		int i = 0;
		
		//#ifdef Ansicht
		System.out.println("--- Auswahl der Kalenderoptionen ---");
		listOptionen.add("Tagesansicht");
		tID = i; i++;
		listOptionen.add("Wochenansicht");
		wID = i; i++;
		listOptionen.add("Monatenansicht");
		mID = i; i++;
		
		//#endif
		
		//#ifdef Termin
//@		listOptionen.add("Termin-Eingabe");
//@		terminID = i; i++;
		//#endif
		
		return listOptionen;
	}
	
	public static void kalenderOption(int eingabe) {
		 

		 if(eingabe == tID){
			 //#ifdef Tag
			 System.out.println("Tagesansicht hat gewaehlt.");
			 //#else
//@		 	System.out.println("Tagesansicht ist nicht moeglich");
			 //#endif
		 }				 
		 if(eingabe == wID){
			 //#ifdef Woche
//@			 System.out.println("Wochenansicht hat gewaehlt.");
//@		 
			//#else
		 	System.out.println("Wochenansicht ist nicht moeglich");
		 	//#endif
		 }
		 
		 if(eingabe == mID){
			//#ifdef Monat
//@			 System.out.println("Monatenansicht hat gewaehlt.");
//@		
			 //#else
		 	System.out.println("Monatenansicht ist nicht moeglich");
		 	//#endif
		 }	
		 if(eingabe == terminID){
			 //#ifdef Termin
//@			 System.out.println("Termin eintragen");
			 //#endif
		 }	

		 System.out.println();
		 System.out.println("-- Zeiplaner Antenna beendet --");
		 System.exit(0);
	 }
}
