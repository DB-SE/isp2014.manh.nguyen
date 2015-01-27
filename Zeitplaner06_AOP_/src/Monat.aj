import java.util.ArrayList;


public aspect Monat {
	final String featureName = "Monatenansicht";
	
	private pointcut k_Optionen(ArrayList<String[]> features):
		execution(public static void Main.addFOptions(ArrayList<String[]>)) && args(features);
	
	
	void around(ArrayList<String[]> features): k_Optionen(features){
		proceed(features);
		String fList[] = {"Monatenansicht","Kalender"};
		
		features.add(fList);
		
	}
	
	
	private pointcut runF(String feature):
		call(public static void Main.runFeature(String)) && args(feature);
	
	after(String feature): runF(feature){
		if(feature.equals(featureName)){
		
			
			System.out.println(featureName + " hat gewaehlt.");
  	
			System.out.println();
			System.out.println("-- Zeiplaner AOP beendet --");
			System.exit(0);
		}
	}
}