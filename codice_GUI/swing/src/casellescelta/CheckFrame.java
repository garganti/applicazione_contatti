package casellescelta;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//Questo esempio mostra come utilizzare le checkbox
public class CheckFrame extends JFrame
{
  public CheckFrame()
  {
    setTitle("disegno poligoni regolari");
    setSize(500,500);
    setLocation(30,20);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    Container contentPane=getContentPane();
    contentPane.add(new CheckPanel(),BorderLayout.CENTER);
  }

  public static void main(String[] args)
  {
    JFrame frame=new CheckFrame();
    frame.setVisible(true);
  }
}

class CheckPanel extends JPanel implements ActionListener
{
  private JCheckBox lati4,lati8,lati16;
  private PoligonoPanel disegno;

  public CheckPanel()
  {
    setLayout(new BorderLayout());

    //Creo i pannelli che comporranno il pannello
    JPanel pulsanti=new JPanel();
    disegno=new PoligonoPanel(true,true,true);

    //Creo le checkbox
    lati4=new JCheckBox("quadrato",true);
    lati8=new JCheckBox("ottagono",true);
    lati16=new JCheckBox("16-gono",true);

    //Aggiungo il listener
    lati4.addActionListener(this);
    lati8.addActionListener(this);
    lati16.addActionListener(this);

    //Aggiungo i checkbox al pannello dei pulsanti
    pulsanti.add(lati4);
    pulsanti.add(lati8);
    pulsanti.add(lati16);

    //Aggiungo i pannelli al pannello principale
    add(pulsanti,BorderLayout.SOUTH);
    add(disegno,BorderLayout.CENTER);
  }

  public void actionPerformed(ActionEvent e)
  {
    //Debbo controllare lo stato della scelta delle opzioni
    //ed agire di conseguenza
    disegno.traccio4=lati4.isSelected();
    disegno.traccio8=lati8.isSelected();
    disegno.traccio16=lati16.isSelected();
    disegno.repaint();
  }
}

class PoligonoPanel extends JPanel
{
  public boolean traccio4, traccio8, traccio16;

  public PoligonoPanel(boolean t4, boolean t8, boolean t16)
  {
    traccio4=t4;
    traccio8=t8;
    traccio16=t16;
  }

  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    setBackground(Color.white);

    Dimension d=getSize();
    int raggio=((d.width>d.height)?(d.height)/2:(d.width)/2)-10; // scelgo il raggio
    g.drawOval((d.width-2*raggio)/2,(d.height-2*raggio)/2,2*raggio,2*raggio);
    int centroX=(d.width-2*raggio)/2+raggio;
    int centroY=(d.height-2*raggio)/2+raggio;

    if (traccio4)
    {
      g.setColor(Color.green);
      Polygon p=this.creaPoligono(centroX,centroY,raggio,4);
      g.drawPolygon(p);
    }

    if (traccio8)
    {
      g.setColor(Color.red);
      Polygon p=this.creaPoligono(centroX,centroY,raggio,8);
      g.drawPolygon(p);
    }

    if (traccio16)
    {
      g.setColor(Color.magenta);
      Polygon p=this.creaPoligono(centroX,centroY,raggio,16);
      g.drawPolygon(p);
    }
  }

  private Polygon creaPoligono(int x, int y, int raggio, int lati)
  {
    int[] xCoord=new int[lati];
    int[] yCoord=new int[lati];
    for (int i=0;i<lati;i++)
    {
      double angolo=2*Math.PI/lati*i;
      xCoord[i]=x+(int)(raggio*Math.cos(angolo));
      yCoord[i]=y+(int)(raggio*Math.sin(angolo));
    }

    return new Polygon(xCoord,yCoord,lati);
  }
}
