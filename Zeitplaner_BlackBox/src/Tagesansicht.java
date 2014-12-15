
public class Tagesansicht implements FPlugin {

	String name;
	
	public Tagesansicht(String name){
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public boolean isSelected(String name) {
		return name.equalsIgnoreCase(this.name);
	}

	public void print() {
		System.out.println("Tagesansicht hat gewaehlt.");
		System.out.println();
		System.out.println("-- Zeiplaner Framework beendet --");
		System.exit(0);
	}
	
}
