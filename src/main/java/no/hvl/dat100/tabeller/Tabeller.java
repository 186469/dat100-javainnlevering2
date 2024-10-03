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

		String tabellInhold = "";
		for (int i = 0; i < tabell.length; i++) {
			tabellInhold += tabell[i];
			if (i < tabell.length - 1) {
				tabellInhold += ", ";
			}
		}
		System.out.println();
		System.out.println("Oppgave (b)[" + tabellInhold + "]");
		return null;
		
		}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		System.out.println("(c) Summen er: " + sum);
		return 0;
		
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++) {
	        if (tabell[i] == tall) {
	        	System.out.println("True");
	            return true;  
	        }
	    }
		System.out.println("False");
	    return false; 
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
	    for (int i = 0; i < tabell.length; i++) {
	        if (tabell[i] == tall) {
	            return i;  
	        }
	    }
	    return -1;  
	}

	
	// f)
	public static int[] reverser(int[] tabell) {
	    int[] nyTabell = new int[tabell.length]; 
	    
	   System.out.print("Tabellen reversert er (f): ");
	    for (int i = 0; i <= tabell.length; i++) {
	        nyTabell[i] = tabell[tabell.length - 1 - i];
	        System.out.print(nyTabell[i] + " ");
	    }

	    return nyTabell; 
	}

	// g)
	public static boolean erSortert(int[] tabell) {
	    for (int i = 0; i < tabell.length - 1; i++) {
	        if (tabell[i] > tabell[i + 1]) {
	            System.out.println("(g) Tabellen er ikke sortert: False");
	            return false;  // Returner false hvis et element er større enn det neste
	        }
	    }
	    System.out.println("(g) Tabellen er sortert: True");
	    return true;  // Returner true hvis ingen elementer var større enn det neste
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		System.out.println();
	    // Finn lengden på de to tabellene
	    int lengde1 = tabell1.length;
	    int lengde2 = tabell2.length;

	    // Opprett en ny tabell med lengden som er summen av de to tabellene
	    int[] nyTabell = new int[lengde1 + lengde2];

	    // Kopier elementene fra tabell1 inn i nyTabell
	    for (int i = 0; i < lengde1; i++) {
	        nyTabell[i] = tabell1[i];
	    }

	    // Kopier elementene fra tabell2 inn i nyTabell etter elementene fra tabell1
	    for (int i = 0; i < lengde2; i++) {
	        nyTabell[lengde1 + i] = tabell2[i];
	    }

	    // Skriv ut den sammenslåtte tabellen til konsollen
	    System.out.print("(h) Sammensatt tabell: ");
	    for (int tall : nyTabell) {
	        System.out.print(tall + " ");
	    }
	    System.out.println();  // Flytt til ny linje etter utskrift

	    return nyTabell;  // Returner den nye sammenslåtte tabellen
	}

}
	

