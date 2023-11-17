
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//Questo esempio mostra come un Frame registra gli eventi del mouse.
//L'output viene inviato al pannello
public class EcoMouseFrame_a2 extends JFrame
{
  public EcoMouseFrame_a2()
  {
    setTitle("frame per vedere gli eventi mouse");
    setSize(500,500);
    setLocation(300,200);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    Container contentPane=getContentPane();
    EcoMousePanel_a2 pannello=new EcoMousePanel_a2();
    contentPane.add(pannello);
  }

  public static void main(String[] args)
  {
    JFrame frame=new EcoMouseFrame_a2();
    frame.setVisible(true);
  }
}

class EcoMousePanel_a2 extends JPanel implements MouseListener
{
  private int x1=-1,y1=-1,x2,y2;

  public EcoMousePanel_a2()
  {
    addMouseListener(this); //Il pannello ascolta se stesso
    setBackground(Color.white);
    setForeground(Color.black);
  }

  public void mouseClicked(MouseEvent e)
  {
    if ((x1==-1)&&(y1==-1))  //Se sono all'inizio della fase di disegno
    {
      x1=e.getX();
      y1=e.getY();
    }
    else //Se sto procedendo tracciando la spezzata
    {
      x2=e.getX();
      y2=e.getY();
      //Ricavo un contesto grafico
      Graphics g=getGraphics();

      if (e.getButton()==1) g.setColor(Color.blue);
      else g.setColor(Color.red);
      g.drawLine(x1,y1,x2,y2);
      g.dispose(); //Altrimenti mi ritroverei con troppi contesti grafici
      x1=x2;
      y1=y2;
    }
  }

  public void mouseEntered(MouseEvent e) {}
  public void mouseExited(MouseEvent e) {}
  public void mousePressed(MouseEvent e) {}
  public void mouseReleased(MouseEvent e) {}
}
