
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//Questo esempio inizia a mostrare le vere potenzialita' 
//della gestione degli eventi in Java
public class ButtonFrame extends JFrame {
	public ButtonFrame() {
		setTitle("Button Test");
		setSize(300, 200);
		setLocation(100, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// Aggiungiamo al pannello di contenuto del frame un
		// altro pannello per bottoni da noi definito (vedi classe
		// ButtonPanel sotto)
		add(new ButtonPanel());
	}

	public static void main(String[] args) {
		JFrame frame = new ButtonFrame();
		frame.setVisible(true);
	}
}

// Sto ereditando le proprieta' dei pannelli ma mi sto anche impegnando ad
// implementare i metodi promessi dalla interfaccia ActionListener
class ButtonPanel extends JPanel implements ActionListener {
	private JButton yellowButton;
	private JButton blueButton;
	private JButton redButton;

	public ButtonPanel() {
		// Creo i tre bottoni, maggiori dettagli a breve
		yellowButton = new JButton("Yellow");
		blueButton = new JButton("Blue");
		redButton = new JButton("Red");

		// Aggiungo i bottoni al pannello, maggiori dettagli a breve
		add(yellowButton);
		add(blueButton);
		add(redButton);

		// Assegno il Panel come listener dei bottoni
		yellowButton.addActionListener(this);
		blueButton.addActionListener(this);
		redButton.addActionListener(this);
	}

	/*
	 * L'interfaccia ActionListener specifica la "firma" di tutti i metodi necessari
	 * ad un oggetto per ascoltare e processare eventi di tipo "Action". Un click su
	 * un bottone e' un evento di tipo Action. Tale interfaccia e' molto semplice in
	 * quanto prevede un unico metodo implementato di seguito
	 */
	public void actionPerformed(ActionEvent evento) {
		Color color = null;

		// Recupero la sorgente che ha provocato l'evento (uno dei tre bottoni)
		Object source = evento.getSource();
		// Verifico quale bottone e' la sorgente dell'eventi
		if (source == yellowButton)
			color = Color.yellow;
		else if (source == blueButton)
			color = Color.blue;
		else if (source == redButton)
			color = Color.red;
		// Reimposto il colore di sfondo
		setBackground(color);
	}
}
