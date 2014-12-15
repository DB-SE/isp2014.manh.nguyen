import java.util.*;

public class KalenderPlugin implements Plugin {
	
	String name;

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
}
