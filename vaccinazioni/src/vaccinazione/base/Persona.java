package vaccinazione.base;

import java.util.Date;

public class Persona {
    private String nome;
    private String cognome;
    private Date dataNascita;
    
    Ruolo statoSalute;

    public Persona(String nome, String cognome, Date datanascita) {
	statoSalute = Sano.getSano();
    }
}
