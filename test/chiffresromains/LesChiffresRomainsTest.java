package chiffresromains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LesChiffresRomainsTest {
	
	private LesChiffresRomains cr;
	
	@BeforeEach
	void setup() {
		cr= new LesChiffresRomains();
	}
	
	@Test
	void unDonneI() {
		assertEquals("I", cr.toChiffreRomains(1));
	}
	
	@Test
	void deuxDonneII() {
		assertEquals("II", cr.toChiffreRomains(2));
		assertEquals("III", cr.toChiffreRomains(3));
	}

}
