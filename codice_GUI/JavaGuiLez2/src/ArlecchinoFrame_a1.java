
import java.awt.*;
import javax.swing.*;

//Questo esempio mostra come settare il  colore mentre il contesto grafico scrive
//e mostra tecniche di definizione di un font e posizionamento di una stringa
public class ArlecchinoFrame_a1 extends JFrame {
	public ArlecchinoFrame_a1() {
		setTitle("Un messaggio allegro");
		setSize(400, 200);
		setLocation(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// le seguenti due righe ottengono il contentPane e vi aggiungono un nuovo
		// pannello della classe primoPanel
		Container contentPane = getContentPane();
		contentPane.add(new ArlecchinoPanel_a1());
	}

	public static void main(String[] args) {
		JFrame frame = new ArlecchinoFrame_a1();
		frame.setVisible(true);
	}
}

class ArlecchinoPanel_a1 extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		String message = "CIAO";

		// Creo ed imposto il font da usare
		Font f = new Font("Monospaced", Font.BOLD, 120);
		g.setFont(f);

		int posX = 10;
		int posY = 100;

		for (int i = 0; i < message.length(); i++) {
			// Creo ed imposto il colore
			g.setColor(
					new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));

			// Disegno della stringa
			g.drawString(message.substring(i, i + 1), posX + 100 * i, posY);
		}
	}
}
