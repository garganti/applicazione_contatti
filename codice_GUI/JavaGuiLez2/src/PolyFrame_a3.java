

import java.awt.*;
import javax.swing.*;

//Questo esempio mostra come tracciare curve complesse come una rosetta
public class PolyFrame_a3 extends JFrame
{
  public PolyFrame_a3()
  {
    setTitle("un disegno");
    setSize(800,500);
    setLocation(50,50);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    Container contentPane=getContentPane();
    contentPane.add(new PolyPanel_a3());
  }

  public static void main(String[] args)
  {
    JFrame frame=new PolyFrame_a3();
    frame.setVisible(true);
  }
}

class PolyPanel_a3 extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    Dimension dimensioniPanel=getSize();

    //Valori per controllare la forma della rosetta
    int numeroInterno=7, numeroEsterno=51;

    //Coordinate dei punti che compongono la rosetta
    int Npunti=1000;
    int[] coordinateX=new int[Npunti];
    int[] coordinateY=new int[Npunti];

    //Calcolo le coordinate
    //(la comprensione di questo codice non e' fondamentale)
    for (int i=0;i<Npunti;i++)
    {
      coordinateX[i]=dimensioniPanel.width/2+
          (int)(dimensioniPanel.width/8*Math.cos(2*numeroInterno*i*Math.PI/Npunti))+
          (int)(dimensioniPanel.width/12*Math.cos(2*numeroEsterno*i*Math.PI/Npunti));
      coordinateY[i]=dimensioniPanel.height/2+
          (int)(dimensioniPanel.height/8*Math.sin(2*numeroInterno*i*Math.PI/Npunti))+
          (int)(dimensioniPanel.height/12*Math.sin(2*numeroEsterno*i*Math.PI/Npunti));
    }

    //Uso le coordinate calcolate per disegnare
    g.drawPolyline(coordinateX,coordinateY,coordinateX.length);
  }
}
