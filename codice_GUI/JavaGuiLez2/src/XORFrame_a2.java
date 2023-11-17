
import java.awt.*;
import javax.swing.*;

//questo esempio mostra come disegnare in modalita' XOR rettangoli casuali.
//Il codice e' molto intuitivo
public class XORFrame_a2 extends JFrame
{
  public XORFrame_a2()
  {
    setTitle("un disegno");
    setSize(400,400);
    setLocation(300,200);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    Container contentPane=getContentPane();
    contentPane.add(new XORPanel_a2());
  }

  public static void main(String[] args)
  {
    JFrame frame=new XORFrame_a2();
    frame.setVisible(true);
  }
}

class XORPanel_a2 extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    Dimension dimensioniPanel=getSize();

    for (int i=0;i<30;i++)
    {
      int posX=(int)(Math.random()*dimensioniPanel.width);
      int posY=(int)(Math.random()*dimensioniPanel.height);

      int larg=(int)(Math.random()*(dimensioniPanel.width-posX));
      int alt=(int)(Math.random()*(dimensioniPanel.height-posY));

      //Imposto la modalita' XOR
      g.setXORMode(new Color((float)Math.random(),(float)Math.random(),(float)Math.random()));

      g.fillRect(posX,posY,larg,alt);
    }
  }
}
