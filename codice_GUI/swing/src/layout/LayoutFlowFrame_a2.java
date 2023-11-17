package layout;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//Questo esempio mostra un FlowLayout all'opera
//Ogni volta che sulla tastiera schiaccio il carattere 
//'p' si aggiunge un nuovo pannello colorato
public class LayoutFlowFrame_a2 extends JFrame implements KeyListener
{
  private JPanel pannelloBottoni;
  private int contatoreBottoni=0;

  public LayoutFlowFrame_a2()
  {
    setTitle("FlowLayout all'opera");
    setSize(300,400);
    setLocation(300,200);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    addKeyListener(this);
    Container contentPane=getContentPane();
    pannelloBottoni=new JPanel();
    contentPane.add(pannelloBottoni);
  }

  public void keyPressed(KeyEvent k) {}
  public void keyReleased(KeyEvent k) {}

  public void keyTyped(KeyEvent k)
  {
    char carattere=k.getKeyChar();
    if (carattere=='p')
    {
      contatoreBottoni++;
      aggiungiPannello();
    }
  }

  private void aggiungiPannello()
  {
    JPanel pannello=new JPanel();
    pannello.setPreferredSize(new Dimension((int)(Math.random()*100)+10,(int)(Math.random()*100)+10));
    pannello.setBackground(new Color((float)Math.random(),(float)Math.random(),(float)Math.random()));
    pannelloBottoni.add(pannello);
    pannelloBottoni.validate(); //Indispensabile all'aggiornamento del layout, chiama da solo il repaint
  }

  public static void main(String[] args)
  {
    JFrame frame=new LayoutFlowFrame_a2();
    frame.setVisible(true);
  }
}
