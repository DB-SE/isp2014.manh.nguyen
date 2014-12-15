import java.util.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("------- Zeitplaner Framework -------");
		System.out.println();
		System.out.println("-- Bitte Optionen auswaehlen--");
		
		OptionInterface option = new Optionen();
		
		ArrayList<Plugin> plugins = new ArrayList <Plugin>();
		
		Plugin Kalender = new KalenderPlugin("Kalender");
		Plugin Notizen = new Notizen("Notizen");
				
		plugins.add(Kalender);
		plugins.add(Notizen);
		
		option.createOptionen(plugins);
	}

}
