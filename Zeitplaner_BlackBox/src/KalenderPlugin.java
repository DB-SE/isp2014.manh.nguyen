import java.util.*;

public class KalenderPlugin implements Plugin {
	
	private static int kID,tID,wID,mID,terminID;
	private static boolean selKalender = false;
	String name;


	public void setKID(int id){
		this.kID = id;
	}
	
	public int getKID(){
		return kID ;
	}
	
	public boolean isSelected(){
		return selKalender;
	}
	
	public KalenderPlugin(String name){
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void getPlugin(){
		
		System.out.println("");
		System.out.println("Kalender hat gewaehlt.");
		System.out.println("");
		System.out.println("--- Auswahl der Kalenderoptionen ---");
		
		OptionInterface option = new Optionen();
		ArrayList<FPlugin> kPlugins = new ArrayList<FPlugin>();

		
		
		FPlugin Tagesansicht = new Tagesansicht ("Tagesansicht");
		FPlugin Wochenansicht = new Wochenansicht ("Wochenansicht");
		FPlugin Monatensansicht = new Monatensansicht ("Monatensansicht");
		

		kPlugins.add(Tagesansicht);
		kPlugins.add(Wochenansicht);
		kPlugins.add(Monatensansicht);
		
		
		option.createFOptionen(kPlugins);

	}
	
	public  ArrayList<Plugin> createPLOptionen(){
		System.out.println("");
		System.out.println("Kalender hat gewaehlt.");
		System.out.println("");
		System.out.println("--- Auswahl der Kalenderoptionen ---");
		ArrayList<Plugin> listPlugins = new ArrayList<Plugin>();
		selKalender = true;
		int i = 0;
		
		
//		Plugin Tagesansicht = new Tagesansicht ("Tagesansicht");
////		Plugin Notizen = new Notizen("Notizen");
////		Plugin Notizen = new Notizen("Notizen");
//		
//		listPlugins.add(Tagesansicht);
//		tID = i; i++;
		
//		listPlugins.add(Wochenansicht);
//		wID = i; i++;
//		listPlugins.add(Monatenansicht);
//		mID = i; i++;
//		
//		listPlugins.add(Termin-Eingabe);
//		terminID = i; i++;

		
		return listPlugins;
	}
	

	public  void plOption(int eingabe) {

		 if(eingabe == tID){	
			 System.out.println("Tagesansicht hat gewaehlt.");
		 }				 
//		 if(eingabe == wID){	 
//		 	System.out.println("Wochenansicht ist nicht moeglich");		 
//		 }
//		 
//		 if(eingabe == mID){			
//			 System.out.println("Monatenansicht hat gewaehlt.");		
//		 }	
//		 if(eingabe == terminID){
//			 System.out.println("Termin eintragen");
//		 }	

		 System.out.println();
		 System.out.println("-- Zeiplaner Antenna beendet --");
		 System.exit(0);
	 }
	
//	public void showFeature() {
//		
//	}
	
	
}
