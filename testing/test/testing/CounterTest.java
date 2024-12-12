package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class CounterTest {
    
    public CounterTest(){
	System.out.println("NUOVO TEST");
    }

    @Test
    public void testInc() {
	// caso di test per il metodo inc();
	// 1. caso:
	// se costruisco un contatore da 0,
	// poi chiamo inc() mi aspetto che 
	// restituisca 1;
	Counter c = new Counter();
	
	assertNotNull(c);
	
	assertEquals(1, c.inc());
	// se chiamo un'altra volta inc allora ottengo 2
	assertEquals(2, c.inc());
	
	//assertEquals("E' sbagliato il metodo inc", 2, c.inc());
		
//	if (hhh)
//	    fail("NON VA NULLA");
    }

    
    @Test
    public void testDec() {
	Counter c = new Counter();
	c.inc();
	// se incremento e poi decremento mi aspetto ancora 0
	assertEquals(0, c.dec());
	
    }
    
    
    @Test
    public void testReset() {
	Counter c = new Counter();
	c.inc(); c.inc();
	
	c.resetCounter();
	
	assertEquals(0, c.val);
    }

}
