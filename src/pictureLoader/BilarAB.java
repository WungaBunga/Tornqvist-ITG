package pictureLoader;
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
	JOptionPane.showMessageDialog(null, "24 stycken till salu!");
	/* Det kommer upp en pop-up ruta p� din sk�rm d�r datorn fr�gar vad du heter, och du ska skriva in ditt namn och sen kommer det upp det namnet du skrev.
	 */
	for(int i=1; i<25; i++){
        System.out.println(": " + i);
			}
		}
	}

