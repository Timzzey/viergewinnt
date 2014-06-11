package com.schramm;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class SpielTest {

	private Spiel spiel;
	private Spieler spieler1;
	private Spieler spieler2;

	@Before
	public void setup() {
		spiel = new Spiel();
		
		spieler1 = new Spieler();
		spieler1.setName("Timzzey");
		spieler1.setSteinfarbe(Stein.BlauerStein);
		
		spieler2 = new Spieler();
		spieler2.setName("Computer");
		spieler2.setSteinfarbe(Stein.RoterStein);
		
		spiel.setSpieler1(spieler1);
		spiel.setSpieler2(spieler2);
	}
	
	@Test
	public void nurEinSpielerSetztInEineSpalteUndHatNachVierZuegenGewonnen() {
		spiel.steinSetzen(spieler1, 1);
		assertFalse(spiel.hatGewonnen(spieler1));
		spiel.steinSetzen(spieler1, 1);
		assertFalse(spiel.hatGewonnen(spieler1));
		spiel.steinSetzen(spieler1, 1);
		assertFalse(spiel.hatGewonnen(spieler1));
		spiel.steinSetzen(spieler1, 1);
		assertTrue(spiel.hatGewonnen(spieler1));
	}
	
	@Test
	public void zweiSpielerSetzenInEineSpalteUndSpielerEinsGewinnt() {
		spiel.steinSetzen(spieler1, 1);
		assertFalse(spiel.hatGewonnen(spieler1));
		
		spiel.steinSetzen(spieler2, 1);
		assertFalse(spiel.hatGewonnen(spieler1));
		
		spiel.steinSetzen(spieler1, 1);
		assertFalse(spiel.hatGewonnen(spieler1));
		spiel.steinSetzen(spieler1, 1);
		assertFalse(spiel.hatGewonnen(spieler1));
		spiel.steinSetzen(spieler1, 1);
		assertFalse(spiel.hatGewonnen(spieler1));
		spiel.steinSetzen(spieler1, 1);
		assertTrue(spiel.hatGewonnen(spieler1));
	
	}
}
