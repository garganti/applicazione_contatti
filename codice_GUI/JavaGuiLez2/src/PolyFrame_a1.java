
import java.awt.*;
import javax.swing.*;

//Questo esempio mostra come tracciare poligoni e poligonali
public class PolyFrame_a1 extends JFrame
{
  public PolyFrame_a1()
  {
    setTitle("un disegno");
    setSize(800,500);
    setLocation(50,50);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    Container contentPane=getContentPane();
    contentPane.add(new PolyPanel_a1());
  }

  public static void main(String[] args)
  {
    JFrame frame=new PolyFrame_a1();
    frame.setVisible(true);
  }
}

class PolyPanel_a1 extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    //Creo un poligono ed aggiungo i suoi vertici
    Polygon p=new Polygon();
    p.addPoint(100,110);
    p.addPoint(300,100);
    p.addPoint(300,300);
    p.addPoint(100,300);
    g.drawPolygon(p);

    //Creo due array di vertici e disegno una poligonale
    int[] xCoord={500,700,700,500};
    int[] yCoord={100,100,300,300};
    g.drawPolyline(xCoord,yCoord,4);
  }
}
