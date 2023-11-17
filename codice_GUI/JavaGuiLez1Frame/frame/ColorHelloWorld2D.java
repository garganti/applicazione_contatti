
import java.awt.*;
import javax.swing.*;

//Questo esempio mostra come utilizzare i colori
public class ColorHelloWorld2D extends JFrame {
	public ColorHelloWorld2D() {
		setTitle("Un frame che saluta con tanti colori");
		setLocation(100, 100);
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Ottiene il contentPane e vi aggiunge un nuovo Component
		Container contentPane = getContentPane();
		contentPane.add(new HelloWorldPanel());
	}

	public static void main(String[] args) {
		JFrame frame = new ColorHelloWorld2D();
		frame.setVisible(true);
	}
}

class ColorHelloWorldPanel extends JPanel {
	@Override
	public void paintComponent(Graphics g) {
		// Prima operazione: invocare SEMPRE il super.paintComponent(g),
		// serve a Java per fare delle operazioni standard di disegno
		super.paintComponent(g);

		// Creo un messaggio
		String frase = "Ciao Mondo in 2D";

		for (int i = 0; i < 10; i++) {
			// Genero un colore random
			float red = (float) Math.random();
			float green = (float) Math.random();
			float blue = (float) Math.random();
			float alfa = (float) Math.random();

			// Imposto il colore appena creato
			g.setColor(new Color(red, green, blue, alfa));

			// Stampo il messaggio utilizzando la classe Graphics (maggiori dettagli a
			// breve)
			g.drawString(frase, 50 + i * 10, 50 + i * 10);
		}
	}
}
