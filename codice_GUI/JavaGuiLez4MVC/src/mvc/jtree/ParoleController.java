package mvc.jtree;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ParoleController implements ActionListener{

	private ParoleModel pm;
	private ParoleView pv;

	public ParoleController(ParoleView pv, ParoleModel pm) {
		pv.add.addActionListener(this);
		this.pv = pv;
		this.pm = pm;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		pm.add(pv.testo.getText());
	}

}
