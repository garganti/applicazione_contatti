package layout;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//Questo esempio mostra un FlowLayout all'opera.
//Ogni volta che sulla tastiera schiaccio il carattere 
//'b' si aggiunge un nuovo bottone
public class LayoutFlowFrame_a1 extends JFrame implements KeyListener
{
  private JPanel pannelloBottoni;
  private int contatoreBottoni=0;

  public LayoutFlowFrame_a1()
  {
    setTitle("FlowLayout all'opera");
    setSize(300,400);
    setLocation(300,200);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    addKeyListener(this);
    Container contentPane=getContentPane();
    pannelloBottoni=new JPanel();
    //pannelloBottoni.setLayout(new FlowLayout(FlowLayout.LEFT));
    //pannelloBottoni.setLayout(new FlowLayout(FlowLayout.RIGHT));
    //pannelloBottoni.setLayout(new FlowLayout(FlowLayout.LEFT,50,50));
    contentPane.add(pannelloBottoni);
  }

  public void keyPressed(KeyEvent k) {}
  public void keyReleased(KeyEvent k) {}

  public void keyTyped(KeyEvent k)
  {
    char carattere=k.getKeyChar();
    if (carattere=='b')
    {
      contatoreBottoni++;
      aggiungiBottone();
    }
  }

  private void aggiungiBottone()
  {
    JButton bottone=new JButton("bottone n."+contatoreBottoni);
    pannelloBottoni.add(bottone);
    pannelloBottoni.validate(); //Indispensabile all'aggiornamento 
    //del layout, chiama da solo il repaint
  }

  public static void main(String[] args)
  {
    JFrame frame=new LayoutFlowFrame_a1();
    frame.setVisible(true);
  }
}
