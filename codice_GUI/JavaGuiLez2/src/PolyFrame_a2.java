

import java.awt.*;
import javax.swing.*;

//Questo esempio mostra come tracciare una stella
public class PolyFrame_a2 extends JFrame
{
  public PolyFrame_a2()
  {
    setTitle("un disegno");
    setSize(800,500);
    setLocation(50,50);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    Container contentPane=getContentPane();
    contentPane.add(new PolyPanel_a2());
  }

  public static void main(String[] args)
  {
    JFrame frame=new PolyFrame_a2();
    frame.setVisible(true);
  }
}

class PolyPanel_a2 extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    //Creo un poligono
    Polygon p=new Polygon();
    int n=88;
    double teta=0;
    double incremento=2*Math.PI/n;

    //ciclo sui punti e creo un effetto stella
    for (int i=0;i<n;i++)
    {
      p.addPoint(160+(int)((i%2*50+100)*Math.cos(teta)),
                 160+(int)((i%2*50+100)*Math.sin(teta)));
      teta+=incremento;
    }

    //disegno il poligono
    g.drawPolygon(p);
  }
}
