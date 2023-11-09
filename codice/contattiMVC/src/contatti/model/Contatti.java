package contatti.model;

import java.util.ArrayList;

// questo è il modello vero e proprio
// una lista di Contatto (record sono una classe immutabile)
public class Contatti extends ArrayList<contatti.model.Contatti.Contatto> {

	public record Contatto(String nome, String Cognome) {}

	// questo è il mio "db" dei contatti, il modello
	private static Contatti contatti = new Contatti();
	
	public static Contatti retriveStudentFromDatabase() {
		return contatti;
	}
	
	// le operazioni che posso fare sul modello
	// ad esempio aggiungere un contatto
	public void addContatto(String n, String c) {
		contatti.add(new Contatto(n, c));		
	}

}
