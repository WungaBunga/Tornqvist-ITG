package myowngame;

import javax.swing.JOptionPane;

public class MyOwnGame {
	public static void main(String[] args) {
		enteringSchool();
	}
	private static void enteringSchool() {
		String[] options = new String[] {"Exit game to desktop", "Spring åt höger!", "Attack", "Hej", "Fråga ifall du kan få närvaro." };
		int response = JOptionPane.showOptionDialog(null, "Du kommer till klassrummet och ser Jonas ståendes med en stor blodig kniv i handen!",
				"WELCOME TO ITG!!!!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options,
				options[4]);
		
		if (response == 1) {
			JOptionPane.showMessageDialog(null, "Springer åt höger!");
			JOptionPane.showMessageDialog(null, "Du sprang in i Viveka, där står hon med en blodig motorsåg!!");
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
				JOptionPane.showMessageDialog(null, "Du frågar ifall du kan få närvaro"); 
				JOptionPane.showMessageDialog(null, "Jonas besvarar din fråga med att kasta knvien i ditt huvud!");
				JOptionPane.showMessageDialog(null, "Game over...");
				enteringSchool();
			}
		}
	}