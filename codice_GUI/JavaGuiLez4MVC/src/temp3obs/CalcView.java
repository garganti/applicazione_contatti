package temp3obs;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalcView extends JDialog implements Observer{

	private final JPanel contentPanel = new JPanel();
	private CalcModel model;
	JButton btnReset;
	JButton btnMultiply;
	JTextField input;
	private JLabel lblValue;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
		
			CalcModel model = new CalcModel();
			CalcView dialog = new CalcView(model);
			CalcController cc = new CalcController(model, dialog);
			model.addObserver(dialog);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CalcView(CalcModel model) {
		this.model = model;
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			btnMultiply = new JButton("multiply");
			contentPanel.add(btnMultiply);
		}
		{
			input = new JTextField();
			contentPanel.add(input);
			input.setColumns(10);
		}
		{
			btnReset = new JButton("Reset");
			contentPanel.add(btnReset);
		}
		{
			JLabel lblValue = new JLabel("Value");
			contentPanel.add(lblValue);
		}
		{
			lblValue = new JLabel();
			contentPanel.add(lblValue);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		// query del modello, pull
		double value = model.getValue();
		lblValue.setText(Double.toString(value));
		
	}

}
