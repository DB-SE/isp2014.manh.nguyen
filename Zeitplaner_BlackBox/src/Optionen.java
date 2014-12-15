import java.util.*;


public class Optionen implements OptionInterface {

	public void createOptionen(ArrayList<Plugin> plugins) {
		for(int i = 0; i<plugins.size(); i++){
			System.out.println("'" + i + "'" + " fuer "+ plugins.get(i).getName());			
		}
		
		System.out.println("Auswahl der Optionen:");
	
		int eingabe;
		Scanner sc = new Scanner(System.in);
		eingabe = sc.nextInt();
		
		if (eingabe >= plugins.size())
			System.err.println("Falsche Eingabe");
		else
		
			plugins.get(eingabe).getPlugin();
	}
	
	public void createFOptionen(ArrayList<FPlugin> plugins) {
		for(int i = 0; i<plugins.size(); i++){
			System.out.println("'" + i + "'" + " fuer "+ plugins.get(i).getName());
			
		}
		
		System.out.println("Auswahl der Optionen:");
	
		int eingabe;
		Scanner sc = new Scanner(System.in);
		eingabe = sc.nextInt();
		
		if (eingabe >= plugins.size())
			System.err.println("Falsche Eingabe");
		else
		
			plugins.get(eingabe).print();
	}
	

//	Plugin Kalender;
//	private  Kalender kalender;
	//private static Notizen notizen;
	
//	public int createOptionen(ArrayList<Plugin> plugins) {
//		
//		for(int i = 0; i<plugins.size(); i++){
//			System.out.println(i + " -> " + plugins.get(i).getName());
//			
//		}
//		
//		System.out.println("Auswahl der Optionen:");
//		
//		if(plugins.get(eingabeO()).isSelected() == true){
//			plugins.get(eingabeO()).plOption(eingabeO());
//		}
//		
//		return eingabeO();
//
//	}
//	
//	public int eingabeO(){
//		Scanner sEingabe = new Scanner(System.in);
//		int iEingabe = sEingabe.nextInt();
//		sEingabe.reset();
//			
//		return iEingabe;
//	}
//
//	public void runFeature(int eingabe){
//		System.out.println("Run Eingabe");
////		
////		if(eingabe == kalender.getKID()){
//			createOptionen(Kalender.createPLOptionen());
////		}
////		 
////		else if(eingabe == notizen.getNID()){
////			 
////			createOptionen(notizen.createNOptionen());
////	
////		}
////	 
////	    else{
////			System.err.println("Falsche Eingabe !!!");
////			System.exit(0);
////		}
//	}
}