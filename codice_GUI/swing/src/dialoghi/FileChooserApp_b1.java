package dialoghi;

import javax.swing.*;
import java.awt.*;

/*
Questo esempio abilita la visualizzazione solo di alcuni
tipi di file nel JFileChooser
*/
public class FileChooserApp_b1
{
  public static void main(String[] args)
  {
    //Creo il JFileChooser
    JFileChooser fileChooser=new JFileChooser();
    //Disabilito al visualizzazione di tutti i tipi di file
    fileChooser.setAcceptAllFileFilterUsed(false);
    //Abilito la visualizzazione dei file di tipo TXT
    fileChooser.setFileFilter(new TXTFilter()); //La classe TXTFilter e' definita in un'altro file

    JFrame f=new JFrame();
    JTextArea area=new JTextArea();
    JButton apri=new JButton("Apri");
    JPanel panel=new JPanel();
    panel.add(apri);
    f.getContentPane().add(new JScrollPane(area),BorderLayout.CENTER);
    f.getContentPane().add(panel,BorderLayout.SOUTH);
    apri.addActionListener(new OpenListener(area,fileChooser)); //La classe OpenListener e' definita in un'altro file
    f.setSize(600,600);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }
}
