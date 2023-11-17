package layout;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//Questo esempio mostra un CardLayout all'opera
public class LayoutCardFrame extends JFrame implements ActionListener
{
  private JPanel panel=new JPanel();
  private JPanel panelButton=new JPanel();
  private CardLayout card=new CardLayout();

  public LayoutCardFrame()
  {
    setTitle("CardLayout all'opera");
    setSize(300,400);
    setLocation(300,200);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    getContentPane().add(panel,BorderLayout.CENTER);
    getContentPane().add(panelButton,BorderLayout.NORTH);
    panel.setLayout(card);

    for (int i=0;i<3;i++)
    {
      JPanel p=new JPanel();
      p.setBackground(new Color(35*i%256,175*i%256,130*i%256));
      panel.add(p,""+i);

      JButton b=new JButton(""+i);
      panelButton.add(b);
      b.addActionListener(this);
    }
  }

  public void actionPerformed(ActionEvent e)
  {
    JButton b=(JButton)e.getSource();
    String str=b.getText();
    //Visualizzo un pannello in base alla sua stringa di riferimento
    card.show(panel,str);
  }

  public static void main(String[] args)
  {
    JFrame frame=new LayoutCardFrame();
    frame.setVisible(true);
  }
}
