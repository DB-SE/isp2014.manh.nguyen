import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
 
 

public aspect Uhrzeit {
//	final String featureName = "Tagesansicht";
//
//// 
//	private pointcut k_Optionen(ArrayList<String[]> features):
//		execution(public static void Main.addFOptions(ArrayList<String[]>)) && args(features);
//	
//	
//	void around(ArrayList<String[]> features): k_Optionen(features){
//		proceed(features);
//		String fList[] = {"Tagesansicht","Kalender"};
//		
//		features.add(fList);
//		
//	}
//	
// 
//	
//	
//	private pointcut setT(ArrayList<String[]> zeit):
//		execution(public static void Main.setTime(ArrayList<String[]>)) && args(zeit);
//	
//	
//	void around(ArrayList<String[]> zeit): setT(zeit){
//		
//		proceed(zeit);
//		String zeitT[] = {"true",""};
//		
//		zeit.add(zeitT);
//		
////		zeit.add(1);
////
////		 
////		System.out.println(zeit);
////		proceed(zeit);
//		 
//		
//	}
//	
//	 
//	
//	private pointcut runF(String feature):
//		call(public static void Main.runFeature(String)) && args(feature);
//	
//	after(String feature): runF(feature){
//		if(feature.equals(featureName)){
//	 
//			K_Tagesansicht tag = new K_Tagesansicht();
//			tag.print();
//		}
//	}
	
//	private pointcut guiU():
//		execution(public void K_Tagesansicht.gui());
//	
//	void around(): guiU(){
	 
//		proceed();
//		
//	    SimpleDateFormat formatter = new SimpleDateFormat ("dd.MM.yyyy 'um' HH:mm:ss ");
//	  		Date currentTime = new Date();
//
//	  	    JPanel time = new JPanel();
//	  	    time.add(new JLabel("Datum und Zeit : " + formatter.format(currentTime)));
//	  	    add(BorderLayout.NORTH, time);
	 
//	}
	 
}