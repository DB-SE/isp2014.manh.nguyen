 

public aspect Uhrzeit {
 
		
	pointcut CallTime():
		execution(boolean K_Tagesansicht.isTime()) ;
	
	
	boolean around (): CallTime()
	{
		boolean res = true;
		 
		return res;
	}
	
 
	 
}