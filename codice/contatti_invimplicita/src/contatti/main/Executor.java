package contatti.main;

import java.awt.EventQueue;

import contatti.gui.ContattiFrame;
import contatti.listener.InsertContattoListener;

public class Executor {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		ContattiFrame frame = new ContattiFrame();
		InsertContattoListener listener = new InsertContattoListener();
		frame.getBtnInsertContatto().addActionListener(listener);
		frame.setVisible(true);
	}

}
