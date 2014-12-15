
import java.util.*;

public class Wochenansicht implements FPlugin {

	String name;
	
	public Wochenansicht(String name){
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public boolean isSelected(String name) {
		return name.equalsIgnoreCase(this.name);
	}

	public void print() {
		System.out.println("Wochenansicht hat gewaehlt.");
		System.out.println();
		System.out.println("-- Zeiplaner Framework beendet --");
		System.exit(0);
	}
	
}
