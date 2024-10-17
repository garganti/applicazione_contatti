package contatti.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.AbstractAction;
import javax.swing.Action;

// interfaccia grafica
public class ContattiFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	
	// questo � il bottone che voglio associare ad una azione
	// per� non direttamente. L'invocazione � implicita tramite listener
	private JButton btnInsertContatto;
	private final Action action = new SwingAction();


	/**
	 * Create the frame.
	 */
	public ContattiFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		// costruisci un pannello che contenga i diversi oggetti grafici
		JPanel contentPane = new JPanel();
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setAction(action);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		contentPane.add(lblNewLabel);
		// costruisci il bottone con la sua label
		btnInsertContatto = new JButton("INSERISCI UN CONTATTO");
		contentPane.add(btnInsertContatto);
	}

	public JButton getBtnInsertContatto() {
		return btnInsertContatto;
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
