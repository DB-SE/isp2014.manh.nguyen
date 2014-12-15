import java.util.*;

public class Notizen implements Plugin {
	
	String name;

	public Notizen(String name){
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public void getPlugin(){		
		System.out.println("");
		System.out.println("Notizen hat gewaehlt.");
		System.out.println("");
		System.out.println("--- Auswahl der Prioritaetoptionen ---");
		
		OptionInterface option = new Optionen();
		ArrayList<FPlugin> nPlugins = new ArrayList<FPlugin>();

		FPlugin NiedrigPrio = new NiedrigPrio ("Niedrig");
		FPlugin MittelPrio = new MittelPrio ("Mittel");
		FPlugin HochPrio = new HochPrio ("Hoch");

		nPlugins.add(NiedrigPrio);
		nPlugins.add(MittelPrio);
		nPlugins.add(HochPrio);
		
		option.createFOptionen(nPlugins);

	}
}
