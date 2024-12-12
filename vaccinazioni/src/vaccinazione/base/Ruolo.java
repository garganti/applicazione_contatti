package vaccinazione.base;

public class Ruolo {

    // factory
    static Ruolo getRuoloSano() {
	return Sano.getSano();
    }
    
}

class Malato extends Ruolo{}

class Sano extends Ruolo{
    
    // sigleton
    private Sano() {}

    static private Ruolo instanza = new Sano();

    static Ruolo getSano() {
	return instanza;
    }
    
    
}
