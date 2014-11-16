package main;


public class Konfigurationen {

	private boolean kalender = false;
	private boolean notizen = false;


	public Konfigurationen() {
		kalender = false;
		notizen = false;
	}
	
	public void setKalender(boolean kalender){
		this.kalender = kalender;
	}
	
	public boolean getKalender(){
		return kalender;
	}
		
	public void setNotizen(boolean notizen){
		this.notizen = notizen;
	}
	
	public boolean getNotizen(){
		return notizen;
	}

}