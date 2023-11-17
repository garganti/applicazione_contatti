package temp;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class CopyOfMYFrameCLose3 extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		CopyOfMYFrameCLose3 frame = new CopyOfMYFrameCLose3();
	}

	/**
	 * Create the frame.
	 */
	public CopyOfMYFrameCLose3() {
		setBounds(100, 100, 450, 300);
		setVisible(true);
		// resgitro listener anonimo
		addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowIconified(WindowEvent e) {
				System.out.println("iconificata");

			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("terminato");
				System.exit(0);
			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}
		});
	}

}
