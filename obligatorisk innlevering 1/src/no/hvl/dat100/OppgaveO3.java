package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;		
		 
		public class OppgaveO3 {
		 
		  public static void main(String[] args) {
		    int n;
		    
		    
		      String tallTxt = showInputDialog("Gi en verdi på n:");
		      n = parseInt(tallTxt);
		      if (n > 0 && n < 17) {
		 
		    showMessageDialog(null, n + "! = " + fakultet(n) );
		  }
		      else {
		    	  showMessageDialog(null, "n! må være mellom 1 og 16 ");
		    	  
		      }
		  }
		  public static int fakultet(int maxTall) {
		    int nFak = 1;
		    for (int tall=1; tall<=maxTall; tall++)
		      nFak = nFak * tall;
		    return nFak;
		  }
		 
		}