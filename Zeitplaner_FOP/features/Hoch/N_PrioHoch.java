/**
 * TODO description
 */
public class N_PrioHoch implements FPlugin {

	String name;
	
	public N_PrioHoch(String name){
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public boolean isSelected(String name) {
		return name.equalsIgnoreCase(this.name);
	}

	public void print() {
		System.out.println("Aufgaben muss erledigt werden (Prioritaet hoch).");
		System.out.println();
		System.out.println("-- Zeiplaner FOP beendet --");
		System.exit(0);
	}	
}
