import java.util.ArrayList; 

/**
 * TODO description
 */
public   class  KalenderPlugin  implements Plugin {
	
	
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
	
	 private void  getPlugin__wrappee__Kalender  (){
		
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

	
	
	//K_Jahresansicht jahr;
 private void  getPlugin__wrappee__Jahr  (){
	 
  		FPlugin K_Jahresansicht = new K_Jahresansicht ("Jahresansicht");
 
 		//getPlugin__wrappee__Kalender();
 		kPlugins.add(K_Jahresansicht);
 
		
		getPlugin__wrappee__Kalender();

	}

	

//	private static K_Monatenansicht kM = new K_Monatenansicht("Monatenansicht");
	 private void  getPlugin__wrappee__Monat  (){
	 
    	FPlugin K_Monatenansicht = new K_Monatenansicht ("Monatenansicht");
 
		 
		
//		kM.setMonat(true);
//		System.out.println(kM.getMonat());
 		kPlugins.add(K_Monatenansicht);
 		
 		
 		getPlugin__wrappee__Jahr();
 
	}

	
	
	//K_Tagesansicht tag;
public void getPlugin(){
	 
 		FPlugin K_Tagesansicht = new K_Tagesansicht ("Tagesansicht ----- Anzeigen der Kalenderansicht");
 
		//getPlugin__wrappee__Monat();
 		kPlugins.add(K_Tagesansicht);
 
		
 		getPlugin__wrappee__Monat();

	}


}
