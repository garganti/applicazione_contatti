package dialoghi;
import javax.swing.*;
import java.awt.*;

/*
Questo esempio mostra tutte le caratteristiche del JFileChooser
e dimostra il suo funzionamento aprendo un file di testo
*/
public class FileChooserApp_a1
{
  public static void main(String[] args)
  {
    JFrame f=new JFrame();
    JTextArea area=new JTextArea();
    JButton apri=new JButton("Apri");
    JPanel panel=new JPanel();
    panel.add(apri);
    f.getContentPane().add(new JScrollPane(area),BorderLayout.CENTER);
    f.getContentPane().add(panel,BorderLayout.SOUTH);
    apri.addActionListener(new OpenListener(area,new JFileChooser())); //La classe OpenListener e' definita in un'altro file
    f.setSize(600,600);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }
}
