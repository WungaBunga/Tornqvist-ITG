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
	JOptionPane.showMessageDialog(null, "Välkommen till Bilar AB", "Bilar AB", JOptionPane.INFORMATION_MESSAGE);
	
	String name = JOptionPane.showInputDialog("Vänligen skriv in den bilen du söker efter");
	
	JOptionPane.showMessageDialog(null, "Söker efter" +  name);
	
	JOptionPane.showMessageDialog(null, "Vi hittade 24 stycken bilar i våran databas som matchade dina kriterier!");
	
	Random randomGenerator = new Random();
	int bilarTillSalu = (int) randomGenerator.nextInt(500);
	
	for(int i=1; i<25; i++){
        System.out.println(": " + i);
			}
		}	
	}

