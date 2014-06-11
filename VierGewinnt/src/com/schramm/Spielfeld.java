package com.schramm;

public class Spielfeld {

	public static final int ANZAHL_REIHEN = 6;
	public static final int ANZAHL_SPALTEN = 7;
	private Stein spielfeld[][] = new Stein[ANZAHL_SPALTEN][ANZAHL_REIHEN];

	public int steinSetzen(int spaltennummer, Stein stein) {
		int spaltenindex = spaltennummer - 1;
		if (spaltenindex < 0 || spaltenindex > ANZAHL_SPALTEN - 1) {
			return -1;
		}
		
		Stein[] reihe = spielfeld[spaltenindex];
		for (int i = 0; i < reihe.length; i++) {
			if (reihe[i] == null) {
				reihe[i] = stein;
				return i + 1;	// returnwert ist nicht der index, sondern die reihennummer
			}
		}
		
		return -1;

	}

	public Stein getSteinfarbe(int spaltennummer, int reihennummmer) {
		return spielfeld[spaltennummer-1][reihennummmer-1];
	}
}