package layout;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

//Questo esempio mostra un FlowLayout all'opera.
//Ogni volta che sulla tastiera schiaccio il carattere 
//'b' si aggiunge un nuovo bottone
public class LayoutAbsoluteFrame extends JFrame {
	private JPanel pannelloBottoni;
	private int contatoreBottoni = 0;

	public LayoutAbsoluteFrame() {
		setTitle("FlowLayout all'opera");
		setSize(300, 400);
		setLocation(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container pane = getContentPane();
		pane.setLayout(null);

		JButton b1 = new JButton("one");
		JButton b2 = new JButton("two");
		JButton b3 = new JButton("three");

		pane.add(b1);
		pane.add(b2);
		pane.add(b3);

		Insets insets = getInsets();
		Dimension size = b1.getPreferredSize();
		b1.setBounds(25 + insets.left, 5 + insets.top, size.width, size.height);
		size = b2.getPreferredSize();
		b2.setBounds(55 + insets.left, 40 + insets.top, size.width, size.height);
		size = b3.getPreferredSize();
		b3.setBounds(150 + insets.left, 15 + insets.top, size.width + 50, size.height + 20);

	}

	public void keyPressed(KeyEvent k) {
	}

	public void keyReleased(KeyEvent k) {
	}

	public void keyTyped(KeyEvent k) {
		char carattere = k.getKeyChar();
		if (carattere == 'b') {
			contatoreBottoni++;
			aggiungiBottone();
		}
	}

	private void aggiungiBottone() {
		JButton bottone = new JButton("bottone n." + contatoreBottoni);
		pannelloBottoni.add(bottone);
		pannelloBottoni.validate(); // Indispensabile all'aggiornamento
		// del layout, chiama da solo il repaint
	}

	public static void main(String[] args) {
		JFrame frame = new LayoutAbsoluteFrame();
		frame.setVisible(true);
	}
}
