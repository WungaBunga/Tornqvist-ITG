package BilarAB;
import java.awt.Color;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class BilarAB {
	public static void main(String[] args) {
		printBoard();

			}
	
private static void printBoard() {
	JOptionPane.showMessageDialog(null, "V�lkommen till Bilar AB", "Bilar AB", JOptionPane.INFORMATION_MESSAGE);
	
	String name = JOptionPane.showInputDialog("V�nligen skriv in den bilen du s�ker efter");
	
	JOptionPane.showMessageDialog(null, "S�ker efter" +  name);
	
	JOptionPane.showMessageDialog(null, "Vi hittade 24 stycken bilar i v�ran databas som matchade dina kriterier!");
	
	Random randomGenerator = new Random();
	int bilarTillSalu = (int) randomGenerator.nextInt(500);
	
	for(int i=1; i<25; i++){
        System.out.println(": " + i);
			}
		}	
	}

