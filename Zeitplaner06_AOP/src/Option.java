import java.util.ArrayList; 
import java.util.Scanner; 


 


class  Optionen  implements OptionInterface {
	

	public void createOptionen(ArrayList<Plugin> plugins) {
		for(int i = 0; i<plugins.size(); i++){
			System.out.println("'" + i + "'" + " fuer "+ plugins.get(i).getName());			
		}		
		System.out.println("Auswahl der Optionen:");
	
		int eingabe;
		Scanner sc = new Scanner(System.in);
		eingabe = sc.nextInt();
		
		if (eingabe >= plugins.size())
			System.err.println("Falsche Eingabe");
		else
		
			plugins.get(eingabe).getPlugin();
	}

	
	
	public void createFOptionen(ArrayList<FPlugin> plugins) {
		for(int i = 0; i<plugins.size(); i++){
			System.out.println("'" + i + "'" + " fuer "+ plugins.get(i).getName());
			
		}		
		System.out.println("Auswahl der Optionen:");
	
		int eingabe;
		Scanner sc = new Scanner(System.in);
		eingabe = sc.nextInt();
		
		if (eingabe >= plugins.size())
			System.err.println("Falsche Eingabe");
		else		
			plugins.get(eingabe).print();
	}


}
