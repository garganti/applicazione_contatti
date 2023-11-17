
import java.awt.*;
import javax.swing.*;

//Un frame centrato nello schermo e di dimensioni 1/4 delle dimensioni dello schermo
public class CenteredFrame_a2 extends JFrame {
	public CenteredFrame_a2() {
		// Imposto di uscire dall'applicazione alla chiusura del Frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Imposto un titolo per il Frame
		setTitle("Un frame centrato nello schermo");

		// Recupero la "cassetta degli attezzi" di Java
		Toolkit mioTKit = Toolkit.getDefaultToolkit();

		// Interrogo il SO (tramite il Toolkit) per conoscere le dimensioni dello
		// schermo
		Dimension dimensioniSchermo = mioTKit.getScreenSize();

		// Calcolo la dimensione del Frame facendo in modo che sia 1/4 delle dimensioni
		// dello schermo
		int larghezzaFrame = dimensioniSchermo.width / 4;
		int altezzaFrame = dimensioniSchermo.height / 4;

		// Imposto una dimensione per il frame
		setSize(larghezzaFrame, altezzaFrame);

		// Calcolo dove posizionare il vertice in alto a sinistra del Frame per vederlo
		// visualizzato al centro dello schermo
		int xFrame = (dimensioniSchermo.width - larghezzaFrame) / 2;
		int yFrame = (dimensioniSchermo.height - altezzaFrame) / 2;

		// Posiziono il frame al centro dello schermo
		setLocation(xFrame, yFrame);
	}

	// MAIN
	public static void main(String[] args) {
		JFrame frame = new CenteredFrame_a2();
		frame.setVisible(true);
	}
}
