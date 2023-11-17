package layout;

import java.awt.*;
import javax.swing.*;

//Questo esempio mostra un OverlayLayout all'opera
public class LayoutOverlayFrame extends JFrame
{
  public LayoutOverlayFrame()
  {
    setTitle("OverlayLayout all'opera");
    setSize(300,400);
    setLocation(300,200);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    OverlayLayout overlay=new OverlayLayout(getContentPane());
    getContentPane().setLayout(overlay);

    JPanel panel1=new JPanel(new BorderLayout());
    panel1.add(new JButton("N"),BorderLayout.NORTH);
    panel1.add(new JButton("S"),BorderLayout.SOUTH);
    panel1.add(new JButton("E"),BorderLayout.EAST);
    panel1.add(new JButton("W"),BorderLayout.WEST);
    getContentPane().add(panel1);

    JPanel panel2=new JPanel(new FlowLayout(FlowLayout.CENTER,30,30));
    panel2.add(new JButton("A"));
    panel2.add(new JButton("B"));
    panel2.add(new JButton("C"));
    getContentPane().add(panel2);

  }

  public static void main(String[] args)
  {
    JFrame frame=new LayoutOverlayFrame();
    frame.setVisible(true);
  }
}
