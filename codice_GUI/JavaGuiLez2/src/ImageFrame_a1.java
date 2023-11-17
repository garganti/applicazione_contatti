

import java.awt.*;
import javax.swing.*;

//Questo esempio mostra come importare un'immagine
//L'immmagine mantiene dimensioni fisse
public class ImageFrame_a1 extends JFrame
{
  public ImageFrame_a1()
  {
    setTitle("un logo");
    setSize(400,400);
    setLocation(300,200);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    Container contentPane=getContentPane();
    contentPane.add(new ImagePanel_a1());
  }

  public static void main(String[] args)
  {
    JFrame frame=new ImageFrame_a1();
    frame.setVisible(true);
  }
}

class ImagePanel_a1 extends JPanel
{
  private Image logo;

  public ImagePanel_a1()
  {
    //Recupero l'immagine tramite il Toolkit
    logo=Toolkit.getDefaultToolkit().getImage("logo.gif");

    //Attendo finche' l'immagine non e' stata completamente caricata
    MediaTracker tracker=new MediaTracker(this);
    tracker.addImage(logo,0);
    try {tracker.waitForID(0);} catch (InterruptedException e) {}
   }

   public void paintComponent(Graphics g)
   {
     super.paintComponent(g);

     //Disegno l'immagine a dimensioni fisse
     g.drawImage(logo,20,20,this);
   }
 }
