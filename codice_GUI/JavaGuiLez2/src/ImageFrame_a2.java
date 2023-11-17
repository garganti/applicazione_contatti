


import java.awt.*;
import javax.swing.*;

//Questo esempio mostra come importare un'immagine
//L'immagine ha dimensioni che si adattano al frame
public class ImageFrame_a2 extends JFrame
{
  public ImageFrame_a2()
  {
    setTitle("un logo");
    setSize(400,400);
    setLocation(300,200);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    Container contentPane=getContentPane();
    contentPane.add(new ImagePanel_a2());
  }

  public static void main(String[] args)
  {
    JFrame frame=new ImageFrame_a2();
    frame.setVisible(true);
  }
}

class ImagePanel_a2 extends JPanel
{
  private Image logo;

  public ImagePanel_a2()
  {
    //Recupero l'immagine tramite il Toolkit
    logo=Toolkit.getDefaultToolkit().getImage("logo.gif");

    //Attendo finche' l'immagine non e' stata completamente caricata
    //(maggiori dettagli nel corso di I&M)
    MediaTracker tracker=new MediaTracker(this);
    tracker.addImage(logo,0);
    try {tracker.waitForID(0);} catch (InterruptedException e) {}
   }

   public void paintComponent(Graphics g)
   {
     super.paintComponent(g);
     Dimension dimPanel=getSize();

     //Disegno l'immagine riscalata nel frame
     g.drawImage(logo,0,0,dimPanel.width,dimPanel.height,this);
   }
 }
