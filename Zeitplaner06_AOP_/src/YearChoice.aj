
public aspect YearChoice {


	
	pointcut CallYearC():
		execution(boolean K_Tagesansicht.isYearC()) ;
	
	
	boolean around (): CallYearC()
	{
		boolean res = true;
		 
		return res;
	}
}