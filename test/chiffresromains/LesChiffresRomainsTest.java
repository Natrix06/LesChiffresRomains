package chiffresromains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LesChiffresRomainsTest {
	
	@Test
	void unDonneI() {
		LesChiffresRomains cr= new LesChiffresRomains();
		assertEquals("I", cr.toChiffreRomains(1));
	}

}
