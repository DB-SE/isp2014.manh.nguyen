 
public class K_Monatenansicht implements FPlugin {

	String name;
//	private boolean selMonat;
	
	public K_Monatenansicht(String name){
		this.name = name;
		//selMonat;
	}
	public String getName() {
		return this.name;
	}
	public boolean isSelected(String name) {
		return name.equalsIgnoreCase(this.name);
	}

	
//	public void setMonat(boolean selMonat){
//		this.selMonat = selMonat;
//	}
//	
//	public boolean getMonat(){
//		return selMonat ;
//	}
	
	public void print() {
//		System.out.println(this.selMonat);
//		if(this.selMonat == true){
		
		System.out.println("Monatenansicht hat gewaehlt.");
		
//		}
		
//		else{
//			System.out.println("Monatenansicht ist nicht moeglich");
//		}
		
		System.out.println();
		System.out.println("-- Zeiplaner FOP beendet --");
		System.exit(0);
		
	}
	
}
