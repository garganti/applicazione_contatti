
import java.awt.*;
import javax.swing.*;

//Questo esempio mostra come disegnare rettangoli, rettangoli arrotondati ed ellissi
public class RectEllipseFrame_b1 extends JFrame
{
  public RectEllipseFrame_b1()
  {
    setTitle("un disegno");
    setSize(800,500);
    setLocation(50,50);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    Container contentPane=getContentPane();
    contentPane.add(new RectEllipsePanel_b1());
  }

  public static void main(String[] args)
  {
    JFrame frame=new RectEllipseFrame_b1();
    frame.setVisible(true);
  }
}

class RectEllipsePanel_b1 extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    Dimension dimensioniPanel=getSize();

    /*
      nel primo terzo di pannello disegno dieci rettangoli concentrici
      nel secondo terzo di pannello disegno dieci ellissi concentriche
      nel terzo terzo di pannello disegno dieci rettangoli arrotondati concentrici
     */
    for (int i=0; i<10; i++)
    {
      g.setColor(new Color((float)Math.random(),(float)Math.random(),(float)Math.random()));

      g.fillRect(5*i,5*i,
                 dimensioniPanel.width/3-10*i,dimensioniPanel.height-10*i);

      g.fillOval(dimensioniPanel.width/3+5*i,5*i,
                 dimensioniPanel.width/3-10*i,dimensioniPanel.height-10*i);

      g.fillRoundRect(2*dimensioniPanel.width/3+5*i,5*i,
                      dimensioniPanel.width/3-10*i,dimensioniPanel.height-10*i,
                      80,40);
    }
  }
}
