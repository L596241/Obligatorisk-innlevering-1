package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgaveb5 {

	public static void main(String[] args) {

		
		for(int i=1; i<=10; i++)	{

				int antallpoeng = Integer.parseInt(showInputDialog("Antall poeng oppnådd: "));

			if (antallpoeng >= 90 && antallpoeng <= 100) {
				System.out.println("Karakter A");
				
			} else if (antallpoeng >= 80 && antallpoeng <= 89) {
				System.out.println("Karakter B");
				
			}

			else if (antallpoeng >= 60 && antallpoeng <= 79) {
				System.out.println("Karakter C");
				
			}

			else if (antallpoeng >= 50 && antallpoeng <= 59) {
				System.out.println("Karakter D");
				
			}

			else if (antallpoeng >= 40 && antallpoeng <= 49) {
				System.out.println("Karakter E");
				
			}

			else if (antallpoeng >= 0 && antallpoeng <= 39) {
				System.out.println("Karakter F");
				
			}
			
			else if (antallpoeng < 0 || antallpoeng > 100) {
				showMessageDialog(null, "Skriv inn en verdi mellom 0 og 100");
				i--;
			}
			}
	}
}