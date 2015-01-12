import java.util.ArrayList;

public class KalenderPlugin implements Plugin {
	
	String name;

	public KalenderPlugin(String name){
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	
	static OptionInterface option = new Optionen();
	static ArrayList<FPlugin> kPlugins = new ArrayList<FPlugin>(); 
	

//	static FPlugin K_Monatenansicht = new K_Monatenansicht ("Monatensansicht");
	
	public void getPlugin(){
		
		System.out.println("");
		System.out.println("Kalender hat gewaehlt.");
		System.out.println("");
		System.out.println("--- Auswahl der Kalenderoptionen ---");
		
		
		
//		FPlugin K_Tagesansicht = new K_Tagesansicht ("Tagesansicht");		
//		FPlugin K_Monatenansicht = new K_Monatenansicht ("Monatensansicht");
//		FPlugin K_Jahresansicht = new K_Jahresansicht ("Jahresansicht");
		
//		kPlugins.add(Tagesansicht);
//		kPlugins.add(Wochenansicht);
//		kPlugins.add(Monatensansicht);
		
		option.createFOptionen(kPlugins);

	}
}