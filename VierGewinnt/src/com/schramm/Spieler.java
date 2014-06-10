package com.schramm;

public class Spieler {
	
	public static final String COMPUTER = "Computer";
	private String name;
	private String steinfarbe;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSteinfarbe() {
		return steinfarbe;
	}
	
	public void setSteinfarbe(String steinfarbe) {
		this.steinfarbe = steinfarbe;
	}
	public boolean isComputer(){
		if(name == COMPUTER){
			return true;
		}
		return false;
		
	}

}
