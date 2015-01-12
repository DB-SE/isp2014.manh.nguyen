/**
 * TODO description
 */
public class KalenderPlugin {

//	private static K_Monatenansicht kM = new K_Monatenansicht("Monatenansicht");
	public void getPlugin(){
	 
    	FPlugin K_Monatenansicht = new K_Monatenansicht ("Monatenansicht");
 
		 
		
//		kM.setMonat(true);
//		System.out.println(kM.getMonat());
 		kPlugins.add(K_Monatenansicht);
 		
 		
 		original();
 
	}
}