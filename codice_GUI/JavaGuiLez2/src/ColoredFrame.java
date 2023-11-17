


import java.awt.*;
import javax.swing.*;


// questo esempio mostra come settare il background di un panel e il suo foreground
// esso inoltre mostra alcune tecniche per creare colori e loro complementari
// e tecniche di definizione di un font e posizionamento di una stringa
public class ColoredFrame extends JFrame
{
  // il costruttore ha bisogno di una stringa per il titolo e messaggio, di un colore per il panel, di un font
  //e di una posizione per la visualizzazione del frame
  public ColoredFrame(String messaggio, Color c, Font f, int posX, int posY)
  {
    setTitle(messaggio);
    setSize(200,200);
    setLocation(posX,posY);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    //le seguenti due righe ottengono il contentPane e vi aggiungono un nuovo pannello della classe primoPanel
    Container contentPane=getContentPane();
    //il colore viene passato al Panel che vado a creare
    contentPane.add(new ColoredPanel(messaggio,c,f));
  }

  public static void main(String[] args)
  {
    Font f=new Font("Dialog",Font.PLAIN,24);
    JFrame frame1=new ColoredFrame("Giallo",Color.yellow,f,100,100);
    JFrame frame2=new ColoredFrame("Ciano",Color.cyan,f,300,100);
    JFrame frame3=new ColoredFrame("Magenta",Color.magenta,f,500,100);
    JFrame frame4=new ColoredFrame("Blu",Color.blue,f,100,300);
    JFrame frame5=new ColoredFrame("Rosso",Color.red,f,300,300);
    JFrame frame6=new ColoredFrame("Verde",Color.green,f,500,300);

    frame1.setVisible(true);
    frame2.setVisible(true);
    frame3.setVisible(true);
    frame4.setVisible(true);
    frame5.setVisible(true);
    frame6.setVisible(true);
  }
}

class ColoredPanel extends JPanel
{
  private Font font;
  private String messaggio;

  public ColoredPanel(String m, Color c, Font f)
  {
    messaggio=m;
    font=f;

    //Imposto il colore di background
    setBackground(c);
    //Calcolo il colore complementare
    Color complemento=new Color(255-c.getRed(),255-c.getGreen(),255-c.getBlue());
    //Imposto il colore di foreground
    setForeground(complemento);
  }

  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    //Imposto il font da usare
    g.setFont(font);

    //Disegno della stringa
    g.drawString(messaggio,20,40);
  }
}
