package myowngame;

import javax.swing.JOptionPane;

public class MyOwnGame {
	public static void main(String[] args) {
		enteringSchool();
	}
	private static void enteringSchool() {
		String[] options = new String[] {"Exit game to desktop", "Spring �t h�ger!", "Attack", "Hej", "Fr�ga ifall du kan f� n�rvaro." };
		int response = JOptionPane.showOptionDialog(null, "Du kommer till klassrummet och ser Jonas st�endes med en stor blodig kniv i handen!",
				"WELCOME TO ITG!!!!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options,
				options[4]);
		
		if (response == 1) {
			JOptionPane.showMessageDialog(null, "Springer �t h�ger!");
			JOptionPane.showMessageDialog(null, "Du sprang in i Viveka, d�r st�r hon med en blodig motors�g!!");
			JOptionPane.showMessageDialog(null, "Game over...");
			enteringSchool();
		} else if (response == 3) {
			JOptionPane.showMessageDialog(null, "Jonas hugger dig i huvudet!");
			JOptionPane.showMessageDialog(null, "Game over...");
			enteringSchool();
		}
		else if (response == 2) {
			JOptionPane.showMessageDialog(null, "Du lyckades besegra Jonas med din HP laptop!");
			JOptionPane.showMessageDialog(null, "Well played!!");
			enteringSchool();
		}
			else if (response == 4) {
				JOptionPane.showMessageDialog(null, "Du fr�gar ifall du kan f� n�rvaro"); 
				JOptionPane.showMessageDialog(null, "Jonas besvarar din fr�ga med att kasta knvien i ditt huvud!");
				JOptionPane.showMessageDialog(null, "Game over...");
				enteringSchool();
			}
		}
	}