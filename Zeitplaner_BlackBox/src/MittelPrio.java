
public class MittelPrio implements FPlugin {

	String name;
	
	public MittelPrio(String name){
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
		System.out.println("-- Zeiplaner Framework beendet --");
		System.exit(0);
	}
	
}
