package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O3 {

	public static void main(String[] args) {
		
		String talTxt = showInputDialog("Skriv inn tal du vil fakultere: ");
		int tal = Integer.parseInt(talTxt);
		
		int n;
		
		n = tal;
		
		int a = n;
		
		int x = 1;

		while ( n >= 1 ) {
			
		   x *= n ;
		   
		   n-- ;
		   
		}
		if  (tal >=0) {
			System.out.println(a + "! = " + x + ".");
		} else {
			System.out.println(a + "! = Error - kan ikkje fakultere");
		}
			
	   }
		
		
}
