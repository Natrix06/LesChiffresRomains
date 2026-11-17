package chiffresromains;

public class LesChiffresRomains {
	
	public String toChiffreRomains(int nombre) {
		StringBuilder chiffre= new StringBuilder();
		
		for(int i=0;i<nombre;i++) {
			chiffre.append("I");
		}
		return chiffre.toString();
	}
	
	
}
