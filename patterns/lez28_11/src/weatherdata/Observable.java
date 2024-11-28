package weatherdata;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

abstract public class Observable {
    
    List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer o) {
	observers.add(o);
    }
    public void notifyObservers(){
	for (Observer observer : observers) {
	    observer.update();
	}
    }
    
    
}
