package testing;

public class Counter {

    private int val = 0;

    public int inc() {
	return ++val;
    }

    public int dec() {
	if (val == 0) 
	    return val;
	else 
	    return --val;
    }

    
}
