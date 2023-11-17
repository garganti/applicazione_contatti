package mvc.jtree;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;

public class ParoleView extends JFrame {

	JTree tree;
	JTextField testo;
	JButton add;

	public ParoleView(ParoleModel pm) {
		tree = new JTree(pm);
		tree.setEditable(true);
		tree.setRootVisible(false);
		testo = new JTextField(20);
		add = new JButton("add");
		JPanel panel = new JPanel();
		panel.add(testo);
		panel.add(add);
		this.setLayout(new BorderLayout());
		this.add(tree, BorderLayout.CENTER);
		this.add(panel, BorderLayout.SOUTH);
		setSize(new Dimension(300, 300));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

}
