package areetesto;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

//Digito in una area di testo.
//I caratteri di cio' che digito vengono contati e 
//visualizzati in un altro pannello
public class AreaTestoFrame_a1 extends JFrame implements DocumentListener
{
  private JTextArea testo;
  private JTextField caratteri;

  public AreaTestoFrame_a1()
  {
    setTitle("demo casella di testo");
    setSize(300,200);
    setLocation(300,200);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    Container contentPane=getContentPane();

    testo=new JTextArea();
    testo.setLineWrap(true);
    testo.setWrapStyleWord(true);
    testo.getDocument().addDocumentListener(this);
    contentPane.add(testo,BorderLayout.CENTER);

    caratteri=new JTextField();
    contentPane.add(caratteri,BorderLayout.SOUTH);
  }

  public void insertUpdate(DocumentEvent e)
  {
    int lunghezza=testo.getText().length();
    caratteri.setText("ci sono "+lunghezza+ " caratteri");
  }

  public void removeUpdate(DocumentEvent e)
  {
    int lunghezza=testo.getText().length();
    caratteri.setText("ci sono "+lunghezza+ " caratteri");
  }

  public void changedUpdate(DocumentEvent e)
  {
    int lunghezza=testo.getText().length();
    caratteri.setText("ci sono "+lunghezza+ " caratteri");
  }

  public static void main(String[] args)
  {
    JFrame frame=new AreaTestoFrame_a1();
    frame.setVisible(true);
  }
}
