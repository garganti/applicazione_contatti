package mvc.list;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;

public class ListDefaultModel extends JFrame {

	private static final long serialVersionUID = 1L;

	public ListDefaultModel() {
		final DefaultListModel<String> dataModel = new DefaultListModel<String>();
		dataModel.addElement("IO");
		JList<String> list = new JList<String>(dataModel);
		JButton add = new JButton("+");
		// if + is pressed add an element to the list
		add.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dataModel.addElement("CIAO");
			}
		});
		setSize(200, 200);
		setLayout(new GridLayout(1, 2));
		add(list);
		add(add);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		ListDefaultModel lm = new ListDefaultModel();
	}
}
