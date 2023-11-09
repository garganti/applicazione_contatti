package contatti.view;

import java.util.List;

// questa è la view, come si vede non contiene nessun riferimento 
// ne al modello, ne al controller
public class ContattiView {

	// stampa i contatti come lista di stringhe
	public void printContatti(List<String> listaDeiContatti) {
		for (String c: listaDeiContatti)
			System.out.println(c);		
	}
}
