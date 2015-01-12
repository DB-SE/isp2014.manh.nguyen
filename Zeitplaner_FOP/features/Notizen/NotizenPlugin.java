import java.util.ArrayList;

public class NotizenPlugin implements Plugin {
	
	String name;

	public NotizenPlugin(String name){
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	static OptionInterface option = new Optionen();
	static ArrayList<FPlugin> nPlugins = new ArrayList<FPlugin>();

	public void getPlugin(){		
		System.out.println("");
		System.out.println("Notizen hat gewaehlt.");
		System.out.println("");
		System.out.println("--- Auswahl der Prioritaetoptionen ---");
		
		
//		FPlugin NiedrigPrio = new NiedrigPrio ("Niedrig");
//		FPlugin MittelPrio = new MittelPrio ("Mittel");
//		FPlugin HochPrio = new HochPrio ("Hoch");
//
//		nPlugins.add(NiedrigPrio);
//		nPlugins.add(MittelPrio);
//		nPlugins.add(HochPrio);
		
		option.createFOptionen(nPlugins);

	}
}
