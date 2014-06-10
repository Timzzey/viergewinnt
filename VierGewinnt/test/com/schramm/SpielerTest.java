package com.schramm;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SpielerTest {

	@Test
	public void testIsComputerIstTrueWennNameComputerIst() {
		Spieler sp = new Spieler();
		sp.setName(Spieler.COMPUTER);
		
		assertTrue(sp.isComputer());
	}

	@Test
	public void testIsComputerIstFalseWennNameNichtComputerIst() {
		Spieler sp = new Spieler();
		sp.setName("Hugo");
		
		assertFalse(sp.isComputer());
	}

}
