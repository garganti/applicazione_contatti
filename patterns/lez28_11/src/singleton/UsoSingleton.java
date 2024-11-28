package singleton;

class OOOO {
    
    private OOOO() {}

//    static OOOO instance() {
//	return theInstance;
//    }
//
//    private static OOOO theInstance = new OOOO();

    static OOOO instance() {
	if (theInstance == null)
	    theInstance = new OOOO();
	return theInstance;
    }

    private static OOOO theInstance = null;
    
    
}

public class UsoSingleton {

    public static void main(String[] args) {
	OOOO o = OOOO.instance();
	OOOO o2 = OOOO.instance();
	
	System.out.println(o);
	System.out.println(o2);
	
    }
}
