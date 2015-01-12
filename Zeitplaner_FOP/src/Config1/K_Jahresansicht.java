
public  class  K_Jahresansicht  implements FPlugin {
	

	String name;

	
	
	public K_Jahresansicht(String name){
		this.name = name;
	}

	
	public String getName() {
		return this.name;
	}

	
	public boolean isSelected(String name) {
		return name.equalsIgnoreCase(this.name);
	}

	

	public void print() {
		System.out.println("Jahresansicht hat gewaehlt.");
		System.out.println();
		System.out.println("-- Zeiplaner FOP beendet --");
		System.exit(0);
	}


}
