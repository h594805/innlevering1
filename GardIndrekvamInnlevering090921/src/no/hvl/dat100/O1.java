package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O1 {

	public static void main(String[] args) {
		
		String tallTxt = showInputDialog("Bruttoinntekt: ");
		int Bruttoinntekt = Integer.parseInt(tallTxt);
		
		double trinn1 = (int)Bruttoinntekt*0.0093;
		double trinn2 = (int)Bruttoinntekt*0.0241;
		double trinn3 = (int)Bruttoinntekt*0.1152;
		double trinn4 = (int)Bruttoinntekt*0.1452;
		
		if (Bruttoinntekt <= 164100) {
			System.out.println("Du treng ikkje å skatte.");
		} else if (Bruttoinntekt > 164100 && Bruttoinntekt < 230950) {
			System.out.println("Du må skatte " + trinn1 + " av inntekta di.");
		} else if (Bruttoinntekt > 230951 && Bruttoinntekt < 580650) {
			System.out.println("Du må skatte " + trinn2 + " av inntekta di.");
		} else if (Bruttoinntekt > 580651 && Bruttoinntekt < 934051) {
			System.out.println("Du må skatte " + trinn3 + " av inntekta di.");
		} else {
			System.out.println("Du må skatte " + trinn4 + " av inntekta di.");
		}

	}

}	
