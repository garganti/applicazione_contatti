import javax.swing.*;

//Una finestra di dialogo per riportare messaggi
public class Dialog1 {
	public static void main(String args[]) {
		JOptionPane.showMessageDialog(null, "Hello world!");
		String s = JOptionPane.showInputDialog("ibnserisci stringa");
		System.out.println(s);
		System.exit(0);
	}
}
