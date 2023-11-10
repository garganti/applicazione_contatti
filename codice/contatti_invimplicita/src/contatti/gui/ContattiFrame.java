package contatti.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ContattiFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JButton btnInsertContatto;


	/**
	 * Create the frame.
	 */
	public ContattiFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		// costruisci un pannello che contenga i diversi oggetti grafici
		JPanel contentPane = new JPanel();
		setContentPane(contentPane);
		
		btnInsertContatto = new JButton("INSERISCI UN CONTATTO");
		contentPane.add(btnInsertContatto);
	}

	public JButton getBtnInsertContatto() {
		return btnInsertContatto;
	}
}
