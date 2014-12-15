
public class HochPrio implements FPlugin {

	String name;
	
	public HochPrio(String name){
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
		System.out.println("-- Zeiplaner Framework beendet --");
		System.exit(0);
	}
	
}
