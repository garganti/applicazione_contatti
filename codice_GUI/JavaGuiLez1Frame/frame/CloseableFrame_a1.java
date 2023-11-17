import javax.swing.*;

//Primo sistema per chiudere l'applicazione al chiudersi del Frame
//tramite il metodo setDefaultCloseOperation
public class CloseableFrame_a1 extends JFrame {
	public CloseableFrame_a1() {
		// Imposto di uscire dall'applicazione alla chiusura del Frame
		// Esistono altre costanti che attivano altri comportamenti,
		// vedere la documentazione per i dettagli
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Imposto un titolo per il Frame
		setTitle("Un primo frame che non fa nulla, ma si chiude...");
		// Imposto una dimensione per il frame
		setSize(500, 200);
		// Posiziono il frame in un qualche punto dello schermo
		setLocation(300, 100);
		
	}

	// MAIN
	public static void main(String[] args) {
		JFrame frame = new CloseableFrame_a1();
		// Visualizzo il frame sullo schermo
		frame.setVisible(true);
	}
}
