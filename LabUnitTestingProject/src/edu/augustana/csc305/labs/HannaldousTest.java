package edu.augustana.csc305.labs;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HannaldousTest {

	@Test
	public void checkLetterTestYes() {
		assertEquals("y", Hannaldous.checkLetter("badpassword"));
		assertEquals("y", Hannaldous.checkLetter("mattjunk"));
	}
	
	@Test
	public void checkLetterTestNo() {
		assertEquals("n", Hannaldous.checkLetter("badpassword123"));
		assertEquals("n", Hannaldous.checkLetter("badpassword!!!"));
	}
	
	@Test
	public void howBadTest() {
		String[] passwords = new String[] { "bigmoose$", "emusareawesome", "123goodbye", "ok&y", "17", "cat" };
		assertEquals(4, Hannaldous.howBad(8, passwords));
	}
}