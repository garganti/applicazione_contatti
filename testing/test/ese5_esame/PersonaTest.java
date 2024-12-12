package ese5_esame;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonaTest {

// 1. Un caso di test in cui hai una persona sovrappeso e 
// il metodo non fallisce 
    @Test
    public void test1() {
	Persona p = new Persona(70);
	assertTrue(p.isSovrappeso());
    }
 // 2. Un caso di test in cui hai una persona NON sovrappeso e il metodo non fallisce 
    @Test
    public void test2() {
	Persona p = new Persona(50);
	assertFalse(p.isSovrappeso());
    }
 // 3. Un caso di test in cui hai una persona sovrappeso 
 // e il metodo fallisce (non trova che la persona sia in sovrappeso)
    @Test
    public void test3() {
	Persona p = new Persona(60);
	assertTrue(p.isSovrappeso()); // mi aspetto vero perchè p è in sovrappeso
	// ma il metodo sbaglia
    }

    
 // 4. Un caso di test in cui hai una persona NON sovrappeso (quindi peso < 60) 
 //    e il metodo fallisce (restituisce true)

}
