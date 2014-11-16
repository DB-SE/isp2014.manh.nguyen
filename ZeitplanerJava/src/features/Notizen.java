package features;

import java.util.ArrayList;

public class Notizen {

	private static int nID, prioNID, prioMID, prioHID;
	private static boolean selNotizen = false;
	
	public Notizen(){
		//System.out.println("--- Notizen ---");
	}
	public void setNID(int id){
		this.nID = id;
	}
	
	public int getNID(){
		return nID ;
	}
	
	public boolean selNotizen(){
		return selNotizen;
	}
	
	public static ArrayList<String> createNOptionen(){
		System.out.println("Notizen hat gewaehlt.");
		System.out.println("--- Auswahl der Prioritäten ---");
		ArrayList<String> listOptionen = new ArrayList<String>();
		selNotizen = true;
		int i = 0;
		listOptionen.add("Niedrig");
		prioNID = i; i++;
		listOptionen.add("Mittel");
		prioMID = i; i++;
		listOptionen.add("Hoch");
		prioHID = i; i++;
		
		return listOptionen;
	}
	
	public static void notizenOption(int eingabe) {
		 
		 if(eingabe == prioNID){
			 System.out.println("Aufgaben kann erledigt werden (Priorität niedrig).");
		 }
		 else if(eingabe == prioMID){
			 System.out.println("Aufgaben soll erledigt werden (Priorität mittel).");
		 }
		 else if(eingabe == prioHID){
			 System.out.println("Aufgaben muss erledigt werden (Priorität hoch).");
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
