package dialoghi;

import javax.swing.*;
import java.awt.event.*;

//Questo esempio mostra come utilizzare le finestre di dialogo
public class DialogSample extends JFrame implements ActionListener
{
  private JButton b1=new JButton("Modale");
  private JButton b2=new JButton("Non Modale");

  public DialogSample()
  {
    setTitle("Usare le JDialog");
    setSize(300,300);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    JPanel p=new JPanel();
    p.add(b1);
    p.add(b2);
    getContentPane().add(p);

    b1.addActionListener(this);
    b2.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e)
  {
    JDialog d=new JDialog(this);
    d.setSize(300,300);

    Object source=e.getSource();
    if (source==b1)
    {
      d.setTitle("Io sono Modale!!!");
      d.setModal(true);
    }
    else if (source==b2) d.setTitle("Io sono Non Modale!!!");

    d.setVisible(true);
  }

  public static void main(String[] args)
  {
    DialogSample dialogsample=new DialogSample();
    dialogsample.setVisible(true);
  }
}