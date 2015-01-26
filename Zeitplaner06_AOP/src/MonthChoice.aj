import java.util.ArrayList;


public aspect MonthChoice {
//	final String name = "Tagesansicht mit Monatenauswahl";
//
//	 
//	private pointcut k_Optionen(ArrayList<String[]> features):
//		execution(public static void Main.addFeatures(ArrayList<String[]>)) && args(features);
//	
//	
//	void around(ArrayList<String[]> features): k_Optionen(features){
//		proceed(features);
//		String featureArray[] = {"Tagesansicht mit Monatenauswahl","Kalender"};
//		
//		features.add(featureArray);
//		
//	}
//	
// 
//	
//	
//	private pointcut setMC(ArrayList<String[]> monthC):
//		execution(public static void Main.monthChoice(ArrayList<String[]>)) && args(monthC);
//	
//	
//	void around(ArrayList<String[]> monthC): setMC(monthC){
//		
//		proceed(monthC);
//		String monthCH[] = {"true",""};
//		
//		monthC.add(monthCH);
//
//		
//	}
//	
//	 
//	
//	private pointcut executeT(String feature):
//		call(public static void Main.executeFeature(String)) && args(feature);
//	
//	after(String feature): executeT(feature){
//		if(feature.equals(name)){
//	 
//			K_Tagesansicht tag = new K_Tagesansicht();
//			tag.print();
//		}
//	}
}