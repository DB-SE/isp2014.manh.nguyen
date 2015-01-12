/**
 * TODO description
 */
public class N_PrioNiedrig implements FPlugin {

	String name;
	
	public N_PrioNiedrig(String name){
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public boolean isSelected(String name) {
		return name.equalsIgnoreCase(this.name);
	}

	public void print() {
		System.out.println("Aufgaben kann erledigt werden (Prioritaet niedrig).");
		System.out.println();
		System.out.println("-- Zeiplaner Framework beendet --");
		System.exit(0);
	}	
}
 