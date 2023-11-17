package EsercizioEventiC;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

// se stessa è listener dei bottoni
public class Soluzione3 extends JFrame implements ActionListener{

	private JPanel contentPane;
	JButton btnYes;
	JButton btnNo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Soluzione3 frame = new Soluzione3();
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
	public Soluzione3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnYes = new JButton("Yes");
		btnYes.addActionListener(this);
		btnYes.setBounds(37, 118, 89, 23);
		contentPane.add(btnYes);
		
		btnNo = new JButton("No");
		btnNo.addActionListener(this);
		btnNo.setBounds(227, 118, 89, 23);
		contentPane.add(btnNo);
		
		JLabel lblOggiFesta = new JLabel("Oggi \u00E8 festa?");
		lblOggiFesta.setBounds(44, 40, 202, 37);
		contentPane.add(lblOggiFesta);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object buttonPressd = e.getSource();
		if (buttonPressd == btnYes){
			contentPane.setBackground(Color.RED);
		}		
	}
}

