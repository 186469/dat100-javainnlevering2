package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		System.out.print("[");
		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i]+" ");
		}
		System.out.print("]");
	}

	// b)
	public static String tilStreng(int[] tabell) {

		 if (tabell == null || tabell.length == 0) {
	            return "[]";  // Returner tom array hvis tabellen er null eller tom
	        }

	        StringBuilder resultat = new StringBuilder();
	        resultat.append("[");  // Start med åpningsklamme

	        // Iterer gjennom elementene i tabellen og bygg strengen
	        for (int i = 0; i < tabell.length; i++) {
	            resultat.append(tabell[i]);
	            if (i < tabell.length - 1) {
	                resultat.append(",");  // Legg til komma mellom elementene
	            }
	        }

	        resultat.append("]");  // Legg til avslutningsklamme
	        return resultat.toString();  // Returner strengen
	    }

	    // Eventuelle andre metoder du trenger å implementere (f.eks. skrivUt, summer, finnesTall osv.)
	

	// c)
	public static int summer(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden finnesTall ikke implementert");

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");
	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
