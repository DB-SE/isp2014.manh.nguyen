import java.util.ArrayList;

public aspect Kalender {
	private pointcut addOp(ArrayList<String> option):
		execution(public static void Main.addOptions(ArrayList<String>)) && args(option);
	
	void around(ArrayList<String> option): addOp(option){
		
		option.add("Kalender");
		proceed(option);
	}
	
//	private pointcut setT(ArrayList<String> zeit):
//	execution(public static void Main.setTime(ArrayList<String>)) && args(zeit);
//
//
//	void around(ArrayList<String> zeit): setT(zeit){
//	
//	zeit.add("true");
//
//	 
//	System.out.println(zeit);
//	proceed(zeit);
//	 
//	
//}
	
	
 
}