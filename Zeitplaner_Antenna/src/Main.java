import java.util.*;


public class Main{
	
	private static Kalender kalender = new Kalender();
	
	//#ifdef Notizen
//@	private static Notizen notizen = new Notizen();
	//#endif
	
	public static void main(String[] args) throws Exception {
	
		System.out.println("------- Zeitplaner Antenna -------");
		System.out.println();
		System.out.println("-- Bitte Optionen auswaehlen--");
		ArrayList<String> optionen = new ArrayList<String>();
		int i = 0;
	 
		 
			optionen.add("Kalender");
			kalender.setKID(i);
			i++;
		 
			//#ifdef Notizen
//@			optionen.add("Notizen");
//@			notizen.setNID(i);
//@			i++;
			//#endif
		 
		runFeature(createOptionen(optionen));
 
	}
	
	private static int createOptionen(ArrayList<String> optionen){

		for (int i= 0; i < optionen.size();i++){
			System.out.println("'" + i + "'" + " fuer " + optionen.get(i));
    	}		
		System.out.println();
		System.out.println("Auswahl der Optionen:");
		


		if(kalender.selKalender() == true){
			kalender.kalenderOption(eingabeO());
		}
		//#ifdef Notizen
//@		if(notizen.selNotizen() == true){
//@			notizen.notizenOption(eingabeO());
//@		}
		//#endif
		
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
		//#ifdef Notizen
//@		else if(eingabe == notizen.getNID()){
//@			 
//@			createOptionen(notizen.createNOptionen());
//@			
//@		}
		//#endif
	    else{
			System.err.println("Falsche Eingabe !!!");
			System.exit(0);
		}
	}
	

}
