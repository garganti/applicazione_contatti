package areetesto;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

//Digito in una area di testo.
//I caratteri di cio' che digito vengono contati e visualizzati in 
//un altro pannello.
//In questa versione l'area del testo e' inserita dentro un pannello
//di scorrimento
public class AreaTestoFrame_b1 extends JFrame implements DocumentListener
{
  private JTextArea testo;
  private JTextField caratteri;

  public AreaTestoFrame_b1()
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

    JScrollPane scroll=new JScrollPane(testo);
    //JScrollPane scroll=new JScrollPane(testo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    contentPane.add(scroll,BorderLayout.CENTER);

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
    JFrame frame=new AreaTestoFrame_b1();
    frame.setVisible(true);
  }
}
