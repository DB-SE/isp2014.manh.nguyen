import java.util.ArrayList;


public aspect Erledigt {
final String featureName = "erledigenden Aufgaben";
	
	private pointcut n_Optionen(ArrayList<String[]> features):
		execution(public static void Main.addFOptions(ArrayList<String[]>)) && args(features);
	
	
	void around(ArrayList<String[]> features): n_Optionen(features){
		proceed(features);
		String fList[] = {"erledigenden Aufgaben","Notizen"};
		
		features.add(fList);
		
	}
	
	private pointcut runF(String feature):
		call(public static void Main.runFeature(String)) && args(feature);
	
	after(String feature): runF(feature){
		if(feature.equals(featureName)){
		
			
			System.out.println("erledigenden Aufgaben und kann löschen");
  	
			System.out.println();
			System.out.println("-- Zeiplaner AOP beendet --");
			System.exit(0);
		}
	}
}