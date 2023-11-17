import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

/* Scrivere un'applicazione con le seguenti specifiche:
 creazione e visualizzazione di 16 frame uguali che senza sovrapporsi riempiono lo schermo
 il titolo dei frame indica quale � la loro posizione nell'array di frame cos� creato
 */
public class EsercizioB1 {

	static int wd;
	static int hd;

	public static void main(String[] args) {
		// Get the size of the default screen
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		wd = dim.width / 4;
		hd = dim.height / 4;
		for (int x = 0; x <= 3; x++) {
			for (int y = 0; y <= 3; y++) {
				// MyFrame16 f = new MyFrame16(x,y);
				JFrame f = new JFrame();
				f.setLocation(x * EsercizioB1.wd, y * EsercizioB1.hd);
				f.setSize(EsercizioB1.wd, EsercizioB1.hd);
				f.setTitle("pos " + x + "," + y);
				// visible
				f.setVisible(true);

			}

		}

	}
}

class MyFrame16 extends JFrame {

	public MyFrame16(int x, int y) {
		// set position
		setLocation(x * EsercizioB1.wd, y * EsercizioB1.hd);
		setSize(EsercizioB1.wd, EsercizioB1.hd);
		// visible
		setVisible(true);
	}

}