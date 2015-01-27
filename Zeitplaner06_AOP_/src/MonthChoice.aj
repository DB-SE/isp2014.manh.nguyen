

public aspect MonthChoice { 
	
	pointcut CallMonthC():
		execution(boolean K_Tagesansicht.isMonthC()) ;
	
	
	boolean around (): CallMonthC()
	{
		boolean res = true;
		 
		return res;
	}
	
 
}