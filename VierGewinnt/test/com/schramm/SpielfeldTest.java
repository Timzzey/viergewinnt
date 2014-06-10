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
		assertEquals(1, spielfeld.steinSetzen(1, "lila"));
	}

	@Test
	public void steinSetzenDritterStein() {
		spielfeld.steinSetzen(1, "lila");
		spielfeld.steinSetzen(1, "lila");
		assertEquals(3, spielfeld.steinSetzen(1, "lila"));
	}

	@Test
	public void steinSetzenZuVielerSteineFuehrtZuFehler() {
		spielfeld.steinSetzen(1, "lila");
		spielfeld.steinSetzen(1, "lila");
		spielfeld.steinSetzen(1, "lila");
		spielfeld.steinSetzen(1, "lila");
		spielfeld.steinSetzen(1, "lila");
		spielfeld.steinSetzen(1, "lila");
		assertEquals(-1, spielfeld.steinSetzen(1, "lila"));
	}

	@Test
	public void steinSetzenFalscheSpalteFuehrtZuFehler() {
		assertEquals(-1, spielfeld.steinSetzen(13, "lila"));
	}

}