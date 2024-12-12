package vaccinazione.centro;

import java.util.Date;
import java.util.List;

import vaccinazione.base.Malattia;
import vaccinazione.base.Persona;
import vaccinazione.vaccini.Vaccino;

public class CentroVaccinazioni {
    private String nome;
    private Malattia[] malattia;
    private Vaccino[] vaccino;
    // dall'associazione da CentroVaccinazioni a Persona
    // private Persona[] persona;
    private List<Persona> persona;

    public void CentroVaccinazioni(String nome) {
    }

    public void inserisciMalattia(String c, String t) {
    }

    public void inserisciVaccino(String c, int r, int a) {
    }

    public void inserisciPersona(String n, String c, Date d) {
    }

    public void getPersoneVaccinate(Date d, Vaccino v) {
    }
}
