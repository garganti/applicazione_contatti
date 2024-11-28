package singleton;

import java.math.BigDecimal;
import java.math.BigInteger;

class Terra2{

//    private Terra2() {}
    
    
    public static double getSuperficie() {return 510.1E06;}

    public static BigInteger getPopolazione() {
	return BigInteger.valueOf((long)8.25E09);
    }

    public static double getAnni() {return 4.5E09;}
    
}
public class EsercizioTerraNoSig {
    
    public static void main(String[] args) {
	System.out.println(Terra2.getAnni());
	System.out.println(Terra2.getPopolazione());
	System.out.println(Terra2.getSuperficie());
    }

}
