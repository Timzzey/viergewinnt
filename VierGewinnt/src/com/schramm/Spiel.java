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
	
	public void steinSetzen(Spieler spieler, int spaltennummer) throws DuplicateMoveException {
		if (spieler != letzterSpieler) {
			spielfeld.steinSetzen(spaltennummer, spieler.getSteinfarbe());
			letzterSpieler = spieler;
		} else {
			throw new DuplicateMoveException();
		}
	}
	
	public boolean hatGewonnen(Spieler spieler){
		boolean siegInSpalte = testeSiegInSpalte(spieler);
		boolean siegInReihe = testeSiegInReihe(spieler);
		return siegInSpalte || siegInReihe;
	}

	private boolean testeSiegInSpalte(Spieler spieler) {
		for (int spaltennummer = 1; spaltennummer <= Spielfeld.ANZAHL_SPALTEN; spaltennummer++) {
			int sequenceCounter = 0;
			for (int reihennummer = 1; reihennummer <= Spielfeld.ANZAHL_REIHEN; reihennummer++) {
				Stein steinfarbe = spielfeld.getSteinfarbe(spaltennummer, reihennummer);
				if (steinfarbe == null) break;
				if (steinfarbe.equals(spieler.getSteinfarbe())) {
					sequenceCounter++;
					if (sequenceCounter >= 4) return true;
				} else {
					sequenceCounter = 0;
				}
			}
		}
		return false;
	}
	private boolean testeSiegInReihe(Spieler spieler) {
		for (int reihennummer = 1; reihennummer <= Spielfeld.ANZAHL_REIHEN; reihennummer++){
			int sequenceCounter = 0;
			for (int spaltennummer = 1; spaltennummer <= Spielfeld.ANZAHL_SPALTEN; spaltennummer++){
				Stein steinfarbe = spielfeld.getSteinfarbe(spaltennummer, reihennummer);
				if (steinfarbe == null) break;
				if (steinfarbe.equals(spieler.getSteinfarbe())) {
					sequenceCounter++;
					if (sequenceCounter >= 4) return true;
				} else {
					sequenceCounter = 0;
				}
			}
		}
		return false;
	}
}
