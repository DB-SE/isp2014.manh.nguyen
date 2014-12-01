

import java.util.ArrayList;

public class Notizen {

	private static int nID,prioNID,prioMID,prioHID;
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
		
		ArrayList<String> listOptionen = new ArrayList<String>();
		selNotizen = true;
		int i = 0;
		
		//#ifdef Prioritaet
//@		System.out.println("--- Auswahl der Notizenoptionen ---");
//@		listOptionen.add("Niedrig");
//@		prioNID = i; i++;
//@		listOptionen.add("Mittel");
//@		prioMID = i; i++;
//@		listOptionen.add("Hoch");
//@		prioHID = i; i++;
		//#endif
		
		return listOptionen;
	}
	
	public static void notizenOption(int eingabe) {
		 
		 if(eingabe == prioNID){
			//#ifdef Niedrig
//@			 System.out.println("Aufgaben kann erledigt werden (Prioritaet niedrig).");
			//#else
		 	System.out.println("Diese Prioritaet ist nicht moeglich");
			//#endif
		 }
		 else if(eingabe == prioMID){
			//#ifdef Mittel
//@			 System.out.println("Aufgaben soll erledigt werden (Prioritaet mittel).");
			//#else
			 	System.out.println("Diese Prioritaet ist nicht moeglich");
			//#endif
		 }
		 else if(eingabe == prioHID){
			//#ifdef Hoch
//@			 System.out.println("Aufgaben muss erledigt werden (Prioritaet hoch).");
			//#else
			System.out.println("Diese Prioritaet ist nicht moeglich");
			//#endif
		 }
		
		 System.out.println();
		 System.out.println("-- Zeiplaner Antenna beendet --");
		 System.exit(0);
	 }
	
}
