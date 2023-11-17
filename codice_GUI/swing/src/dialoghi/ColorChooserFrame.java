package dialoghi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Questo esempio mostra il classico modo di utilizzo del JColorChooser

/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class ColorChooserFrame extends JFrame implements ActionListener
{



  private JLabel label=new JLabel();

  public ColorChooserFrame()
  {
    setTitle("Colore in azione");
    setSize(600,600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    label.setBackground(Color.black);
    label.setOpaque(true);
    JButton colore=new JButton("Colore");
    JPanel panel=new JPanel();
    panel.add(colore);
    colore.setText("Colour");

    Container container=getContentPane();
    container.add(label,BorderLayout.CENTER);
    container.add(panel,BorderLayout.SOUTH);

    colore.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e)
  {
    //Visualizzo la finestra di selezione del colore
    Color c=JColorChooser.showDialog(this,"Selezionare un colore",label.getBackground());
    if (c!=null) label.setBackground(c);
  }

  public static void main(String[] a)
  {
    ColorChooserFrame f=new ColorChooserFrame();
    f.setVisible(true);
    f.setSize(249, 91);
  }
}