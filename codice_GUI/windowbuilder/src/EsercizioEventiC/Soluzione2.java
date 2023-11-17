package EsercizioEventiC;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

// classe esterna
public class Soluzione2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Soluzione2 frame = new Soluzione2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Soluzione2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnYes = new JButton("Yes");
		btnYes.addActionListener(new ChangeColor(contentPane, Color.RED));
		btnYes.setBounds(37, 118, 89, 23);
		contentPane.add(btnYes);
		
		JButton btnNo = new JButton("No");
		btnNo.addActionListener(new ChangeColor(contentPane,Color.GREEN));
		btnNo.setBounds(227, 118, 89, 23);
		contentPane.add(btnNo);
		
		JLabel lblOggiFesta = new JLabel("Oggi \u00E8 festa?");
		lblOggiFesta.setBounds(44, 40, 202, 37);
		contentPane.add(lblOggiFesta);
	}
}


class ChangeColor implements ActionListener {

	Component component;
	Color color;
	
	public ChangeColor(JPanel contentPane, Color clr) {
		component = contentPane;
		color = clr;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		component.setBackground(color);
	}

}

