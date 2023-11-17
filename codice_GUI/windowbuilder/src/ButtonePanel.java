import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;


public class ButtonePanel extends JPanel  implements ActionListener{

	/**
	 * Create the panel.
	 */
	public ButtonePanel() {
		setLayout(null);
		
		JButton btnBlu = new JButton("BLU");
		btnBlu.setBounds(5, 95, 51, 86);
		add(btnBlu);
		btnBlu.addActionListener(this);
		
		JButton btnRosso = new JButton("ROSSO");
		btnRosso.setBounds(103, 106, 128, 86);
		add(btnRosso);
		btnRosso.addActionListener(this);
		
		JButton btnGiallo = new JButton("GIALLO");
		btnGiallo.setBounds(257, 106, 89, 23);
		add(btnGiallo);
		btnGiallo.addActionListener(this);


	}

	@Override
	public void actionPerformed(ActionEvent e) {
		setBackground(Color.BLACK);		
	}

}
