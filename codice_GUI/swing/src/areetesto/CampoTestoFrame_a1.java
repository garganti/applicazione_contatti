package areetesto;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//Questo esempio mostra l'utilizzo dell'ActionListener 
//nelle caselle di testo: visualizza in chiaro una
//password in una casella di testo
public class CampoTestoFrame_a1 extends JFrame implements ActionListener
{
  private JPasswordField password;
  private JTextField testo;

  public CampoTestoFrame_a1()
  {
    setTitle("demo casella di testo");
    setSize(300,200);
    setLocation(300,200);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    Container contentPane=getContentPane();

    password=new JPasswordField(18);
    password.addActionListener(this);
    contentPane.add(password,BorderLayout.NORTH);

    testo=new JTextField();
    contentPane.add(testo,BorderLayout.SOUTH);
  }

  public void actionPerformed(ActionEvent e)
  {
    String s=new String(password.getPassword());
    testo.setText(s);
  }

  public static void main(String[] args)
  {
    JFrame frame=new CampoTestoFrame_a1();
    frame.setVisible(true);
  }
}
