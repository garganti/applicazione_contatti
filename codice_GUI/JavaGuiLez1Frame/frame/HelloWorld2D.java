import java.awt.*;
import javax.swing.*;

//Un Frame che contiene un pannello al suo interno
public class HelloWorld2D extends JFrame {
	public HelloWorld2D() {
		setTitle("Un frame che saluta");
		setLocation(100, 100);
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Ottengo il contentPane e vi aggiungo un nuovo pannello
		//Container contentPane = getContentPane();
		//contentPane.add(new HelloWorldPanel());
		add(new HelloWorldPanel());
		// Dalla versione 1.5 non e' piu' necessario invocare il contentPane
		// add(new HelloWorldPanel());
	}

	public static void main(String[] args) {
		JFrame frame = new HelloWorld2D();
		frame.setVisible(true);
	}
}

class HelloWorldPanel extends JPanel {
	@Override
	public void paintComponent(Graphics g) {
		// Prima operazione: invocare SEMPRE il super.paintComponent(g),
		// serve a Java per fare delle operazioni standard di disegno
		super.paintComponent(g);

		// Creo un messaggio
		String frase = "Ciao Mondo in 2D";

		// Stampo tale messaggio utilizzando la classe Graphics
		// (maggiori dettagli nelle prossime lezioni)
		g.drawString(frase, 50, 50);
		g.drawLine(0, 0, 10, 10);
	}
}
