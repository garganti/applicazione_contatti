import java.awt.*;
import javax.swing.*;


//Questo esempio mostra come tracciare linee e punti isolati
public class LinesFrame extends JFrame
{
  public LinesFrame()
  {
    setTitle("un disegno");
    setSize(400,200);
    setLocation(300,200);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    Container contentPane=getContentPane();
    contentPane.add(new LinesPanel());
  }

  public static void main(String[] args)
  {
    JFrame frame=new LinesFrame();
    frame.setVisible(true);
  }
}

class LinesPanel extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    //Recupero le dimensioni del pannello
    Dimension dimensioniPanel=getSize();

    //Disegno una grande X sul frame
    g.drawLine(0,0,dimensioniPanel.width,dimensioniPanel.height);
    g.drawLine(dimensioniPanel.width,0,0,dimensioniPanel.height);

    //Disegno dieci piccoli punti casuali
    for (int i=0;i<10;i++)
    {
      int x=(int)(Math.random()*dimensioniPanel.width);
      int y=(int)(Math.random()*dimensioniPanel.height);
      g.drawLine(x,y,x,y);
    }
  }
}
