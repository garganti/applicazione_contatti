package singleton;

import java.math.BigDecimal;
import java.math.BigInteger;

class Terra{

    private Terra() {}
    
    static public Terra miaTerra = new Terra();
    
    public double getSuperficie() {return 510.1E06;}

    //public double getPopolazione() {return 8.25E09;}

    public BigInteger getPopolazione() {
	return BigInteger.valueOf((long)8.25E09);
    }

    public double getAnni() {return 4.5E09;}
    
}
public class EsercizioTerraSig {
    
    public static void main(String[] args) {
	Terra t = Terra.miaTerra;
	System.out.println(t.getAnni());
	System.out.println(t.getPopolazione());
	System.out.println(t.getSuperficie());
    }

}
