package temp3obs;

import java.util.Observable;

public class CalcModel extends Observable{
	
	private double value;
	
	public CalcModel() {
		value = 1;
		notifyObservers();
	}
	/**
	 * fiofddf
	 */
	public void clear(){
		value = 1;
		System.out.println(" reset value");
		notifyObservers();
	}

	/**
	 * Multiply.
	 *
	 * @param d the number to be moltiplied 	
	 */
	public void multiply(double d){
		value *= d;
		System.out.println(" mutliplying value " + d);
		notifyObservers();
	}

	public double getValue() {
		return value;
	}
}
