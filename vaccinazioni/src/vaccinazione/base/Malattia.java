package vaccinazione.base;

public class Malattia {
    private static final int MAX_NUMERO_PERSONE = 100;
    
    String codice;
    private String tipo;
    Persona[] persona;

    public Malattia(String codice, String tipo) {
	this.codice = codice;
	this.tipo = tipo;
	// max 100 persone hanno avuto questa malattia
	persona = new Persona[MAX_NUMERO_PERSONE];
    }

    public void aggiungiLinkPersona(Persona p) {
	// se è sano diventa ammalato
	if (p.statoSalute instanceof Sano) {
	    p.statoSalute = new Malato();
	}
	// aggiungo alle persone che hanno presto questa malattia
	for (int i = 0; i < persona.length; i++) {
	    if (persona[i] == null) {
		persona[i] = p;
		return;
	    }
	}
	throw new RuntimeException("ARRAY PIENO NON POSSO INSERIRE LA PERSONA");
    }
}
