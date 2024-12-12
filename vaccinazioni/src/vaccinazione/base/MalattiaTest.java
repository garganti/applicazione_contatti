package vaccinazione.base;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.sql.Date;
import java.util.Arrays;

import org.junit.Test;

public class MalattiaTest {

    @Test
    public void testMalattia() {
	// testo il costruttore
	Malattia m = new Malattia("M89", "CONTAGIOSA");
	assertNotNull(m);
	// voglio controllare i campi
	assertEquals("M89", m.codice);
    }

    @Test
    public void testAggiungiLinkPersona() {
	// costruisco un oggetto malattia
	Malattia m = new Malattia("M89", "CONTAGIOSA");
	// costruisco una persona
	Persona p = new Persona("A","B", Date.valueOf("2006-01-01"));
	// dico che p ha avuto la malattia m
	m.aggiungiLinkPersona(p);
	// controllo che m contenga p tra le persone che hanno avuto m
	assertTrue(Arrays.asList(m.persona).contains(p));
    }

}
