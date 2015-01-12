import java.util.ArrayList; /**
 * TODO description
 */
public   class  Main {
	

	static ArrayList<Plugin> plugins = new ArrayList <Plugin>();

	
	static OptionInterface option = new Optionen();

	

	 private static void  main__wrappee__Zeitplaner  (String[] args) {
		System.out.println("------- Zeitplaner FOP -------");
		System.out.println();
		System.out.println("-- Bitte Optionen auswaehlen--");
		
		
		


		
		option.createOptionen(plugins);
	}

	

	public static void main(String[] args) {
	
	
		Plugin Kalender = new KalenderPlugin("Kalender");	 
			

		plugins.add(Kalender);
	
	
		main__wrappee__Zeitplaner(args);
	}


}
