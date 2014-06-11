package com.schramm;

public class Spiel {

	private Spieler spieler1;
	private Spieler spieler2;
	private Spieler letzterSpieler;
	private Spielfeld spielfeld;
	
	public Spiel(){
		spielfeld = new Spielfeld();
	}

	public void setSpieler1(Spieler spieler1) {
		this.spieler1 = spieler1;
	}

	public void setSpieler2(Spieler spieler2) {
		this.spieler2 = spieler2;
	}
	
	public void steinSetzen(Spieler spieler, int spaltennummer) {
		spielfeld.steinSetzen(spaltennummer, spieler.getSteinfarbe());
		letzterSpieler = spieler;
		
	}
	
	public boolean hatGewonnen(Spieler spieler){
		return false;
	}
	
}
