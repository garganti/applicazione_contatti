import java.awt.Frame;

import javax.swing.*;

//Un Frame capace di massimizzarsi e ridursi a icona da codice
public class StateFrame extends JFrame {
	
	public StateFrame() {
		// Imposto di uscire dall'applicazione alla chiusura del Frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Imposto un titolo per il Frame
		setTitle("Un primo frame che iconizza e massimizza da solo");
		// Imposta una dimensione per il frame
		setSize(500, 200);
		// Posiziono il frame un qualche punto dello schermo
		setLocation(300, 100);
	}

	public static void main(String[] a) {
		JFrame frame = new StateFrame();
		frame.setVisible(true);

		// Questa riga serve per fare "passare del tempo" [vedi multithreading in Java
		// ...]
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}

		// Iconizzo la finestra
		frame.setExtendedState(Frame.ICONIFIED);

		// Anche questa riga serve per fare "passare del tempo" [vedi multithreading in
		// Java ...]

		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}

		// Massimizzo la finestra
		frame.setExtendedState(Frame.MAXIMIZED_BOTH);

		// Questa riga serve per fare "passare del tempo" [vedi multithreading in Java
		// ...]

		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}

		// Riporto la finestra nella condizione iniziale
		frame.setExtendedState(Frame.NORMAL);
	}
}
