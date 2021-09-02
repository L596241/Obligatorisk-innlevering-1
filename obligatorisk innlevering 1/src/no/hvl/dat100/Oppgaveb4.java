package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

import java.text.DecimalFormat;

public class Oppgaveb4 {

	public static void main(String[] args) {

		int userinput = Integer.parseInt(showInputDialog("Skriv inn bruttoinntekt: "));
		DecimalFormat Vformat = new DecimalFormat("#.00");

		if (userinput >= 0 && userinput <= 184800) {

			showMessageDialog(null, "Du må ikke betale trinnskatt");
		} else if (userinput > 184800 && userinput <= 260100) {
			showMessageDialog(null, "Du må betale " + Vformat.format(userinput * 0.017) + " kr i trinnskatt");
		} else if (userinput > 260100 && userinput <= 651250) {
			showMessageDialog(null, "Du må betale " + Vformat.format(userinput * 0.04) + " kr i trinnskatt");
		} else if (userinput > 651250 && userinput <= 1021550) {
			showMessageDialog(null, "Du må betale " + Vformat.format(userinput * 0.132) + " kr i trinnskatt");
		} else if (userinput > 1021550) {
			showMessageDialog(null, "Du må betale " + Vformat.format(userinput * 0.162) + " kr i trinnskatt");
		}
	}

}
