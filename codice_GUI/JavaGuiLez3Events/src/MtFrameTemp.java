import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MtFrameTemp extends JFrame implements WindowListener {

	public static void main(String[] args) {
		MtFrameTemp f = new MtFrameTemp();
		f.setSize(500, 600);
		f.setVisible(true);
		f.addWindowListener(f);
		JButton m = new JButton();
		m.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Stub di metodo generato automaticamente

			}
		});
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Stub di metodo generato automaticamente

	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Stub di metodo generato automaticamente

	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(1);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Stub di metodo generato automaticamente

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("deiconificata");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Stub di metodo generato automaticamente

	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Stub di metodo generato automaticamente

	}

}
