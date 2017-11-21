package pictureLoader;
import java.awt.Color;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class mainYatzy {
	public static void main(String[] args) {
		printBoard();

			}
	
private static void printBoard() {
	JOptionPane.showMessageDialog(null, "Välkommen till PlatinumCars AB", "PlatinumCars Norrköping", JOptionPane.ERROR_MESSAGE);
	String name = JOptionPane.showInputDialog("Vänligen skriv in den bilen du söker efter");
	JOptionPane.showMessageDialog(null, "Söker efter" +  name);
	JOptionPane.showMessageDialog(null, "Här har du resultaten: 19 stycken bilar hittade vi i våran databas");
	/* Det kommer upp en pop-up ruta på din skärm där datorn frågar vad du heter, och du ska skriva in ditt namn och sen kommer det upp det namnet du skrev.
	 */
	for(int i=1; i<1; i++){
        System.out.println(": " + i);
			}
		}
	}

