import java.util.*;

public class Main {

	private static Plugin  Kalender;
	
	public static void main(String[] args) {
		System.out.println("------- Zeitplaner Framework -------");
		System.out.println();
		System.out.println("-- Bitte Optionen auswaehlen--");
		
		OptionInterface option = new Optionen();
		
		ArrayList<Plugin> plugins = new ArrayList <Plugin>();
		
		Plugin Kalender = new KalenderPlugin("Kalender");
		Plugin Notizen = new Notizen("Notizen");
				
		
		plugins.add(Kalender);
		plugins.add(Notizen);
		
		option.createOptionen(plugins);

	}
	
//	public static int createOptionen_PL(ArrayList<Plugin> plugins){
//
//
//		for(int i = 0; i<plugins.size(); i++){
//			System.out.println(i + " -> " + plugins.get(i).getName());
//			
//		}
//		
//		System.out.println("Auswahl der Optionen:");
//		
////		if(plugins.get(eingabeO()).isSelected() == true){
////			plugins.get(eingabeO()).plOption(eingabeO());
////		}
//		System.out.println("createOptionen_PL ");
//		return eingabeO();
//	}
//	
//	public static int eingabeO(){
//		Scanner sEingabe = new Scanner(System.in);
//		int iEingabe = sEingabe.nextInt();
//		sEingabe.reset();
//			
//		return iEingabe;
//	}
//	
//	public static void runPL(int eingabe){
//		System.out.println("Run Eingabe");
//	//	if(eingabe == kalender.getKID()){
//			createOptionen_PL(Kalender.createPLOptionen());
//	//	}
//		//#ifdef Notizen
////		else if(eingabe == notizen.getNID()){
////			 
////			createOptionen(notizen.createNOptionen());
////			
////		}
//		//#endif
////	    else{
////			System.err.println("Falsche Eingabe !!!");
////			System.exit(0);
////		}
//	}

}
