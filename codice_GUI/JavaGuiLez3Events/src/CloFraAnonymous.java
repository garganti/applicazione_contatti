
import javax.swing.*;
import java.awt.event.*;

//Secondo sistema per chiudere l'applicazione al chiudersi del Frame
//tramite i listener
public class CloFraAnonymous extends CloseableFrame {

	public CloFraAnonymous() {
		// Imposto un "ascoltatore" degli eventi del Frame,
		// di questo argomento parleremo nelle prossime lezioni.
		// Per adesso bisogna accettarlo "per fede"
		addWindowListener(new WindowListener() {

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowClosed(WindowEvent e) {
			}

			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("chiudo la finestra!!!");
				System.exit(0);

			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub

			}
		});
	}

	// MAIN
	public static void main(String[] args) {
		JFrame frame = new CloFraAnonymous();
	}
}
