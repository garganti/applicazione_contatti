

import javax.swing.*;
import java.awt.event.*;

//Secondo sistema per chiudere l'applicazione al chiudersi del Frame
//tramite i listener
public class CloseableFrameWinAdaptHiClass extends CloseableFrame {
	public CloseableFrameWinAdaptHiClass() {
		// Imposto un "ascoltatore" degli eventi del Frame,
		// di questo argomento parleremo nelle prossime lezioni.
		// Per adesso bisogna accettarlo "per fede"
		addWindowListener(new MyWindowAdapter());
	}

	// MAIN
	public static void main(String[] args) {
		JFrame frame = new CloseableFrameWinAdaptHiClass();
	}
}

// Classe di ascolto degli eventi di un Frame
class MyWindowAdapter extends WindowAdapter {
	// Metodo lanciato quando un Frame sta per chiudersi
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}
