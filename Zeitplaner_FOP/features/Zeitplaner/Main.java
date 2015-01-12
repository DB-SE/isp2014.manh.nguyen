import java.util.ArrayList;

public class Main {

	static ArrayList<Plugin> plugins = new ArrayList <Plugin>();
	static OptionInterface option = new Optionen();

	public static void main(String[] args) {
		System.out.println("------- Zeitplaner FOP -------");
		System.out.println();
		System.out.println("-- Bitte Optionen auswaehlen--");
		
		
		


		
		option.createOptionen(plugins);
	}
}
