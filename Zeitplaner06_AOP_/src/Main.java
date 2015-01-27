import java.util.*;

public class Main {


	
	static ArrayList<String> options = new ArrayList<String>();
	static ArrayList<String[]> featureOptions = new ArrayList<String[]>();
	 

	public static void addOptions(ArrayList<String> options){
		 
	}
	
	public static void addFOptions(ArrayList<String[]> features){
		 
	}
	
 
	public static void runFeature(String feature){
		 
	}
	
	static int c = 1;
	public static void main (String[] args){
		System.out.println("------- Zeitplaner AOP -------");
		System.out.println();
		System.out.println("-- Bitte Optionen auswaehlen--");
		
	
		 
		addOptions(options);
		addFOptions(featureOptions);
		
		createOption();
		
		
		
	}

	public static void createOption(){
		int counter = 0;
	 
		
		for(int i=0; i < options.size(); i++){			
			System.out.println(options.get(i));
			
			for(int j=0; j < featureOptions.size(); j++){
				
				if(featureOptions.get(j)[1] == options.get(i)){
					counter++;
					System.out.println("'" + j + "'" + " fuer " + featureOptions.get(j)[0]);
				}
			}
		}
		
		System.out.println("Auswahl der Optionen:");
		int eingabe;
		Scanner sc = new Scanner(System.in);
		eingabe = sc.nextInt();
	
		if(eingabe-1 >= featureOptions.size())
			System.err.println("Falsche Eingabe!");
		else
			runFeature(featureOptions.get(eingabe)[0]);
		
	}
	
	
}
