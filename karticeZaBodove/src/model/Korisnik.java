package model;

import java.util.ArrayList;
import java.util.List;

public class Korisnik {
	
	private int ukupniPoeniPre;
	private List<Kartica> kartice = new ArrayList<Kartica>();
	
	public Korisnik() {
		
	}
	
	public int getUkupniPoeniPre() {
		return ukupniPoeniPre;
	}
	public void setUkupniPoeniPre(int ukupniPoeniPre) {
		this.ukupniPoeniPre = ukupniPoeniPre;
	}
	public List<Kartica> getKartice() {
		return kartice;
	}
	public void setKartice(List<Kartica> kartice) {
		this.kartice = kartice;
	}
	
	public int ukupnoZaradjenihPoena(List<Kartica> kartice) {
		
		int ukupnoPoena = 0;
		Kartica kartica = new Kartica();
		for(Kartica k: kartice ) {
			ukupnoPoena +=kartica.izracuajBrojPoena(k);
		}
			
		return ukupnoPoena;		
	}
	
	public void ukupnoPoenaPreIsaZaradom(int ukupniPoeniPre, int ukupnoZaradjenihPoena) {
		System.out.println("Ukupno ima " + (ukupniPoeniPre + ukupnoZaradjenihPoena) + " poena." );
	}
	

}
