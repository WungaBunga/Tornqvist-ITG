package pictureLoader;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class mainYatzy {

	public static void main(String[] args) {
		printBoard();

	}

	
	
private static void printBoard() {
	JOptionPane.showMessageDialog(null, "Do you want to see something pretty?", "!!!WARNING!!!", JOptionPane.ERROR_MESSAGE);
	String name = JOptionPane.showInputDialog("Yes or No");
	JOptionPane.showMessageDialog(null, "So your answer is" + name);
    ImageIcon icon = new ImageIcon("C:/Users/william.tornqvist1/Pictures/ginger.jpg");
	JOptionPane.showMessageDialog(null, "Here you go!");
	
	
	/* Det kommer upp en pop-up ruta på din skärm där datorn frågar vad du heter, och du ska skriva in ditt namn och sen kommer det upp det namnet du skrev.
	 */
	
	}
}
