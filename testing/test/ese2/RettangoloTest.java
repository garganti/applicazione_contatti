package ese2;

import static org.junit.Assert.*;

import org.junit.Test;

public class RettangoloTest {

    @Test
    public void testGet() {
	Rettangolo r = new Rettangolo(3, 4);
	assertEquals(3, r.getBase());
	assertEquals(4, r.getAltezza());
    }

    @Test
    public void testArea() {
	Rettangolo r = new Rettangolo(5, 6);
	assertEquals(30, r.getArea());
    }

//    @Test
//    public void testPerimetro() {
//	Rettangolo r = new Rettangolo(7, 8);
//	assertEquals(30, r.get());
//    }
    
}
