package mvc2.calculator;

import java.math.BigInteger;
import java.util.Observable;

// questo � anche observable
// quando cambia, notifica gli observer

public class CalcModel extends Observable {
	// ... Constants
	private static final String INITIAL_VALUE = "1";

	// ... Member variable defining state of calculator.
	private BigInteger m_total; // The total current value state.

	/** Constructor */
	CalcModel() {
		reset();
	}

	/** Reset to initial value. */
	public void reset() {
		m_total = new BigInteger(INITIAL_VALUE);
		setChanged();
		notifyObservers();
	}

	/**
	 * Multiply current total by a number.
	 * 
	 * @param operand Number (as string) to multiply total by.
	 */
	public void multiplyBy(String operand) {
		try {
			m_total = m_total.multiply(new BigInteger(operand));
			Thread.sleep(2000);
		} catch (InterruptedException ex) {
			System.err.println("thread stoppato: " + ex);
		}
		setChanged();
		notifyObservers();
	}

	/** Return current calculator total. */
	public String getValue() {
		return m_total.toString();
	}
}
