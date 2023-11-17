package mvc1.calculator;



import java.math.BigInteger;

public class CalcModel {
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
	}

	/**
	 * Multiply current total by a number.
	 * 
	 * @param operand
	 *            Number (as string) to multiply total by.
	 */
	public void multiplyBy(String operand) {
		m_total = m_total.multiply(new BigInteger(operand));
	}

	/** Return current calculator total. */
	public String getValue() {
		return m_total.toString();
	}
}
