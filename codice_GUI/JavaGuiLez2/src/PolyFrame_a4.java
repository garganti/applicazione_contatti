

import java.awt.*;
import javax.swing.*;

//Questo esempio mostra come tracciare curve complesse con molti colori
public class PolyFrame_a4 extends JFrame
{
  public PolyFrame_a4()
  {
    setTitle("un disegno");
    setSize(800,500);
    setLocation(50,50);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    Container contentPane=getContentPane();
    contentPane.add(new PolyPanel_a4());
  }

  public static void main(String[] args)
  {
    JFrame frame=new PolyFrame_a4();
    frame.setVisible(true);
  }
}

class PolyPanel_a4 extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    Dimension dimensioniPanel=getSize();

    //Disegnero' 12 rosette di forma, colore e posizione random
    for (int nRose=0;nRose<12;nRose++)
    {
      //Scelgo i parametri per il disegno
      g.setColor(new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256)));
      int numeroInterno=(int)(Math.random()*10);
      int numeroEsterno=(int)(Math.random()*20);
      int offsetX=(int)(dimensioniPanel.width*Math.random());
      int offsetY=(int)(dimensioniPanel.height*Math.random());

      //Calcolo delle coordinate dei punti che compongono la rosetta
      //(la compresione di questo blocco di codice non e' fondamentale)
      int nPunti=(int)(1000*Math.random());
      int[] coordinateX=new int[nPunti];
      int[] coordinateY=new int[nPunti];
      for (int i=0;i<nPunti;i++)
      {
        coordinateX[i]=offsetX+
            (int)(dimensioniPanel.width/8*Math.cos(2*numeroInterno*i*Math.PI/nPunti))+
            (int)(dimensioniPanel.width/12*Math.cos(2*numeroEsterno*i*Math.PI/nPunti));
        coordinateY[i]=offsetY+
            (int)(dimensioniPanel.height/8*Math.sin(2*numeroInterno*i*Math.PI/nPunti))+
            (int)(dimensioniPanel.height/12*Math.sin(2*numeroEsterno*i*Math.PI/nPunti));
      }

      //Uso le coordinate calcolate per disegnare
      g.drawPolygon(coordinateX,coordinateY,nPunti);
    }
  }
}
