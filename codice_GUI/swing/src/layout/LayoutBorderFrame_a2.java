package layout;

import java.awt.*;
import javax.swing.*;

//Questo esempio mostra un mix di Flow e Border
public class LayoutBorderFrame_a2 extends JFrame
{
  public LayoutBorderFrame_a2()
  {
    setTitle("Layout vari all'opera");
    setSize(600, 450);
    setLocation(30,20);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    JPanel A, B, C, D, E;

    A=new JPanel();
    A.setBackground(Color.red);

    B=new JPanel();
    B.setBackground(Color.blue);

    C=new JPanel();
    C.setBackground(Color.green);

    D=new JPanel();
    D.setBackground(Color.yellow);

    E=new JPanel();
    E.setBackground(Color.magenta);

    A.setLayout(new BorderLayout());
    A.add(new JButton("a1"),BorderLayout.WEST);
    A.add(new JButton("a2"),BorderLayout.CENTER);
    A.add(new JButton("a3"),BorderLayout.EAST);

    B.setLayout(new BorderLayout(10,10));
    B.add(new JButton("bottone 1"),BorderLayout.NORTH);
    B.add(new JButton("bottone 2"),BorderLayout.CENTER);
    B.add(new JButton("bottone 3"),BorderLayout.SOUTH);

    C.setLayout(new BorderLayout());
    C.add(new JButton("c1"),BorderLayout.WEST);
    C.add(new JButton("c2"),BorderLayout.CENTER);
    C.add(new JButton("c3"),BorderLayout.EAST);

    D.add(new JButton("d1"));
    D.add(new JButton("d2"));
    D.add(new JButton("d3"));
    D.add(new JButton("d4"));

    E.setLayout(new BorderLayout(25,25));
    E.add(new JButton("primo bottone e"),BorderLayout.NORTH);
    E.add(new JButton("secondo bottone e"),BorderLayout.SOUTH);

    Container contentPane=getContentPane();
    contentPane.add(A,BorderLayout.NORTH);
    contentPane.add(B,BorderLayout.SOUTH);
    contentPane.add(C,BorderLayout.EAST);
    contentPane.add(D,BorderLayout.WEST);
    contentPane.add(E,BorderLayout.CENTER);
  }

  public static void main(String[] args)
  {
    JFrame frame=new LayoutBorderFrame_a2();
    frame.setVisible(true);
  }
}
