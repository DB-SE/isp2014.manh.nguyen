import java.awt.Container;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JFrame;


public aspect Tag {
	final String featureName = "Tagesansicht";
	
	private pointcut k_Optionen(ArrayList<String[]> features):
		execution(public static void Main.addFOptions(ArrayList<String[]>)) && args(features);
	
	
	void around(ArrayList<String[]> features): k_Optionen(features){
		proceed(features);
		String fList[] = {"Tagesansicht","Kalender"};
		
		features.add(fList);
		
	}
	
	
	private pointcut runF(String feature):
		call(public static void Main.runFeature(String)) && args(feature);
	
	after(String feature): runF(feature){
		if(feature.equals(featureName)){
	 
			K_Tagesansicht tag = new K_Tagesansicht();
			tag.print();
		}
	}
 
}