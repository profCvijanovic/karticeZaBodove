package logic;

import java.util.List;

import model.Kartica;
import model.Korisnik;

public class Statistika {
	
	public static double racunajLitre(List<Kartica> kartice) {
		
		double litraza = 0;
		
		for(Kartica k: kartice ) {
			litraza += k.getSipanoLitara();
		}
		
		return litraza;
	}
	
	public static int extraPoeni(Korisnik korisnik) {
		int extraBonus = 0;
			if(korisnik.ukupnoZaradjenihPoena(korisnik.getKartice())>100) {
				extraBonus= (int)(korisnik.ukupnoZaradjenihPoena(korisnik.getKartice())* 0.2);
			}
		return extraBonus;
	} 
	
	
}
