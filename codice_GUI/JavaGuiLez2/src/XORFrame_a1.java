

import java.awt.*;
import javax.swing.*;

//Questo esempio mostra come disegnare in modalita' XOR.
//Il codice e' molto intuitivo
public class XORFrame_a1 extends JFrame
{
  public XORFrame_a1()
  {
    setTitle("un disegno");
    setSize(400,400);
    setLocation(300,200);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    Container contentPane=getContentPane();
    contentPane.add(new XORPanel_a1());
  }

  public static void main(String[] args)
  {
    JFrame frame=new XORFrame_a1();
    frame.setVisible(true);
  }
}

class XORPanel_a1 extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    g.setColor(Color.blue);

    Dimension dimensioniPanel=getSize();

    g.fillRect(20,20,dimensioniPanel.width-40,dimensioniPanel.height-40);

    //Imposto la modalita' XOR
    g.setXORMode(Color.red);

    g.fillRect(40,0,dimensioniPanel.width-80,dimensioniPanel.height);
  }
}
