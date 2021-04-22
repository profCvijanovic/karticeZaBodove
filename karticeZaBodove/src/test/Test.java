package test;

import java.util.ArrayList;
import java.util.List;

import logic.Statistika;
import model.Kartica;
import model.Korisnik;

public class Test {

	public static void main(String[] args) {
		
		Kartica kartica1 = new Kartica();
			kartica1.setId(1);
			kartica1.setPan("1234");
			kartica1.setSipanoLitara(20);
			kartica1.setTipKartice(1);
		
		kartica1.ispisiKarticu();
			
		Kartica kartica2 = new Kartica(2,"5678",30,2);

		kartica2.ispisiKarticu();
		List<Kartica> kartice = new ArrayList<Kartica>();
			kartice.add(kartica1);
			kartice.add(kartica2);
		
		Korisnik korisnik = new Korisnik();
			korisnik.setUkupniPoeniPre(50);
			korisnik.setKartice(kartice);
		
		int ukupnoZaradjenih = korisnik.ukupnoZaradjenihPoena(kartice);
		System.out.println("Ukupno zaradjenih: " + ukupnoZaradjenih);
		
		korisnik.ukupnoPoenaPreIsaZaradom(korisnik.getUkupniPoeniPre(), ukupnoZaradjenih);
		
		double litara = Statistika.racunajLitre(kartice);
		System.out.println("Ukupno litara: " + litara);
		
		int extra = Statistika.extraPoeni(korisnik);
		System.out.println("Extra: " + extra);
		
	}

}
