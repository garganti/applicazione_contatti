
import java.awt.*;
import javax.swing.*;

//Un frame centrato nello schermo
public class CenteredFrame_a1 extends JFrame {

	/**
	 * Instantiates a new centered frame a 1.
	 */
	public CenteredFrame_a1() {
		int larghezzaFrame = 500;
		int altezzaFrame = 200;

		// Imposto di uscire dall'applicazione alla chiusura del Frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Imposto un titolo per il Frame
		setTitle("Un frame centrato nello schermo");
		// Imposto una dimensione per il frame
		setSize(larghezzaFrame, altezzaFrame);

		// Recupero la "cassetta degli attezzi" di Java
		Toolkit mioTKit = Toolkit.getDefaultToolkit();

		// Interrogo il SO (tramite il Toolkit) per conoscere le dimensioni
		// dello schermo
		Dimension dimensioniSchermo = mioTKit.getScreenSize();

		// Calcolo dove posizionare il vertice in alto a sinistra del Frame per
		// vederlo
		// visualizzato al centro dello schermo
		int xFrame = (dimensioniSchermo.width - larghezzaFrame) / 2;
		int yFrame = (dimensioniSchermo.height - altezzaFrame) / 2;

		// Posiziono il frame al centro dello schermo
		setLocation(xFrame, yFrame);
	}

	// MAIN
	public static void main(String[] args) {
		JFrame frame = new CenteredFrame_a1();
		frame.setVisible(true);
	}
}
