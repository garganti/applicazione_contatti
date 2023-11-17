import javax.swing.*;

//Primo esempio di un Frame in Java: visualizza una finestra vuota con un titolo
//Tutte le funzionalita' presenti sono fornite in automatico dal SO

public class FirstFrame extends JFrame {
	public FirstFrame() {
		// Imposto un titolo per il Frame
		setTitle("Un primo frame che non fa nulla");
		// Imposto una dimensione per il frame
		setSize(300, 200);
		// Posiziono il frame un qualche punto dello schermo
		setLocation(300, 100);
		// Visualizzo il frame sullo schermo
		setVisible(true);
	}

	// MAIN
	public static void main(String[] args) {
		JFrame frame = new FirstFrame();
		System.out.println("FINITO");
		// però quando chiudo la finestra ho solo stevisible a false...
	}
}
