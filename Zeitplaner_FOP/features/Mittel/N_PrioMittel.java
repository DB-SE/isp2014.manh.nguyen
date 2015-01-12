/**
 * TODO description
 */
public class N_PrioMittel implements FPlugin {

	String name;
	
	public N_PrioMittel(String name){
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public boolean isSelected(String name) {
		return name.equalsIgnoreCase(this.name);
	}
	public void print() {
		System.out.println("Aufgaben soll erledigt werden (Prioritaet mittel).");
		System.out.println();
		System.out.println("-- Zeiplaner FOP beendet --");
		System.exit(0);
	}
	
}
