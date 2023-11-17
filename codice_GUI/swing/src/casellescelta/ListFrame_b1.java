package casellescelta;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

//Questo esempio mostra come "personalizzare" una lista
public class ListFrame_b1 extends JFrame implements ActionListener,
		ListSelectionListener {
	private String[] elencoFont = { "Serif", "SansSerif", "Monospaced",
			"Dialog", "InputDialog" };
	private JList<String> font;
	private OrderedListModel model;
	private JLabel messaggio;
	private JCheckBox ordered;

	public ListFrame_b1() {
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

		font = new JList<String>(elencoFont);

		// Creo il model (personalizzato)
		model = new OrderedListModel();
		// Imposto il model nella lista
		font.setModel(model);
		// Creo il renderer della lista (personalizzato)
		ListCellRenderer renderer = new FontDefaultListCellRenderer();
		// Imposto il renderer della lista
		font.setCellRenderer(renderer);

		font.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		p.add(new JScrollPane(font), BorderLayout.CENTER);
		font.addListSelectionListener(this);

		ordered = new JCheckBox("Ordinato");
		ordered.addActionListener(this);
		p.add(ordered, BorderLayout.EAST);

		contentPane.add(p, BorderLayout.CENTER);
	}

	public void actionPerformed(ActionEvent e) {
		// azione sul model della lista
		model.setOrdered(ordered.isSelected());
		font.repaint();
	}

	public void valueChanged(ListSelectionEvent e) {
		String f = (String) font.getSelectedValue();
		messaggio.setFont(new Font(f, Font.PLAIN, 24));
	}

	public static void main(String[] args) {
		JFrame frame = new ListFrame_b1();
		frame.setVisible(true);
	}
}

// Scrivo un modello di lista personalizzato che permette
// di ordinare facilmente la lista (manteniamo due elenchi)
class OrderedListModel extends AbstractListModel<String> {
	private String[] elencoFont = { "Serif", "SansSerif", "Monospaced","Dialog", "InputDialog" };
	private String[] elencoFontOrdinato = { "Serif", "SansSerif", "Monospaced",	"Dialog", "InputDialog" };
	private boolean ordered;

	public OrderedListModel() {
		Arrays.sort(elencoFontOrdinato);
	}

	public void setOrdered(boolean b) {
		ordered = b;
	}

	// Bisogna implementare i seguenti metodi
	public String getElementAt(int index) {
		if (ordered)
			return elencoFontOrdinato[index];
		else
			return elencoFont[index];
	}

	public int getSize() {
		return 5;
	}
}

// Scrivo un renderer di lista personalizzato che permette
// di vedere in anteprima il font
// se selezionato mette anche in bold
class FontDefaultListCellRenderer extends DefaultListCellRenderer {
	// Bisogna implementare il seguente metodo
	public Component getListCellRendererComponent(JList list, Object value,
			int index, boolean isSelected, boolean cellHasFocus) {
		Component c = super.getListCellRendererComponent(list, value, index,
				isSelected, cellHasFocus);

		String f = (String) list.getModel().getElementAt(index);
		int style = isSelected? Font.BOLD: Font.PLAIN; 
		c.setFont(new Font(f, style, 16));

		return c;
	}
}
