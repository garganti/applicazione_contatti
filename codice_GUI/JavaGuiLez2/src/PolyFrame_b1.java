

import java.awt.*;
import javax.swing.*;

//Questo esempio mostra come creare un semplice pacman ed una spirale
public class PolyFrame_b1 extends JFrame
{
  public PolyFrame_b1()
  {
    setTitle("un disegno");
    setSize(800,500);
    setLocation(50,50);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    Container contentPane=getContentPane();
    contentPane.add(new PolyPanel_b1());
  }

  public static void main(String[] args)
  {
    JFrame frame=new PolyFrame_b1();
    frame.setVisible(true);
  }
}

class PolyPanel_b1 extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    int r=40; //Raggio del cerchio di PacMan
    int cx=50; //Centro del cerchio
    int cy=100;
    int angle=30;//Angolo di apertura della bocca

    g.fillArc(cx-r,cy-r,2*r,2*r,angle,360-2*angle);

    //Creo un poligono
    Polygon s=new Polygon();
    cx=250;

    //Imposto i punti per la spirale
    for (int i=0;i<360;i++)
    {
      double t=i/360.0;
      s.addPoint(
          (int)(cx+r*t*Math.cos(8*t*Math.PI)),
          (int)(cy+r*t*Math.sin(8*t*Math.PI)));
    }

    //Disegno la spirale
    g.fillPolygon(s);
  }
 }
