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
			return "[]"; 
		    	}

		    String tabellInnhold = "["; 

		    for (int i = 0; i < tabell.length; i++) {
		        tabellInnhold += tabell[i]; 

		        
		        if (i < tabell.length - 1) {
		            tabellInnhold += ",";
		        }
		    }

		    tabellInnhold += "]";
		    
		    return tabellInnhold;
		}
	
	// c)
	public static int summer(int[] tabell) {

		int sum = 0;
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
			
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return true;
			}
		}
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
	    
	    for (int i = 0; i < tabell.length; i++) {
	        nyTabell[i] = tabell[tabell.length - 1 - i];
	    }
	    for (int i = 0; i < nyTabell.length; i++) {
	    	
	    }

	    return nyTabell; 
	}

	// g)
	public static boolean erSortert(int[] tabell) {
	    for (int i = 0; i < tabell.length - 1; i++) {
	        if (tabell[i] > tabell[i + 1]) {
	            System.out.println("(g) Tabellen er ikke sortert: False");
	            return false;  
	        }
	    }
	    System.out.println("(g) Tabellen er sortert: True");
	    return true;  
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		System.out.println();
	  
	    int lengde1 = tabell1.length;
	    int lengde2 = tabell2.length;

	   
	    int[] nyTabell = new int[lengde1 + lengde2];

	 
	    for (int i = 0; i < lengde1; i++) {
	        nyTabell[i] = tabell1[i];
	    }

	    
	    for (int i = 0; i < lengde2; i++) {
	        nyTabell[lengde1 + i] = tabell2[i];
	    }

	   
	    System.out.print("(h) Sammensatt tabell: ");
	    for (int tall : nyTabell) {
	        System.out.print(tall + " ");
	    }
	    System.out.println(); 
	    return nyTabell; 
	}

}
	

