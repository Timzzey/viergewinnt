package com.schramm;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SpielfeldTest {

	private Spielfeld spielfeld;

	@Before
	public void setUp() throws Exception {
		spielfeld = new Spielfeld();
	}

	@Test
	public void steinSetzenErsterStein() {
		assertEquals(1, spielfeld.steinSetzen(1, Stein.BlauerStein));
	}

	@Test
	public void steinSetzenDritterStein() {
		spielfeld.steinSetzen(1, Stein.BlauerStein);
		spielfeld.steinSetzen(1, Stein.BlauerStein);
		assertEquals(3, spielfeld.steinSetzen(1, Stein.BlauerStein));
	}

	@Test
	public void steinSetzenZuVielerSteineFuehrtZuFehler() {
		spielfeld.steinSetzen(1, Stein.BlauerStein);
		spielfeld.steinSetzen(1, Stein.BlauerStein);
		spielfeld.steinSetzen(1, Stein.BlauerStein);
		spielfeld.steinSetzen(1, Stein.BlauerStein);
		spielfeld.steinSetzen(1, Stein.RoterStein);
		spielfeld.steinSetzen(1, Stein.BlauerStein);
		assertEquals(-1, spielfeld.steinSetzen(1, Stein.BlauerStein));
		
		assertEquals(Stein.BlauerStein, spielfeld.getSteinfarbe(1, 1));
		assertEquals(Stein.RoterStein, spielfeld.getSteinfarbe(1, 5));
	}

	@Test
	public void steinSetzenFalscheSpalteFuehrtZuFehler() {
		assertEquals(-1, spielfeld.steinSetzen(0, Stein.BlauerStein));
	}

	@Test
	public void steinSetzenZuGrosseSpalte() {
		assertEquals(-1, spielfeld.steinSetzen(8, Stein.BlauerStein));
	}
}