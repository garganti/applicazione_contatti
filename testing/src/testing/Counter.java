package testing;

public class Counter {

    int val = 0;

    public int inc() {
	return ++val;
    }

   // resetta il contatore
    public void resetCounter() {
	val = 0;
    }
    
    public int dec() {
	if (val == 0) 
	    return val;
	else 
	    return --val;
    }

    
}
