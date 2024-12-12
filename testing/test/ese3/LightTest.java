package ese3;

import static org.junit.Assert.*;

import org.junit.Test;

public class LightTest {

    @Test
    public void test1() {
	// inizlamente spenta
	Light l = new Light();
	assertFalse(l.isLightOn());
    }

    @Test
    public void test2() {
	// inizlamente spenta ma s el'accnedo si accende
	Light l = new Light();
	// controllo che il metodo restituisce true
	assertTrue(l.onOff(true));
	// controllo che la luce sia accesa
	assertTrue(l.isLightOn());
    }
    @Test
    public void test3() {
	// inizlamente spenta ma se l'accnedo si accende
	// e poi la spengo
	Light l = new Light();
	l.onOff(true);
	// spengo
	l.onOff(true);
	// controllo che la luce sia accesa
	assertFalse(l.isLightOn());
    }

    @Test
    public void test4() {
	// inizlamente spenta non cambio stato
	// rimane spenta
	Light l = new Light();
	l.onOff(false);
	// controllo che la luce sia rimasta spenta
	assertFalse(l.isLightOn());
    }

    
}
