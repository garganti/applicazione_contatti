package casellescelta;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

//Questo esempio mostra come utilizzare una lista
public class ListFrame_a1 extends JFrame implements ListSelectionListener {
	private String[] elencoFont = { "Serif", "SansSerif", "Monospaced", "Dialog", "InputDialog" };
	private JList<String> font;
	private JLabel messaggio;

	public ListFrame_a1() {
		setTitle("scegli un font");
		setSize(500, 200);
		setLocation(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container contentPane = getContentPane();

		messaggio = new JLabel("Pippo, Pluto e Paperino");
		messaggio.setFont(new Font("Serif", Font.PLAIN, 24));
		contentPane.add(messaggio, BorderLayout.NORTH);

		JPanel p = new JPanel(new BorderLayout());
		JLabel l = new JLabel("Scegli un font");
		p.add(l, BorderLayout.WEST);

		font = new JList<>(elencoFont);
		font.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		p.add(new JScrollPane(font), BorderLayout.CENTER);
		font.addListSelectionListener(this);

		contentPane.add(p, BorderLayout.CENTER);
	}

	public void valueChanged(ListSelectionEvent e) {
		String f = font.getSelectedValue();
		messaggio.setFont(new Font(f, Font.PLAIN, 24));
	}

	public static void main(String[] args) {
		JFrame frame = new ListFrame_a1();
		frame.setVisible(true);
	}
}
