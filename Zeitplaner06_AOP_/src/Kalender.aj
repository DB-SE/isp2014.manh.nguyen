import java.util.ArrayList;

public aspect Kalender {
	private pointcut addOp(ArrayList<String> option):
		execution(public static void Main.addOptions(ArrayList<String>)) && args(option);
	
	void around(ArrayList<String> option): addOp(option){
		
		option.add("Kalender");
		proceed(option);
	}
 
	 
}