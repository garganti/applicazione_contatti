package temp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MYFrameCLose4 extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		MYFrameCLose4 frame = new MYFrameCLose4();
	}

	/**
	 * Create the frame.
	 */
	public MYFrameCLose4() {
		setBounds(100, 100, 450, 300);
		setVisible(true);
		// resgitro mio listener clase estewrna
		addWindowListener(new MyWindowListener3());
	}

}
