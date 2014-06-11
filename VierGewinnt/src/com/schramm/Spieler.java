package com.schramm;

public class Spieler {
	
	public static final String COMPUTER = "Computer";
	private String name;
	private Stein steinfarbe;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Stein getSteinfarbe() {
		return steinfarbe;
	}
	
	public void setSteinfarbe(Stein steinfarbe) {
		this.steinfarbe = steinfarbe;
	}
	public boolean isComputer(){
		if(name == COMPUTER){
			return true;
		}
		return false;
		
	}

}
